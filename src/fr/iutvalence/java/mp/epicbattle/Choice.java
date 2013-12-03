package fr.iutvalence.java.mp.epicbattle;

/**
 * This class will, save the action chosen by the player
 * 
 * @author GERLAND, KAYRAK
 * 
 */
public class Choice
{
    // TODO (fix) if this class just embeds a effect, why not using Effect instead of Choice ?
    /**
     * The effect used by the player
     */
    private Effect effect;

    /**
     * The Choice will contain the action chosen by the player.
     * 
     * @param effect
     *            The effect used by the player
     */
    public Choice(Effect effect)
    {
        this.effect = effect;

    }

    /**
     * This method is used to get the speed of the action
     * 
     * @return The speed of the action use
     */
    public int getSpeed()
    {
        return this.effect.getSpeed();
    }
    
    /**
     * To know the choice chosen
     * @return the effect of the choice
     */
    public Effect getEffect()
    {
        return this.effect;
    }
}
