package fr.iutvalence.java.mp.epicbattle;

/**
 * @author KAYRAK GERLAND
 * Effect is an abstract class which gathers all the types of effect.
 * An effect could represent a passive, a spell and an attack.
 */
abstract public class Effect
{   
    // TODO (fix) this field should not be declared as public
    /**
     * Name of the effect
     */
    public String name;
    
    // TODO (fix) this field should not be declared as public
    /**
     * The speed of the effect
     */
    public int speed;
    
    // TODO (think about it) i am not sure that an effect applies to a battle
    /**
     * Application is the action of the effect in the battle.
     * @param battle The battle where the effect is applied
     */
    public abstract void application(Battle battle);
}
