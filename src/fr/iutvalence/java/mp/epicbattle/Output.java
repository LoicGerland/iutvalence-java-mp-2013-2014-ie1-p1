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
    // TODO (fix) this should not be static
    public static void displayAttacks(Effect[] listChoices)
    {
        for (int i = 0; i < 3; i++)
            System.out.println(i + ". " + listChoices[i].getName());
    }

    // TODO (fix) fix comment
    /**
     * It displays the warriors of the player
     * 
     * @param listChoices
     *            list of his choices
     */
    // TODO (fix) this should not be static
    public static void displayWarriors(Warrior[] listWarriors)
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
    // TODO (fix) this should not be static
    public static void displayGameState(Player[] players)
    {
        System.out.println(players[Battle.PLY1].getHero().getName() + " " + players[Battle.PLY1].getWarrior().getName()
                + " " + players[Battle.PLY1].getWarrior().getHp() + "HP");
        System.out.println(players[Battle.PLY2].getHero().getName() + " " + players[Battle.PLY2].getWarrior().getName()
                + " " + players[Battle.PLY2].getWarrior().getHp() + "HP");

    }

}
