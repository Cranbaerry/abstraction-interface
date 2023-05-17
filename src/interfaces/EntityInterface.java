package interfaces;

import abstracts.Entity;

/* 
 * An interface is just an empty shell. 
 * There are only the signatures of the methods, which implies that the methods do not have a body. 
 * The interface can't do anything. It's just a pattern.
 * 
 * Essentially, in this case, we define an entity interface that will be the "pattern" of methods a classs should have. 
 */

public interface EntityInterface { 
    String getName();
    String getType();
    void setHP(int hp);
    void setMP(int mp);
    void attack(Entity target);
    void castSpell(Entity target);
    void takeDamage(int damage);
    void heal(int hp);
    void restoreMana(int mp);
    void die();
    int getHP();
    int getMP();
}

