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
    // Temporally in the Class battle.
    // Constants
    
    // Spells
    /**
     * Yell is the spell of Conan. It inflicts damage to the opponent.
     */
    public final static Effect YELL = new Destruction("Yell", 5, 5);
    // Passives
    /**
     * The barbarian's karma is a passive which inflicts damages to the enemy warrior each turn.
     */
    public final static Effect BARBARIANKARMA = new Destruction("barbarian karma", 2, 1);
    // Heroes
    /**
     * Conan is an offensive hero.
     */
    public final static Heros CONAN = new Heros("Conan", YELL, BARBARIANKARMA); 
    // Attacks
    /**
     * Ax Blow is the basic attack of the axeman.
     */
    public final static Effect AXBLOW = new Destruction("Ax Blow", 5, 10);   
    // Warriors
    /**
     * Axeman is a barbarian warrior.
     */
    public final static Warrior AXEMAN = new Warrior("Axeman", 10, 30, 10, AXBLOW);
    
    
    
    
    // TODO (think about it) consider separating the heroes with which the player
    // plays and how he plays (i.e how he interacts with the game).
    
    
    // TODO (fix) some of the following fields should not be fields but local variables, think about it
    
    /**
     * The players which will play the battle.
     */
    private Player[] players;
    
    
    // TODO (fix) finish writing comment, documenting what values can take array cells
    /**
     * What the players want to do
     */
    private int[] dataChoices;
    
    /**
     * This number represents how much turn was occurred.
     */
    private int turnNb;
    
    // TODO (fixed) this field should not be declared as public
    /**
     * The player which plays while the turn.
     */
    private Player activePlayer;

    // TODO (fixed) this field should not be declared as public
    /**
     * The player which doesn't play while the turn.
     */
    private Player passivePlayer;

    
    // TODO (fixed) do not say how it works but what it does
     /** S
     * This constructor creates a battle between two players. 
     * It also assigns a hero to each players.
     * @param name1 Name of the first player
     * @param hero1 His hero
     * @param warrior1 The warrior he chose
     * @param name2 Name of the second player        
     * @param hero2 His heros
     * @param warrior2 The warrior he chose
     */

    public Battle(String name1, Heros hero1, Warrior warrior1, 
            String name2, Heros hero2, Warrior warrior2)
    {
        this.players = new Player[2];      
        this.players[1] = new Player(name1, hero1, warrior1);
        this.players[2] = new Player(name2, hero2, warrior2);
        // The third slot will be allowed to change warrior in the battle
        this.dataChoices = new int[3];
        this.turnNb = 1;
    }
    
    /**
     * The execution of a turn
     */
    public void doTheTurn()
    {
        int speedP1=0;
        int speedP2=0;
        applyPassives();
        // The player choose what they want to do
            // Their speeds depending of what they do
        speedP1=play(1);
        speedP1=play(2);
        // Who does he play at first ? 
            // If the speeds are the same, the player 1 get the first move 
        if (speedP2>speedP1)
        {
            executeChoice(2);
            executeChoice(1);
        }
        else
        {
            executeChoice(1);
            executeChoice(2);
        }
        this.turnNb = this.turnNb+1;
    }
    


    /**
     * The player choose what he wants to do. His speed depends on this.
     * @param playerNumber index of the player : player one or player two.
     * @return the player Speed of the player's action
     */
    private int play(int playerNumber)
    {
        int choice = 1;
        int speed = 0;
         /* Two solution
         * The player 2 plays / the player 1 doesn't play
         * If the turn is uneven :
         * The player 2 doesn't play / the player 2 plays.
         */
        this.activePlayer = this.players[playerNumber];
        this.passivePlayer = this.players[(playerNumber+1)%2];
        // TODO The user chooses an action
        // choice = chooseAction();
        // He attacks with his warrior
        
        this.dataChoices[playerNumber]=choice;
        
        if (choice==1)
        {
            speed = attackSpeed();
        }
        // He uses a spell
        if (choice==2)
        {
            speed = useSpellSpeed();
        }
        // He changes warrior
        // The slowest move of the game.
        if (choice==3)
        {
            speed = 0;
        }
        return speed;
    }
    
    /**
     * It executes the action which a player has chosen.
     * @param playerNumber a player's number
     */
    private void executeChoice(int playerNumber)
    {
        if (this.dataChoices[playerNumber]==1)
        {
            attack();          
        }
        // He uses a spell
        if (this.dataChoices[playerNumber]==2)
        {
            useSpell();
        }
        // TODO Create the method to change warrior
        // He changes warrior
        // The slowest move of the game
        if (this.dataChoices[playerNumber]==3)
        {
        }
    }

    /**
     * The speed of the player if he chooses to attack with his warrior
     * @return the speed of the attack 
     */
    public int attackSpeed()
    {
        return this.activePlayer.getWarrior().getSpeedAttack();
    }
    
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
    
    /**
     * The speed of the player if he chooses to attack with his warrior
     * @return the speed of the spell
     */
    public int useSpellSpeed()
    {
        return this.activePlayer.getHero().getSpell().getSpeed();
    }
    
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
        if (this.players[1].getHero().getPassive().getAggressive())
        {
            this.players[1].getHero().applyPassive(this.players[2].getWarrior());
        }
        else
        {
            this.players[1].getHero().applyPassive(this.players[1].getWarrior());
        }
        // We apply the passive of the player 2
        if (this.players[2].getHero().getPassive().getAggressive())
        {
            this.players[2].getHero().applyPassive(this.players[1].getWarrior());
        }
        else
        {
            this.players[2].getHero().applyPassive(this.players[2].getWarrior());
        }
    }
    
    
 
    

}
