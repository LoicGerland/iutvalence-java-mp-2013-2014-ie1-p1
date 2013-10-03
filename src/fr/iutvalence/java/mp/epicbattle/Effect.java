package fr.iutvalence.java.mp.epicbattle;

/**
 * @author KAYRAK GERLAND
 * Effect is an abstract class which gathers all the types of effect.
 * An effect could represent a passive, a spell and an attack.
 */
abstract public class Effect
{   
    /**
     * Application is the action of the effect in the battle.
     * @param warrior The warrior which receives the effect
     */
    public abstract void application(Warrior warrior);
}
