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
    
    /**
     * This number represents how much turn are occurred.
     */
    private int turnNb;
    
    /**
     * The player which plays while the turn.
     */
    private Player whoPlays;
    
    /**
     * The player which doesn't play while the turn.
     */
    private Player whoDoesNotPlay;

    
    // TODO (fixed) do not say how it works but what it does
     /** 
     * This constructor creates a battle between two players. 
     * It also assigns a hero to each players.
     * @param name1 Name of the first player
     * @param hero1 His hero
     * @param name2 Name of the second player        
     * @param hero2 His heros
     * 
     */

    public Battle(String name1, Heros hero1, String name2, Heros hero2)
    {
        this.players = new Player[2];
        this.players[1] = new Player(name1, hero1);
        this.players[2] = new Player(name2, hero2);
        this.turnNb = 1;
        this.whoPlays = this.players[1];
        this.whoDoesNotPlay = this.players[2];
    }
    
    /**
     * The next turn is initialized.
     * 
     */
    private void nextTurn()
    {
        this.turnNb = this.turnNb+1;
        int i;
        i = this.turnNb%2 + 1;
        /**
         * The player which plays is defined from the number of the turn.
         */
        this.whoPlays = this.players[i+1];
        this.whoDoesNotPlay = this.players[i];
    }
    

}
