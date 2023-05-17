

import models.Monster;
import models.Player;
import models.items.Potion;
import models.items.Sunglasses;
import models.skills.Fireball;
import models.skills.Waterbolt;

import java.util.Random;
import java.util.Scanner;

import abstracts.Skill;
import interfaces.Item;

public class App {
    
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        // Initialize monsters(name, hp, mp)
        Monster monsters[] = new Monster[3];
        monsters[0] = new Monster("Slime", 50, 100);
        monsters[1] = new Monster("Goblin", 200, 500);
        monsters[2] = new Monster("Dragon", 6969, 5000);

        // Initialize items
        Item items[] = new Item[2];
        items[0] = new Potion();
        items[1] = new Sunglasses();

        // Initialize Skills(skillDamage, skillManaCost)
        Skill skills[] = new Skill[2];
        skills[0] = new Fireball(20, 10);
        skills[1] = new Waterbolt(40, 20);

        // Initialize player
        System.out.println("Greetings, traveler!");
        System.out.print("What is your name?: ");
        Player player = new Player(scanner.nextLine());
        System.out.println("\nWelcome, " + player.getName() + "!");

        // Main game loop
        while (true) {
            System.out.println("1. Fight a monster");
            System.out.println("2. View your stats and skills");
            System.out.println("3. Exit the game");
            System.out.print("Choose an option: ");
            switch (scanner.nextInt()) {
                case 1:
                    // Spawn a random monster
                    Monster monster = getRandomMonster(monsters);
                    System.out.println("You encountered a " + monster.getName() + "!");
                    fight(player, monster, items, skills);
                    break;
                case 2:
                    player.viewStats();
                    break;
                case 3:
                    scanner.close();
                    break;
                default:
                    System.out.println("Unknown input.");
            }
        }
    }

    public static void fight(Player player, Monster monster, Item[] items, Skill[] skills) {
        while (monster.getHP() > 0) {
            System.out.println("1. Attack");
            System.out.println("2. Cast a spell");
            System.out.println("3. Use an item");
            System.out.println("4. Run away");
            System.out.print("Choose an option: ");
            switch (scanner.nextInt()) {
                case 1:
                    // Attack
                    player.attack(monster);
                    break;
                case 2:
                    // Use skills
                    System.out.println("1. " + skills[0].getName());
                    System.out.println("2. " + skills[1].getName());
                    System.out.print("Choose an option: ");
                    switch (scanner.nextInt()) {
                        case 1:
                            player.castSpell(monster, skills[0]);
                            break;
                        case 2:
                            player.castSpell(monster, skills[1]);
                            break;
                        default:
                            System.out.println("Unknown input.");
                    }
                    break;
                case 3:
                    // Use items
                    System.out.println("1. " + items[0].getName());
                    System.out.println("2. " + items[1].getName());
                    System.out.print("Choose an option: ");
                    switch (scanner.nextInt()) {
                        case 1:
                            items[0].useItem(player);
                            break;
                        case 2:
                            items[1].useItem(player);
                            break;
                        default:
                            System.out.println("Unknown input.");
                    }
                    break;
                case 4:
                    // Run away
                    System.out.println("You ran away!");
                    return;
                default:
                    System.out.println("Unknown input.");
            }
            
            // Monster attacks if it's still alive
            if (monster.getHP() > 0) {
                monster.attack(player);
                // Randomly use a skill with 50% chance
                if (new Random().nextInt(2) == 1) {
                    monster.castSpell(player, getRandomSkill(skills));
                }
            }

            // Displays player and monster stats
            player.viewStats();
            System.out.print("\n");
            monster.viewStats();
        }
    }

    public static Monster getRandomMonster(Monster[] monsters) {
        int rnd = new Random().nextInt(monsters.length);
        return monsters[rnd];
    }

    public static Item getRandomItem(Item[] items) {
        int rnd = new Random().nextInt(items.length);
        return items[rnd];
    }

    public static Skill getRandomSkill(Skill[] skills) {
        int rnd = new Random().nextInt(skills.length);
        return skills[rnd];
    }
}
