package fr.iutvalence.java.mp.epicbattle;

/**
 * This interface represents the different output functions
 * @author GERLAND, KAYRAK
 *
 */
public interface OutputInterface
{
    /**
     * It displays player's attacks
     * 
     * @param listChoices
     *            list of his choices
     */
    public void displayAttacks(Effect[] listChoices);
    
    /**
     * It displays the warriors of the player
     * 
     * @param listWarriors
     *            list of his Warriors
     */
    public void displayWarriors(Warrior[] listWarriors);

    /**
     * It displays The Heroes,the Warriors playing and their HP
     * 
     * @param players
     *            The players
     */
    public void displayGameState(Player[] players);
    


}
