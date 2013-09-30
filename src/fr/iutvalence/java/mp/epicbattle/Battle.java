package fr.iutvalence.java.mp.epicbattle;

/**
 * This class represents a new game. It is compound a table of two players. //
 * TODO (fix) next line is useless Player is a class which will be described in
 * Player.java
 * 
 * @author GERLAND KAYRAK
 * 
 */

public class Battle
{
    // TODO (think about it) consider separating the heroes with which the player
    // plays and how he plays (i.e how he interacts with the game).
    /**
     * The players which will play the battle.
     */
    // TODO (fix) rename field (just players)
    private Player[] twoPlayers;

    /**
     * // TODO (fix) do not say how it works but what it does
     * 
     * The game is automatically created. This is a temporally solution waiting
     * the parameters. We call the constructor of Player in Player class to
     * generate, the two players
     * 
     * @param name1
     *            Name of the first player
     * @param name2
     *            Name of the second player
     * 
     * 
     */

    public Battle(String name1, String name2)
    {

        this.twoPlayers = new Player[2];
        this.twoPlayers[1] = new Player(name1);
        this.twoPlayers[2] = new Player(name2);

    }

}
