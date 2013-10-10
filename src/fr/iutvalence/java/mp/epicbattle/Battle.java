package fr.iutvalence.java.mp.epicbattle;

/**
 * This class represents a new game. It is compounded a table of two players. //
 * TODO (fixed) next line is useless Player is a class which will be described in
 * Player.java
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
    
    /**
     * The players which will play the battle.
     */
    // TODO (fixed) rename field (just players)
    private Player[] players;
    
    /**
     * What the players want to do
     */
    private int[] dataChoices;
    
    /**
     * This number represents how much turn was occurred.
     */
    private int turnNb;
    
    /**
     * The player which plays while the turn.
     */
    public Player activePlayer;
    
    /**
     * The player which doesn't play while the turn.
     */
    public Player passivePlayer;

    
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
     * The execution of a turn.
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
     * New turn.
     */
    
    /**
     * The speed of the player if he chooses to attack with his warrior
     * @return the speed of the attack 
     */
    public int attackSpeed()
    {
        return this.activePlayer.warriorChosen.attackSpeed();
    }
    
    /**
     * A warrior attacks an other warrior. 
     */
    public void attack()
    {
        this.activePlayer.warriorChosen.attack(this);
    }
    
    /**
     * The speed of the player if he chooses to attack with his warrior
     * @return the speed of the spell
     */
    public int useSpellSpeed()
    {
        return this.activePlayer.heroChosen.useSpellSpeed();
    }
    
    /**
     * We use a spell
     */
    public void useSpell()
    {
        this.activePlayer.heroChosen.useSpell(this);
    }
    
    /**
     * It applies the two passives at beginning of each turn
     */
    private void applyPassives()
    {
        this.players[1].heroChosen.applyPassive(this);
        this.players[2].heroChosen.applyPassive(this);
    }   
    

}
