package fr.iutvalence.java.mp.epicbattle;

// TODO (think about it) this class, which represents a battle, should only have one public method called "play" that handle a battle. All other methods, called from "play"
// should be private
/**
 * This class represents a new game. It is compounded a table of two players.
 * 
 * @author GERLAND KAYRAK
 * 
 */

public class Battle
{

    /**
     * The players which will play the battle.
     */
    private Player[] players;

    /**
     * The choice of the player1
     */
    private Choice choice1;

    /**
     * The choice of the player2
     */
    private Choice choice2;

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

    // TODO (fix) should be private
    /**
     * The execution of a turn
     */
    public void doTheTurn()
    {
        int speedP1 = 0;
        int speedP2 = 0;
        applyPassives();
        choice1 = new Choice(effect, warrior);
        choice2 = new Choice(this.players[2], effect, this.players[2].getWarrior());

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

    // TODO (fix) should be private
    /**
     * The speed of the player if he chooses to attack with his warrior
     * 
     * @return the speed of the attack
     */
    public int attackSpeed()
    {
        return this.activePlayer.getWarrior().getSpeedAttack();
    }

    // TODO (fix) should be private
    /**
     * A warrior attacks an other warrior.
     */
    public void attack()
    {
        if (this.activePlayer.getWarrior().getAttack().getAggressive())
        {
            this.activePlayer.getWarrior().attack(this.passivePlayer.getWarrior());
        }
        else
        {
            this.activePlayer.getWarrior().attack(this.activePlayer.getWarrior());
        }
    }

    // TODO (fix) should be private
    /**
     * The speed of the player if he chooses to attack with his warrior
     * 
     * @return the speed of the spell
     */
    public int useSpellSpeed()
    {
        return this.activePlayer.getHero().getSpell().getSpeed();
    }

    // TODO (fix) should be private
    /**
     * We use a spell
     */
    public void useSpell()
    {
        if (this.activePlayer.getHero().getSpell().getAggressive())
        {
            this.activePlayer.getHero().useSpell(this.passivePlayer.getWarrior());
        }
        else
        {
            this.activePlayer.getHero().useSpell(this.activePlayer.getWarrior());
        }
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

}
