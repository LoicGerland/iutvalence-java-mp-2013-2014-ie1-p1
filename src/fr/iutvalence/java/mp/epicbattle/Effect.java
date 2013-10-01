package fr.iutvalence.java.mp.epicbattle;

/**
 * @author gerlandl
 * Effect is an abstract class which gathers all the types of effect.
 * The effect is linked to a passive or a spell.
 */
abstract public class Effect
{
    /**
     * Application is the action of the effect in the battle.
     */
    abstract void application();
}
