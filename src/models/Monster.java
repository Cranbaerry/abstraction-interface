package models;

import abstracts.Entity;

public class Monster extends Entity {
    public Monster(String name) {
        this.setName(name);
        this.setHP(100);
        this.setMP(100);
    }

	@Override
	public void attack(Entity target) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void castSpell(Entity target) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void takeDamage(int damage) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void heal(int hp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void restoreMana(int mp) {
		// TODO Auto-generated method stub
		
	}
}
