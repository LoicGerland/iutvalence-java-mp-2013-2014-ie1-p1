package fr.iutvalence.java.mp.epicbattle;

/**
 * This class represents a thread which measures the duration of the game
 * @author GERLAND KAYRAK
 *
 */
public class TimeThread extends Thread
{
    /**
     * The time max of a game
     */
    int MAX = 1000000;
    
    /**
     * The constructor of the Thread
     */
    public TimeThread()
    {
        super();
    }

    public void run()
    {
        int i;
        for (i=0;i<this.MAX;i++)
        {
            try
            {
                sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
