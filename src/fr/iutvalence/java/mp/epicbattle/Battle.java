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
    public final static int PLY1 = 0;
    /**
     * it defines the index of the player 2 in the table players
     */
    public final static int PLY2 = 1;

    /**
     * The players which will play the battle.
     */
    private Player[] players;
    
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

    public Battle(String name1, Heros hero1, Warrior[] listWarriors1, String name2, Heros hero2, Warrior[] listWarriors2)
    {
        this.players = new Player[2];
        this.players[0] = new Player(name1, hero1, listWarriors1);
        this.players[1] = new Player(name2, hero2, listWarriors2);
    }

    /**
     * This method launchs the game 
     */
    public void play()
    {
        int numberOfCurrentTurn = 0;
        while (numberOfCurrentTurn<1)
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
           
        Output.displayGameState(this.players);
        applyPassives();
        // The player choose what they want to do
        // Their speeds depending of what they do
        // Who does he play at first ?
        // If the speeds are the same, the player 1 get the first move

        Effect[] listChoices1;
        listChoices1 = new Effect [5];
        listChoices1[0] = this.players[PLY1].getHero().getSpell(); 
        listChoices1[1] = this.players[PLY1].getWarrior().getAttack();
        listChoices1[2] = Swap.SWAP;
        Effect[] listChoices2;
        listChoices2 = new Effect [5];
        listChoices2[0] = this.players[PLY2].getHero().getSpell(); 
        listChoices2[1] = this.players[PLY2].getWarrior().getAttack();
        listChoices2[2] = Swap.SWAP;
        
      
        
        Choice[] choiceP = new Choice[2];
        
        choiceP[0] = this.players[PLY1].getChoice(listChoices1);
        choiceP[1] = this.players[PLY2].getChoice(listChoices2);
        
        // TODO (fixed) avoid if/else here
        int var = 1;
        if (choiceP[PLY1].getSpeed() >= choiceP[PLY2].getSpeed())
            var=0;
        executeChoice(0,choiceP[(PLY1+var)%2]);     
        if (this.players[(PLY2+var)%2].getWarrior().getHp()>0)
            executeChoice((PLY2+var)%2,choiceP[(PLY2+var)%2]);
        Output.displayGameState(this.players);
    }

    /**
     * Execute the choice of the player
     * @param num the num of the player
     * @param choice The choice of the player
     */
    private void executeChoice(int num, Choice choice)
    {
        // Spell
        if (choice.getEffect().getSpell())
        {
            // The aggressive choice
            if (choice.getEffect().getType()==Effect.AGGRESSIVE)
                choice.getEffect().application(0,this.players[(num+1)%2].getWarrior());       
            // The defensive choice
            if (choice.getEffect().getType()==Effect.DEFENSIVE)
                choice.getEffect().application(0,this.players[num].getWarrior());
            //The Swap choice
            if (choice.getEffect().getType()==Effect.SWAP)
                this.players[num].changeWarrior();

        }
        //Attack
        else
        {
         // The aggressive choice
            if (choice.getEffect().getType()==Effect.AGGRESSIVE)
            {
                choice.getEffect().application(this.players[num].getWarrior().getStrength(),this.players[(num+1)%2].getWarrior());       
            }
            // The defensive choice
            if (choice.getEffect().getType()==Effect.DEFENSIVE)
            {
                choice.getEffect().application(this.players[num].getWarrior().getIntelligence(),this.players[num].getWarrior());
            }
            // The swapping choice
            if (choice.getEffect().getType()==Effect.SWAP)
            {
            //At the moment, the players have just one warrior. The swap is useless.
            }
        }
    }
    
    
    /**
     * This method apply the passives of the heroes
     */
    private void applyPassives()
    {
        int num;
        for(num=0;num<=1;num=num+1)
        {
            // The aggressive choice
            if (this.players[num].getHero().getPassive().getType()==Effect.AGGRESSIVE)
            {
                this.players[num].getHero().getPassive().application(0,this.players[(num+1)%2].getWarrior());       
            }
            // The defensive choice
            if (this.players[num].getHero().getPassive().getType()==Effect.DEFENSIVE)
            {
                this.players[num].getHero().getPassive().application(0,this.players[num].getWarrior());
            }
        }
    }
    
    

    /**
     * This method return the player 1 or 2
     * 
     * @param i
     *            the number of the player
     * @return the player 1 or 2
     */
    private Player getPlayer(int i)
    {
        return this.players[i];
    }
    
    
}
