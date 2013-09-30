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
    // TODO (fix) rename field (just name)
    private String nameH;

    /**
     * The table which contains the Heros' spells
     */
    // TODO (fix) rename field (just spell)
    private Spell spellH;

    /**
     * The Heros' passive
     */
    // TODO (fix) rename field (passivePower)
    private Passive passiveH;

    /**
     * // TODO (fix) describe what the instance should look like
     * 
     * This is the constructor of heros will be used by the subclasses. Because
     * each feature depends of the heros which is chosen.
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
        this.nameH = name;
        this.passiveH = passive;
        this.spellH = spell;
    }

}
