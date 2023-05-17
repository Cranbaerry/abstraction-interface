package models;
import abstracts.Skill;
import abstracts.Entity;

public class Player extends Entity {
    public Player(String name) {
        this.setName(name);
        this.setHP(500);
        this.setMP(300);
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

	@Override
	public void attack(Entity target) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void castSpell(Entity target) {
		// TODO Auto-generated method stub
		
	}
}
