package models.items;

import abstracts.Entity;
import interfaces.Item;

public class Sunglasses implements Item {
    String name = "Sunglasses", type = "Accessory";

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }
    
    public void useItem(Entity user) {
        System.out.println("**" + user.getName() + " puts on " + this.name + ".**");
    }
    
}
