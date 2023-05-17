package models;
import abstracts.Entity;
import abstracts.Skill;

public class Player extends Entity {
    public Player(String name) {
        this.setName(name);
        this.setHP(500);
        this.setMP(300);
    }

	@Override
	public void attack(Entity target) {
		// Randomize damage between 10-20
		int damage = (int) (Math.random() * 10) + 10;
		target.setHP(target.getHP() - damage);
		System.out.println(this.getName() + " attacks " + target.getName() + " for " + damage + " damage.");
	}
}
