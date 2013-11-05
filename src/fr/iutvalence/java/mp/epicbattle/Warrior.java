package fr.iutvalence.java.mp.epicbattle;

/**
 * @author KAYRAK GERLAND The warrior is the one which stands the damage. A
 *         player looses when all his warriors are dead.
 */
public class Warrior
{
    /**
     * The name of the warrior's class. (ex : spearman, wizard)
     */
    // TODO (fixed) it lacks a getter for this field
    private String name;

    /**
     * The strength defines the damage which inflicts the warrior.
     */
    private int strength;

    /**
     * The health points defines the amount of life of the warrior.
     */
    private int hp;

    /**
     * The speed of the warrior.
     */
    private int speed;

    /**
     * The attack is the offensive action which can execute a warrior.
     */
    private Effect attack;

    /**
     * It creates a warrior depending of the parameters.
     * 
     * @param name
     *            The name of this class.
     * @param strength
     *            The amount of the strength of the warrior.
     * @param hp
     *            The amount of the hp of the warrior.
     * @param speed
     *            His speed
     * @param attack
     *            The amount of the strength of the warrior.
     */
    public Warrior(String name, int strength, int hp, int speed, Effect attack)
    {
        this.name = name;
        this.strength = strength;
        this.hp = hp;
        this.speed = speed;
        this.attack = attack;
    }

    /**
     * Offensive of the warrior
     * 
     * @param target
     *            the warrior who receives the attack
     */
    // Later, we will implement a table with multiple attacks.
    public void attack(Warrior target)
    {
        this.attack.application(this.strength, target);
    }

    
    /**
     * To know the name of the Warrior
     * 
     * @return The name of the Warrior
     */
    public String getName()
    {
        return this.name;
    }
    
    /**
     * Who is he focused by this spell ?
     * 
     * @return the boolean aggressive
     */
    public Effect getAttack()
    {
        return this.attack;
    }

    /**
     * the speed of the warrior when he's attacking.
     * 
     * @return the amount of the speed of the warrior
     */
    public int getSpeedAttack()
    {
        return this.speed + this.attack.getSpeed();
    }

    /**
     * The warrior get damage.
     * 
     * @param damage
     *            the amount of the damage
     */
    public void applyDamage(int damage)
    {
        this.hp = this.hp - damage;
    }

    /**
     * @return The hp of the warrior
     */
    public int getHp()
    {
        return this.hp;
    }

}
