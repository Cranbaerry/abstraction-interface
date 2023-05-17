package models.skills;

import abstracts.Entity;
import abstracts.Skill;

public class Waterbolt extends Skill {
	public Waterbolt(String skillName, int skillDamage, int skillManaCost) {
		this.setName(skillName);
		this.setSkillDamage(skillDamage);
		this.setSkillManaCost(skillManaCost);
	}
	
	public void useSkill(Entity player, Entity monster) {
		System.out.println(player.getName() + " used " + this.getName() + " on " + monster.getName() + "! It deals " + this.getSkillDamage() + " damage.");
		monster.setHP(monster.getHP() - this.getSkillDamage());
		player.setMP(player.getMP() - this.getSkillManaCost());
		
		// Additional skill effect
		monster.setHP(player.getHP() + 5);
		System.out.println("5 extra damage is applied to" + this.getName() + "!");
	}
}
