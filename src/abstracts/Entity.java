package abstracts;

import interfaces.EntityInterface;

public abstract class Entity implements EntityInterface {
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

    public abstract void castSpell(Entity target);


    public void die() {
        System.out.println(this.name + " has died.");
    }
}