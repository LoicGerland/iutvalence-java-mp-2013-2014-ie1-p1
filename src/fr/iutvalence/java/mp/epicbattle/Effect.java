package fr.iutvalence.java.mp.epicbattle;

/**
 * @author KAYRAK GERLAND
 * Effect is an abstract class which gathers all the types of effect.
 * The effect is linked to a passive or a spell.
 */
abstract public class Effect
{
    /**
     * Application is the action of the effect in the battle.
     */
    abstract void application(Warrior warrior);
}
