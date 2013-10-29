package fr.iutvalence.java.mp.epicbattle;

/**
 * This class represents a new game. It is compounded a table of two players.
 * 
 * @author GERLAND KAYRAK
 * 
 */
// TODO (fix) this class should only have one public method, which starts and
// play
// the whole game
public class Battle
{

    /**
     * The players which will play the battle.
     */
    private Player[] players;

    // TODO (fix) the two following fields look like local variable
    /**
     * The choice of the player1
     */
    private Choice choice1;

    /**
     * The choice of the player2
     */
    private Choice choice2;

    // TODO (fix) the following field looks like local variable
    /**
     * This number represents how much turn was occurred.
     */
    private int numberOfCurrentTurn;

    // TODO (fix) one variable should be enough, and it should be a local one
    /**
     * The player which plays while the turn.
     */
    private Player activePlayer;

    /**
     * The player which doesn't play while the turn.
     */
    private Player passivePlayer;

    /**
     * This constructor creates a battle between two players. It also assigns a
     * hero to each players.
     * 
     * @param name1
     *            Name of the first player
     * @param hero1
     *            His hero
     * @param warrior1
     *            The warrior he chose
     * @param name2
     *            Name of the second player
     * @param hero2
     *            His heros
     * @param warrior2
     *            The warrior he chose
     */

    public Battle(String name1, Heros hero1, Warrior warrior1, String name2, Heros hero2, Warrior warrior2)
    {
        this.players = new Player[2];
        this.players[0] = new Player(name1, hero1, warrior1);
        this.players[1] = new Player(name2, hero2, warrior2);
        this.numberOfCurrentTurn = 1;
    }

    // TODO (fixed) should be private
    /**
     * The execution of a turn
     */
    private void doTheTurn()
    {
        int speedP1 = 0;
        int speedP2 = 0;
        applyPassives();
        choice1 = choice2 =

        // The player choose what they want to do
        // Their speeds depending of what they do
        speedP1 = play(1);
        speedP2 = play(2);
        // Who does he play at first ?
        // If the speeds are the same, the player 1 get the first move
        if (speedP2 > speedP1)
        {
            executeChoice(2);
            executeChoice(1);
        }
        else
        {
            executeChoice(1);
            executeChoice(2);
        }
        this.numberOfCurrentTurn = this.numberOfCurrentTurn + 1;
    }

    /**
     * The player choose what he wants to do. His speed depends on this.
     * 
     * @param playerNumber
     *            index of the player : player one or player two.
     * @return the player Speed of the player's action
     */
    private int play(int playerNumber)
    {
        int choice = 1;
        int speed = 0;
        /*
         * Two solution The player 2 plays / the player 1 doesn't play If the
         * turn is uneven : The player 2 doesn't play / the player 2 plays.
         */
        this.activePlayer = this.players[playerNumber];
        this.passivePlayer = this.players[(playerNumber + 1) % 2];
        // TODO The user chooses an action
        // choice = chooseAction();
        // He attacks with his warrior

        this.dataChoices[playerNumber] = choice;

        if (choice == 1)
        {
            speed = attackSpeed();
        }
        // He uses a spell
        if (choice == 2)
        {
            speed = useSpellSpeed();
        }
        // He changes warrior
        // The slowest move of the game.
        if (choice == 3)
        {
            speed = 0;
        }
        return speed;
    }

    /**
     * It applies the two passives at beginning of each turn
     */
    private void applyPassives()
    {
        // We apply the passive of the player 1
        if (this.players[0].getHero().getPassive().getAggressive())
        {
            this.players[0].getHero().applyPassive(this.players[1].getWarrior());
        }
        else
        {
            this.players[0].getHero().applyPassive(this.players[0].getWarrior());
        }
        // We apply the passive of the player 2
        if (this.players[1].getHero().getPassive().getAggressive())
        {
            this.players[1].getHero().applyPassive(this.players[0].getWarrior());
        }
        else
        {
            this.players[1].getHero().applyPassive(this.players[1].getWarrior());
        }
    }

    /**
     * This method return the player 1 or 2
     * 
     * @param i
     *            the number of the player
     * @return the player 1 or 2
     */
    public Player getPlayer(int i)
    {
        return this.players[i];
    }
}
