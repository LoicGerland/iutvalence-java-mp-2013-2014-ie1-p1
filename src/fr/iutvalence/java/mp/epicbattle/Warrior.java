package fr.iutvalence.java.mp.epicbattle;

/**
 * @author KAYRAK GERLAND The warrior is the one which stands the damage. A
 *         player looses when all his warriors are dead.
 */
public class Warrior
{
 // Warriors
    /**
     * Axeman is a barbarian warrior.
     */
    public final static Warrior AXEMAN1 = new Warrior("Axeman1", 10, 30, 10, 10, Destruction.AXBLOW);
    
    public final static Warrior SPEARMAN1 = new Warrior("Spearman", 5, 50, 200, 15, Destruction.SPEARBLOW);
    @SuppressWarnings("javadoc")
    public final static Warrior AXEMAN2 = new Warrior("Axeman2", 10, 30, 10, 10, Destruction.AXBLOW);
    
    public final static Warrior BUISNESSMAN = new Warrior ("Buisnessman", 5, 1000, 5, 2, Destruction.YELL);
    
    /**
     * The name of the warrior's class. (ex : spearman, wizard)
     */
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
     * The intelligence defines the power of defensive spell
     */
    private int intelligence;
    /**
     * It creates a warrior depending of the parameters.
     * 
     * @param name
     *            The name of this class.
     * @param strength
     *            The amount of the strength of the warrior.
     * @param intelligence 
     *            The amount of the intelligence of the warrior.  
     * @param hp
     *            The amount of the hp of the warrior.
     * @param speed
     *            His speed
     * @param attack
     *            The amount of the strength of the warrior.
     */
    public Warrior(String name, int strength,int intelligence, int hp, int speed, Effect attack)
    {
        this.name = name;
        this.strength = strength;
        this.intelligence = intelligence;
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
     * The warrior gets damage.
     * 
     * @param damage
     *            the amount of the damage
     * @throws DeathWarriorException 
     *            When the warrior dies  
     */
    public void applyDamage(int damage) throws DeathWarriorException  
    {
        this.hp = this.hp - damage;
        if (this.hp <=0)
        {
            this.hp=0; throw new DeathWarriorException();
        }
            
    }

    /**
     * The warrior gets heal.
     * 
     * @param regeneration
     *            the amount of the heal
     */
    public void applyHeal(int regeneration)
    {
        this.hp = this.hp + regeneration;
    }

    /**
     * @return The hp of the warrior
     */
    public int getHp()
    {
        return this.hp;
    }
    
    /**
     * @return The strength of the warrior
     */
    public int getStrength()
    {
        return this.strength;
    }

    /**
     * @return The intelligence of the warrior
     */
    public int getIntelligence()
    {
        return this.intelligence;
    }
}
