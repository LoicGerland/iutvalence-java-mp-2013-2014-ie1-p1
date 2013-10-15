package fr.iutvalence.java.mp.epicbattle;

/**
 * @author KAYRAK GERLAND
 * The warrior is the one which stands the damage.
 * A player looses when all his warriors are dead.
 */
public class Warrior
{
    // TODO (fix) this field should not be declared as public
    /**
     * The name of the warrior's class. (ex : spearman, wizard)
     */
    public String name; 
    
    // TODO (fix) this field should not be declared as public
    /**
    * The strength defines the damage which inflicts the warrior.
    */
    public int strength;
    
    // TODO (fix) this field should not be declared as public
    /**
     * The health points defines the amount of life of the warrior.
    */
    public int hp;  
    
    // TODO (fix) this field should not be declared as public
    /**
     * The speed of the warrior.
     */
    public int speed; 
    
    // TODO (fix) this field should not be declared as public
    /**
     * The attack is the offensive action which can execute a warrior.
     */
    public Effect attack;

    /**
     * It creates a warrior depending of the parameters.
     * @param name The name of this class.
     * @param strength The amount of the strength of the warrior.
     * @param hp The amount of the hp of the warrior.
     * @param speed His speed
     * @param attack The amount of the strength of the warrior.
     */
    public Warrior(String name, int strength, int hp, int speed,Effect attack )
    {
        this.name=name;
        this.strength=strength;
        this.hp=hp;
        this.speed=speed;
        this.attack=attack;
    }
    
    /**
     * Offensive of the warrior
     * @param battle The battle where the attack is done
     */
    // Later, we will implement a table with multiple attacks.
    public void attack(Battle battle)
    {
        this.attack.application(battle);
    }

    /**
     * The speed of the attack
     * @return the speed of the attack
     */
    public int attackSpeed()
    {
        return this.attack.speed+this.speed;
    }
    
    
}
