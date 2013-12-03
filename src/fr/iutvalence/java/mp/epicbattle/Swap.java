package fr.iutvalence.java.mp.epicbattle;

// TODO (fix) write comment
public class Swap extends Effect
{
    // TODO (fix) write comment
    public final static Effect SWAP = new Swap();

    // TODO (fix) write comment
    private int indexWarrior;

    // TODO (fix) write comment
    public Swap()
    {
        super("Swap", 0, Effect.SWAP, true);
        this.indexWarrior = 0;
    }

    // TODO (fix) write comment
    public void chooseWarrior(int indexWarrior)
    {
        this.indexWarrior = indexWarrior;
    }

    // TODO (fix) write comment
    public int getIndexWarrior()
    {
        return this.indexWarrior;
    }

    // TODO (fix) write comment
    public void application(int power, Warrior target)
    {

    }

}
