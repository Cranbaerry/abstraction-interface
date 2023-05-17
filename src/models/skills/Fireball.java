package models.skills;

import abstracts.Entity;
import abstracts.Skill;

public class Fireball extends Skill {
	public Fireball(String skillName, int skillDamage, int skillManaCost) {
		this.setName(skillName);
		this.setSkillDamage(skillDamage);
		this.setSkillManaCost(skillManaCost);
	}
	
	public void useSkill(Entity player, Entity monster) {
		System.out.println(player.getName() + " used " + this.getName() + " on " + monster.getName() + "! It deals " + this.getSkillDamage() + " damage.");
		monster.setHP(monster.getHP() - this.getSkillDamage());
		player.setMP(player.getMP() - this.getSkillManaCost());
		
		// Additional skill effect
		player.setHP(player.getHP() + 5);
		System.out.println("Lifesteal effect applied! " + this.getName() + " gained 5 HP!");
	}
}
