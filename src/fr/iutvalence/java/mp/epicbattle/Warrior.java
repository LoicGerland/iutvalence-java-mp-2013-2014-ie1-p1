package fr.iutvalence.java.mp.epicbattle;

/**
 * @author KAYRAK GERLAND
 * The warrior is the one which stands the damage.
 * A player looses when all his warriors are dead.
 */
public class Warrior
{
    /**
    * The strength defines the damage which inflicts the warrior.
    */
    public int strength;
    /**
     * The health points defines the amount of life of the warrior.
    */
    public int hp;
    
    /**
     * The attack is the offensive action which can execute a warrior.
     */
    public Effect attack;

    /**
     * It create a warrior depending of the parameters.
     * @param strength The amount of the strength of the warrior.
     * @param pv The amount of the hp of the warrior.
     * @param attack The amount of the strength of the warrior.
     */
    public Warrior(int strength, int hp, Effect attack )
    {
        this.strength=strength;
        this.hp=hp;
        this.attack=attack;
    }
    
    
}
