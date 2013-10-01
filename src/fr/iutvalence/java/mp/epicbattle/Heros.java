package fr.iutvalence.java.mp.epicbattle;

/**
 * @author Kayrak Gerland The heros will be chosen in a list of pre-create
 *         heros. They will be defined in sub-class The class heros is compound
 *         of his name, his spells, (a picture) and a passive power which will
 *         impact warriors' characteristics.
 */

public class Heros
{
    /**
     * The name of the Heros
     */
    // TODO (fixed) rename field (just name)
    private String name;

    /**
     * The table which contains the Heros' spells
     */
    // TODO (fixed) rename field (just spell)
    private Spell spell;

    /**
     * The Heros' passive
     */
    // TODO (fixed) rename field (passivePower)
    private Passive passivePower;

  
     // TODO (fixed) describe what the instance should look like
      
     /** This is the constructor of heros will be used by the subclasses. Because
     * each feature depends of the heros which is chosen.
     * 
     * The instance will create a hero with a name, a spell and a passive.
     * For example Conan, with his passive power and one spell 
     * 
     * @param name
     *            His name
     * @param spell
     *            His spell
     * @param passive
     *            His passive
     */
    public Heros(String name, Spell spell, Passive passive)
    {
        this.name = name;
        this.passivePower = passive;
        this.spell = spell;
    }

}
