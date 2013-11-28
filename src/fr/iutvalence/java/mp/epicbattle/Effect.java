package fr.iutvalence.java.mp.epicbattle;

/**
 * @author KAYRAK GERLAND Effect is an abstract class which gathers all the
 *         types of effect. An effect could represent a passive, a spell and an
 *         attack.
 */
public abstract class Effect
{
    
    /**
     * 0/aggressive/an effect which is applied on the enemy warrior
     */
    public final static int AGGRESSIVE = 0 ;
    
    /**
     * 1/defensive/an effect which is applied on the warrior played
     */
    public final static int DEFENSIVE = 1 ;
    
    /**
     * 2/swap/an effect which allows to swap warrior played
     */
    public final static int SWAP = 3 ;
    
    // Spells
    /**
     * Name of the effect
     */
    private String name;

    /**
     * The speed of the effect
     */
    private int speed;

    /**
     * The type of the effect
     */
    private int type; 
    
    /**
     * Is it the hero which will use the effect ?
     */
    private boolean spell;

    // TODO (fixed) detail comment
    /**
     * This is the super constructor of all the Spells, Attacks and Swaps of the game.
     * 
     * @param name
     *            the name of the effect
     * @param speed
     *            the speed of the effect
     * @param type
     *            the type of the spell (aggressive or not, swap ?)
     * @param spell 
     *            spell or attack
     */
    public Effect(String name, int speed, int type, boolean spell)
    {
        this.name = name;
        this.speed = speed;
        this.type = type;
        this.spell = spell;
    }

    
    /**
     * To know the name of the effect
     * 
     * @return the name of the effect
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * To know the speed of the attack
     * 
     * @return the speed of the attack
     */
    public int getSpeed()
    {
        return this.speed;
    }

    /**
     * Who is he focused by the attack ?
     * 
     * @return the boolean aggressive
     */
    public int getType()
    {
        return this.type;
    }
    
    /**
     * To know if this is a spell
     * @return if this is a spell
     */
    public boolean getSpell()
    {
        return this.spell;
    }
  

    /**
     * The method used to apply the effect
     * 
     * @param power
     *            the characteristic of the launcher
     * @param target
     *            the warrior focused
     */
    public abstract void application(int power, Warrior target);

}
