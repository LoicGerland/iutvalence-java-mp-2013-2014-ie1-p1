package fr.iutvalence.java.mp.epicbattle;

/**
 * @author KAYRAK GERLAND
 * It represents offensive effects.
 * 
 */
public class Destruction extends Effect
{
    // TODO (fixed) this field should not be declared as public
    /**
     * The amount of the damage defines the power of the effect. 
     */
    private int damage; 
    
    
    
    /**
     * It creates a destruction effect
     * @param name the name of the damage effect
     * @param speed the speed of the effect
     * @param damage the damage are use to construct the effect
     */
    public Destruction(String name, int speed, int damage)
    {
        super(name,speed);
        this.damage = damage;
    }

    /**
     * It decreases a warrior's live depending on the amount of damage 
     */
    @Override
    public void application(int power, Warrior target)
    {
        target.applyDamage(power+this.damage) ;
    }

}
