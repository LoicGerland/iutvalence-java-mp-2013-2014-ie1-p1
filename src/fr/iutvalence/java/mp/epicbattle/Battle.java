package fr.iutvalence.java.mp.epicbattle;

/**
 * This class represents a new game. It is compounded a table of two players.
 * 
 * @author GERLAND KAYRAK
 * 
 */
public class Battle
{

    /**
     * it defines the index of the player 1 in the table players
     */
    // TODO (fixed) rename constant
    public final static int PLAYER1 = 0;

    /**
     * it defines the index of the player 2 in the table players
     */
    // TODO (fixed) rename constant
    public final static int PLAYER2 = 1;

    /**
     * The players which will play the battle.
     */
    private Player[] players;
    
    /**
     * The output of the battle
     */
    private Output outBattle;

    // TODO (fixed) fix comment (parameters)
    /**
     * This constructor creates a battle between two players. It also assigns a
     * hero to each players.
     * 
     * @param name1
     *            Name of the first player
     * @param hero1
     *            His hero
     * @param listWarriors1
     *            The warriors he chose
     * @param name2
     *            Name of the second player
     * @param hero2
     *            His heros
     * @param listWarriors2
     *            The warriors he chose
     */
    public Battle(String name1, Hero hero1, Warrior[] listWarriors1, String name2, Hero hero2, Warrior[] listWarriors2)
    {
        this.players = new Player[2];
        this.players[0] = new Player(name1, hero1, listWarriors1);
        this.players[1] = new Player(name2, hero2, listWarriors2);
        this.outBattle = new Output();
    }

    /**
     * This method launchs the game
     */
    public void play()
    {
        int numberOfCurrentTurn = 0;
        while (numberOfCurrentTurn < 1)
        {
            doTheTurn();
            numberOfCurrentTurn = numberOfCurrentTurn + 1;
        }
    }

    /**
     * The execution of a turn
     */
    private void doTheTurn()
    {

        this.outBattle.displayGameState(this.players);
        applyPassives();
        // The player choose what they want to do
        // Their speeds depending of what they do
        // Who does he play at first ?
        // If the speeds are the same, the player 1 get the first move

        Effect[] listChoices1;
        listChoices1 = new Effect[5];
        listChoices1[0] = this.players[PLAYER1].getHero().getSpell();
        listChoices1[1] = this.players[PLAYER1].getWarrior().getAttack();
        listChoices1[2] = Swap.SWAP;
        Effect[] listChoices2;
        listChoices2 = new Effect[5];
        listChoices2[0] = this.players[PLAYER2].getHero().getSpell();
        listChoices2[1] = this.players[PLAYER2].getWarrior().getAttack();
        listChoices2[2] = Swap.SWAP;

        Effect[] choiceP = new Effect[2];

        choiceP[0] = this.players[PLAYER1].getChoice(listChoices1);
        choiceP[1] = this.players[PLAYER2].getChoice(listChoices2);

        int var = 1;
        if (choiceP[PLAYER1].getSpeed() >= choiceP[PLAYER2].getSpeed())
            var = 0;
        executeChoice(var, choiceP[(PLAYER1 + var) % 2]);
        if (this.players[(PLAYER2 + var) % 2].getWarrior().getHp() > 0)
            executeChoice((PLAYER2 + var) % 2, choiceP[(PLAYER2 + var) % 2]);
        
        this.outBattle.displayGameState(this.players);
    }

    /**
     * Execute the choice of the player
     * 
     * @param num
     *            the num of the player
     * @param choice
     *            The choice of the player
     */
    private void executeChoice(int num, Effect choice)
    {
        // Spell
        if (choice.getSpell())
        {
            // The aggressive choice
            if (choice.getType() == Effect.AGGRESSIVE)
                choice.application(0, this.players[(num + 1) % 2].getWarrior());
            else
            {
            // The defensive choice
                if (choice.getType() == Effect.DEFENSIVE)
                    choice.application(0, this.players[num].getWarrior());
            // The Swap choice
                else
                    this.players[num].changeWarrior();
            }

        }
        // Attack
        else
        {
            // The aggressive choice
            if (choice.getType() == Effect.AGGRESSIVE)
                choice.application(this.players[num].getWarrior().getStrength(),
                        this.players[(num + 1) % 2].getWarrior());
            // The defensive choice
            if (choice.getType() == Effect.DEFENSIVE)
                choice.application(this.players[num].getWarrior().getIntelligence(), this.players[num].getWarrior());
            
        }
    }

    /**
     * This method apply the passives of the heroes
     */
    private void applyPassives()
    {
        int num;
        for (num = 0; num <= 1; num = num + 1)
        {
            // The aggressive choice
            if (this.players[num].getHero().getPassive().getType() == Effect.AGGRESSIVE)
            {
                this.players[num].getHero().getPassive().application(0, this.players[(num + 1) % 2].getWarrior());
            }
            // The defensive choice
            if (this.players[num].getHero().getPassive().getType() == Effect.DEFENSIVE)
            {
                this.players[num].getHero().getPassive().application(0, this.players[num].getWarrior());
            }
        }
    }

}
