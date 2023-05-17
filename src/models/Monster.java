package models;

import abstracts.Entity;

public class Monster extends Entity {
    public Monster(String name, int hp, int mp) {
        this.setName(name);
        this.setHP(hp);
        this.setMP(mp);
    }

	@Override
	public void attack(Entity target) {
		target.setHP(target.getHP() - 50);
		System.out.println(this.getName() + " attacks " + target.getName() + " for 50 damage.");
	}
}
