package fr.iutvalence.java.mp.epicbattle;

/**
 * This effect which allows the player to change warrior
 * @author gerlandl
 *
 */
public class Swap extends Effect
{
    /**
     * The effect which allows the player to change warrior
     */
    public final static Effect SWAP = new Swap();

    /**
     * It creates a swap effect
     */
    public Swap()
    {
        super("Swap", 0, Effect.SWAP, true);
    }

    /**
     * Unused function
     */
    public void application(int power, Warrior target)
    {

    }

}
