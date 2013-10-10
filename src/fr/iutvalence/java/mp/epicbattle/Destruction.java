package fr.iutvalence.java.mp.epicbattle;

/**
 * @author KAYRAK GERLAND
 * It represents offensive effects.
 * 
 */
public class Destruction extends Effect
{
    
    /**
     * The amount of the damage defines the power of the effect. 
     */
    public int damage; 
    
    
    /**
     * It creates a destruction effect
     * @param name the name of the damage effect
     * @param speed the speed of the effect
     * @param damage the damage are use to construct the effect
     */
    public Destruction(String name, int speed, int damage)
    {
        this.name = name;
        this.speed = speed;
        this.damage = damage;
    }

    /**
     * It decreases a warrior's live depending of the amount of damage 
     */
    @Override
    public void application(Battle battle)
    {
        battle.passivePlayer.warriorChosen.hp = battle.passivePlayer.warriorChosen.hp-this.damage;
    }

}
