package fr.iutvalence.java.mp.epicbattle;

/**
 * @author KAYRAK GERLAND Effect is an abstract class which gathers all the
 *         types of effect. An effect could represent a passive, a spell and an
 *         attack.
 */
public abstract class Effect
{
    /**
     * Name of the effect
     */
    // TODO (fixed) it lacks a getter for this field
    private String name;

    /**
     * The speed of the effect
     */
    private int speed;

    /**
     * 0/aggressive/an effect which is applied on the enemy warrior
     * 1/defensive/an effect which is applied on the warrior played
     * 2/swap/an effect which allows to swap warrior played
     */
    private int type;
    
    /**
     * Is it the hero which will use the effect ?
     */
    private boolean spell;

    // TODO (fixed) finish writing comment
    /**
     * 
     * @param name
     *            the name of the effect
     * @param speed
     *            the speed of the effect
     * @param type 
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
