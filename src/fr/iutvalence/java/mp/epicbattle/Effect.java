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
    // TODO (fix) it lacks a getter for this field
    private String name;

    /**
     * The speed of the effect
     */
    private int speed;

    /**
     * Aggressive or defensive attack
     */
    private boolean aggressive;

    // TODO (fixed) finish writing comment
    /**
     * 
     * @param name
     *            the name of the effect
     * @param speed
     *            the speed of the effect
     */
    public Effect(String name, int speed)
    {
        this.name = name;
        this.speed = speed;
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
    public boolean getAggressive()
    {
        return this.aggressive;
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
