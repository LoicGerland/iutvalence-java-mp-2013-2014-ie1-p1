package fr.iutvalence.java.mp.epicbattle;

/**
 * @author KAYRAK GERLAND
 * It represents offensive effects.
 * 
 */
public class Destruction extends Effect
{
    
    /**
     * Name of the effect
     */
    public String name;
    /**
     * The amount of the damage defines the power of the effect. 
     */
    public int damage; 
    
    
    /**
     * Create a destruction effect
     * @param damage the damage are use to construct the effect.
     */
    public Destruction(String name, int damage)
    {
        this.name = name;
        this.damage = damage;
    }

    /**
     * @param warrior the warrior which receives the effect.
     * The application of this effect decrease a warrior's live.  
     */
    @Override
    // TODO create the class Warrior
    public void application(Warrior target)
    {
        target.hp = target.hp-this.damage;
    }

}
