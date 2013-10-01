package fr.iutvalence.java.mp.epicbattle;

/**
 * This class represents a new game. It is compound a table of two players. //
 * TODO (fixed) next line is useless Player is a class which will be described in
 * Player.java
 * 
 * @author GERLAND KAYRAK
 * 
 */

public class Battle
{
    // public final static Heros CONAN = new Heros("Conan", spell, passive)
    // TODO (think about it) consider separating the heroes with which the player
    // plays and how he plays (i.e how he interacts with the game).
    
    /**
     * The players which will play the battle.
     */
    // TODO (fixed) rename field (just players)
    private Player[] players;

    
    // TODO (fixed) do not say how it works but what it does
     /** 
     * The game is automatically created. This is a temporally solution waiting
     * the parameters.
     * This constructor create a battle between two players. 
     * @param name1
     *            Name of the first player
     * @param name2
     *            Name of the second player
     * 
     */

    public Battle(String name1, Heros hero1, String name2, Heros hero2)
    {

        this.players = new Player[2];
        this.players[1] = new Player(name1, hero1);
        this.players[2] = new Player(name2, hero2);

    }

}
