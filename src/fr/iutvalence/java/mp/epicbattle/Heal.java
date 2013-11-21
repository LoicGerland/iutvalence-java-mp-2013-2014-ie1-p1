package fr.iutvalence.java.mp.epicbattle;

/**
 * @author Kayrak Gerland It represents def effects.
 *
 */
public class Heal extends Effect
{
    /**
     * Ax Blow is the heal of the axeman.
     */
    public final static Effect AXHEAL = new Heal("Ax Heal", 10, 50);
    
    /**
     * The amount of the heal defines the power of the effect.
     */
    private int regeneration;

    // TODO (fixed) detail comment (how is the object created?)
    /**
     * It an effect which allows a warrior to attack an other warrior.
     * The object will be created as constants, which can be choice by the player.
     * 
     * @param name
     *            the name of the damage effect
     * @param speed
     *            the speed of the effect
     * @param regeneration
     *            the regeneration are use to construct the effect
     */
    public Heal(String name, int speed, int regeneration)
    {
        super(name, speed,Effect.DEFENSIVE,true);
        this.regeneration = regeneration;
    }

    /**
     * It decreases a warrior's live depending on the amount of damage
     */
    @Override
    public void application(int power, Warrior target)
    {
        target.applyHeal(power+ this.regeneration);
    }

}
