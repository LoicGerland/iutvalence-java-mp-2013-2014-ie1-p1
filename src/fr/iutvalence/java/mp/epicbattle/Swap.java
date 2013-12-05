package fr.iutvalence.java.mp.epicbattle;

/**
 * This effect which allows the player to change warrior
 * @author gerlandl
 *
 */
// TODO (fixed) write comment
public class Swap extends Effect
{
    // TODO (fixed) write comment
    /**
     * The effect which allows the player to change warrior
     */
    public final static Effect SWAP = new Swap();

    /**
     * It creates a swap effect
     */
    // TODO (fixed) write comment
    public Swap()
    {
        super("Swap", 0, Effect.SWAP, true);
    }

    /**
     * Unused function
     */
    // TODO (fixed) write comment
    public void application(int power, Warrior target)
    {

    }

}
