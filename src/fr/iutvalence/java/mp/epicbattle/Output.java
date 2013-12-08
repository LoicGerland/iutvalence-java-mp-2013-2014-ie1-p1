package fr.iutvalence.java.mp.epicbattle;

/**
 * The class used to display informations
 * 
 * @author GERLAND, KAYRAK
 * 
 */
public class Output
{
 
    /**
     * It displays player's attacks
     * 
     * @param listChoices
     *            list of his choices
     */
    public void displayAttacks(Effect[] listChoices)
    {
        for (int i = 0; i < 3; i++)
            System.out.println(i + ". " + listChoices[i].getName());
    }

    /**
     * It displays the warriors of the player
     * 
     * @param listWarriors
     *            list of his Warriors
     */
    public void displayWarriors(Warrior[] listWarriors)
    {
        for (int i = 0; i < 2; i++)
            System.out.println(i + ". " + listWarriors[i].getName());
    }

    /**
     * It displays The Heroes,the Warriors playing and their HP
     * 
     * @param players
     *            The players
     */
    public void displayGameState(Player[] players)
    {
        System.out.println(players[Battle.PLAYER1].getHero().getName() + " " + players[Battle.PLAYER1].getWarrior().getName()
                + " " + players[Battle.PLAYER1].getWarrior().getHp() + "HP");
        System.out.println(players[Battle.PLAYER2].getHero().getName() + " " + players[Battle.PLAYER2].getWarrior().getName()
                + " " + players[Battle.PLAYER2].getWarrior().getHp() + "HP");

    }
    

}
