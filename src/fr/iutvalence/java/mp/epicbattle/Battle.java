package fr.iutvalence.java.mp.epicbattle;

/**
 * This class represents a new game. It is compounded a table of two players.
 * 
 * @author GERLAND KAYRAK
 * 
 */
// TODO (fix) this class should only have one public method, which starts and
// play the whole game
public class Battle
{

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

    public Battle(String name1, Heros hero1, Warrior warrior1, String name2, Heros hero2, Warrior warrior2)
    {
        this.players = new Player[2];
        this.players[0] = new Player(name1, hero1, warrior1);
        this.players[1] = new Player(name2, hero2, warrior2);
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

        applyPassives();
        this.players[0].doChoice(Destruction.AXBLOW);
        this.players[1].doChoice(Heal.AXHEAL);
        // The player choose what they want to do
        // Their speeds depending of what they do
        // Who does he play at first ?
        // If the speeds are the same, the player 1 get the first move
        if (this.players[0].getChoice().getSpeed()>= this.players[1].getChoice().getSpeed())
        {
            executeChoice(0);
            executeChoice(1);

        }
        else
        {
            executeChoice(1);
            executeChoice(0);

        }
    }

    /**
     * Execute the choice of the player
     * @param num the num of the player
     */
    private void executeChoice(int num)
    {
        // Spell
        if (this.players[num].getChoice().getEffect().getSpell())
        {
            // The aggressive choice
            if (this.players[num].getChoice().getEffect().getType()==0)
            {
                this.players[num].getChoice().getEffect().application(0,this.players[(num+1)%2].getWarrior());       
            }
            // The defensive choice
            if (this.players[num].getChoice().getEffect().getType()==1)
            {
                this.players[num].getChoice().getEffect().application(0,this.players[num].getWarrior());   
            }

        }
        //Attack
        else
        {
         // The aggressive choice
            if (this.players[num].getChoice().getEffect().getType()==0)
            {
                this.players[num].getChoice().getEffect().application(this.players[num].getWarrior().getStrength(),this.players[(num+1)%2].getWarrior());       
            }
            // The defensive choice
            if (this.players[num].getChoice().getEffect().getType()==1)
            {
                this.players[num].getChoice().getEffect().application(this.players[num].getWarrior().getIntelligence(),this.players[num].getWarrior());
            }
            // The swapping choice
            if (this.players[num].getChoice().getEffect().getType()==2)
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
            if (this.players[num].getHero().getPassive().getType()==0)
            {
                this.players[num].getHero().getPassive().application(0,this.players[(num+1)%2].getWarrior());       
            }
            // The defensive choice
            if (this.players[num].getHero().getPassive().getType()==1)
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
    public Player getPlayer(int i)
    {
        return this.players[i];
    }
    
    
}
