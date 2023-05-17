# Java Monster Game

This is a simple text-based game implemented in Java where the player fights against different monsters using skills and items.

## Getting Started

1. Make sure you have Java installed on your machine.
2. Download the latest compiled .JAR file from the release page
3. Run the game with the following command: ```java -jar AdventureWorld.jar```


## Gameplay

1. Upon starting the game, you will be asked to enter your name.
2. The main game loop presents the following options:
- Fight a monster: Engage in a battle with a randomly spawned monster.
- View your stats and skills: Displays the player's current stats and skills.
- Exit the game: Terminates the game.
3. During a battle with a monster, you have the following options:
- Attack: Perform a regular attack on the monster.
- Cast a spell: Use one of the available skills to damage the monster.
- Use an item: Consume a potion or use an accessory item.
- Run away: Escape from the battle.
4. The monster will attack back after each of your actions.
5. The battle continues until either you or the monster's HP reaches zero.
6. If you defeat a monster, you can encounter another one by choosing to fight again.

## Classes and Structure

- `App.java`: The main entry point of the application.
- `Monster.java`: Represents a monster entity with name, HP, and MP. Inherits from the `Entity` abstract class.
- `Player.java`: Represents the player entity with name, HP, and MP. Inherits from the `Entity` abstract class.
- `Entity.java`: An abstract class that defines common properties and behaviors for both players and monsters.
- `Skill.java`: An abstract class that represents a skill. Different skills can be implemented by inheriting from this class.
- `Item.java`: An interface that defines the basic structure for an item, which can be consumed or used by entities.
- `Potion.java`: Implements the `Item` interface and represents a healing potion item.
- `Sunglasses.java`: Implements the `Item` interface and represents an accessory item.
- `Fireball.java`: Extends the `Skill` class and represents a fire-based skill.
- `Waterbolt.java`: Extends the `Skill` class and represents a water-based skill.

## License

This project is licensed under the [MIT License](LICENSE).
