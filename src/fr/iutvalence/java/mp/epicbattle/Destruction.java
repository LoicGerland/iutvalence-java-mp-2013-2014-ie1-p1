package fr.iutvalence.java.mp.epicbattle;

/**
 * @author KAYRAK GERLAND It represents offensive effects.
 * 
 */
public class Destruction extends Effect
{
    /**
     * Yell is the spell of Conan. It inflicts damage to the opponent.
     */
    public final static Effect YELL = new Destruction("Yell", 5, 5);
    // Passives
    /**
     * The barbarian's karma is a passive which inflicts damages to the
     * enemy warrior each turn.
     */
    public final static Effect BARBARIANKARMA = new Destruction("barbarian karma", 2, 1);
    // Attacks
    /**
     * Ax Blow is the basic attack of the axeman.
     */
    public final static Effect AXBLOW = new Destruction("Ax Blow", 5, 10);
      
    
    /**
     * The amount of the damage defines the power of the effect.
     */
    private int damage;

    // TODO (fixed) detail comment (how is the object created?)
    /**
     * It an effect which allows a warrior to attack an other warrior.
     * The object will be created as constants, which can be choice by the player.
     * 
     * @param name
     *            the name of the damage effect
     * @param speed
     *            the speed of the effect
     * @param damage
     *            the damage are use to construct the effect
     */
    public Destruction(String name, int speed, int damage)
    {
        super(name, speed,Effect.AGGRESSIVE,false);
        this.damage = damage;
    }

    /**
     * It decreases a warrior's live depending on the amount of damage
     */
    @Override
    public void application(int power, Warrior target)
    {
        try
        {
        target.applyDamage(power + this.damage);
    
        }
        catch (DeathWarriorException e)
        {
            
        }
    }        

}
