package fr.iutvalence.java.mp.epicbattle;


/**
 * This interface represents the different input functions
 * @author GERLAND KAYRAK
 *
 */
public interface InputInterface
{    
    /**
     * This method is used to get the choice of the player
     * @return the index of the choice in listchoices
     */
    public int getPlayerChoice();
    
    /**
     * 
     */
    public void chooseWarrior();
    
    /**
     * It returns the index of the warrior
     * @return the index of the warrior
     */
    public int getIndexWarrior();
}
