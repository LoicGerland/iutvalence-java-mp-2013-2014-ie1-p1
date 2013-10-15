package fr.iutvalence.java.mp.epicbattle;

/**
 * @author Kayrak Gerland The heros will be chosen in a list of pre-create
 *         heros. They will be defined in sub-class The class heros is compounded
 *         of his name, his spells, (a picture) and a passive power which will
 *         impact warriors' characteristics.
 */

public class Heros
{
    /**
     * The name of the Heros
     */
    private String name;

    // TODO (fix) fix comment
    /**
     * The table which contains the Heros' spells
     */
    private Effect spell;

    /**
     * The Heros' passive
     */
    private Effect passivePower;

  
      
     /** 
     * This constructor creates a hero with a name, a spell and a passive.
     * For example Conan, with his passive power and one spell 
     * 
     * @param name
     *            His name
     * @param spell
     *            His spell
     * @param passivePower
     *            His passive
     */
    public Heros(String name, Effect spell, Effect passivePower)
    {
        this.name = name;
        this.passivePower = passivePower;
        this.spell = spell;
    }
    
    // TODO (think bout it) the way you manage spells is somewhat strange
    /**
     * Use a spell against a warrior
     * @param battle the battle where the spell is used
     */
    public void useSpell(Battle battle)
    {
        this.spell.application(battle);
    }
    
    // TODO (fix) rename method (more explicit)
    /**
     * Return the speed of the spell
     * @return the speed of the spell
     */
    public int useSpellSpeed()
    {
        return this.spell.speed;
    }

    /**
     * It applies the passive of the hero
     * @param battle The battle where the passive is used
     */
    public void applyPassive(Battle battle)
    {
        this.passivePower.application(battle);
        
    }
    
    

}
