package fr.iutvalence.java.mp.epicbattle;

/**
 * @author KAYRAK GERLAND
 * This class represents the magic attacks which directly attack the warrior.
 * 
 */
public class Destruction extends Effect
{
    
    /**
     * The amount of the damage defines the power of the effect. 
     */
    public int damage; 
    
    /**
     * @param damage the damage are use to construct the effect.
     */
    public Destruction(int damage){
        this.damage = damage;
    }

    /**
     * @param warrior the warrior which receives the effect.
     * The application of this effect decrease a warrior's live.  
     */
    @Override
    // TODO create the class Warrior
    void application(Warrior warrior)
    {
        warrior.hp = warrior.hp-damage;
    }

}
