package models.items;

import abstracts.Entity;
import interfaces.Item;

public class Potion implements Item {
    String name = "Potion", type = "Consumable";

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }
    
    public void useItem(Entity user) {
        System.out.println("**" + user.getName() + " drinks " + this.name + ".**");
        user.setHP(user.getHP() + 50);
        System.out.println("**" + user.getName() + " recovers 50 HP.**");
    } 
}