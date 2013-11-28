package fr.iutvalence.java.mp.epicbattle;

public class Swap extends Effect
{
    public final static Effect SWAP = new Swap();
    
    private int indexWarrior;
    
    
    public Swap()
    {
        super("Swap",0,Effect.SWAP,true);
        this.indexWarrior = 0;
    }
    
    public void chooseWarrior(int indexWarrior)
    {
        this.indexWarrior = indexWarrior;
    }
    
    public int getIndexWarrior()
    {
        return this.indexWarrior;
    }
    
    public  void application(int power, Warrior target)
    {
        
    }


}
