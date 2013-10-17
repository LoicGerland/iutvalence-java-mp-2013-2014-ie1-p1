package fr.iutvalence.java.mp.epicbattle;

/**
 * This class will, save the action chosen by the player 
 * @author GERLAND, KAYRAK
 *
 */
public class Choice
{    
    /**
     * The warrior targeted by the effect
     */
    private Warrior warrior;
    
    /**
     * The effect used by the player
     */
    private Effect effect;    
  
    
/**
 * The Choice will contain the action chosen by the player. 
 * @param effect The effect used by the player
 * @param warrior The warrior targeted by the effect
 */
public Choice(Effect effect, Warrior warrior)
{
    this.effect = effect;
    this.warrior = warrior;
    
}

/**
 * This method is used to get the speed of the action
 * @return The speed of the action use
 */
public int getSpeed()
{
    return effect.getSpeed();
}
}
