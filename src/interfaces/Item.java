package interfaces;

import abstracts.Entity;

/* 
 * An interface is just an empty shell. 
 * There are only the signatures of the methods, which implies that the methods do not have a body. 
 * The interface can't do anything. It's just a pattern.
 * 
 * Essentially, in this case, we define an entity interface that will be the "pattern" of methods a classs should have. 
 * Later, we will implement this interface to our "Sunglasses" and "Potion" class.
 */

public interface Item { 
    String getName();
    String getType();
    void useItem(Entity entity);
}

