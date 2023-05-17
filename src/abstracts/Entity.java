package abstracts;

/*
 * Abstract classes, unlike interfaces, are classes. 
 * They are more expensive to use because there is a lookup to do when you inherit from them.
 * It can contain methods and fields members like a fully defined class.
 * Methods can be defined with or without implementation; abstract classes cannot be instantiated.
 * Which is why, in this case, we define an abstract entity class that will be the base of our player and monster classes.
 * 
 * Notice that we have an abstract method called attack.
 * This means that every class that extends this abstract class must implement these methods on their own.
 * Player and monster may have different implementation of it. It's up to the classes that extends this abstract class.
 */

public abstract class Entity  {
    private String name, type;
    private int hp, mp;
    Skill[] skills;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
        
    public int getHP() {
        return this.hp;
    }

    public void setHP(int hp) {
        this.hp = hp;
        
        if (this.hp <= 0) {
        	this.die();
        }
    }    

    public int getMP() {
        return this.mp;
    }

    public void setMP(int mp) {
        this.mp = mp;
    }

    public abstract void attack(Entity target);

    public void die() {
        System.out.println(this.name + " has died.");
    }

    public void viewStats() {
		System.out.println(this.getName());
		System.out.println("HP: " + this.getHP());
		System.out.println("MP: " + this.getMP());
	}

	public void castSpell(Entity target, Skill skill) {
        skill.useSkill(this, target); 		
	}
}