package fr.iutvalence.java.mp.epicbattle;

/**
 * @author Kayrak Gerland The class player defines one of the two opponents of
 *         the battle. It is compounded of the name of the player and the heros
 *         chosen. It could be one of the two sub-class : Human or IA.
 */
public class Player
{
    /**
     * The name of the player.
     */
    private String name;

    /**
     * The heros which was chosen by the player.
     */
    private Hero heroChosen;

    /**
     * The warrior which was chosen by the player.
     */
    private Warrior warriorChosen;

    /**
     * All player's warriors
     */
    private Warrior[] listWarriors;

    /**
     * The input of the player
     */
    // TODO (next step) make player be independant of any particular input
    private InputInterface input;
    
    /**
     * The Output of the player
     */
    private OutputInterface output;

    /**
     * This constructor creates the player with the hero chosen
     * 
     * @param name
     *            The name of the player
     * @param heroChosen
     *            The hero which the player chose.
     * @param listWarriors
     *            The warriors of the player
     * @param input
     *            The input of the player 
     * @param output
     *            The output of the player 
     */
    public Player(String name, Hero heroChosen, Warrior[] listWarriors,InputInterface input, OutputInterface output)
    {
        this.name = name;
        this.heroChosen = heroChosen;
        this.listWarriors = listWarriors;
        this.warriorChosen = listWarriors[0];
        this.input = input;
        this.output = output;
    }

    /**
     * The warrior chosen by the player
     * 
     * @return the warrior chosen by the player
     */
    public Warrior getWarrior()
    {
        return this.warriorChosen;
    }

    /**
     * The hero of the player
     * 
     * @return the hero of the player
     */
    public Hero getHero()
    {
        return this.heroChosen;
    }

    /**
     * To know the choice of the player
     * @param listChoices 
     *              A List of all the Effect of the game
     * @return the player's choice
     * @throws SameWarriorException The exception if the player swap the same warrior
     */
    public Effect getChoice(Effect[] listChoices) throws SameWarriorException
    {
        int i;
        Effect choice = null; 
        this.output.displayAttacks(listChoices);
        i = this.input.getPlayerChoice();
        if (i == 2)
        {
            this.output.displayWarriors(this.listWarriors);
            this.input.chooseWarrior();
            if (this.warriorChosen!=this.listWarriors[this.input.getIndexWarrior()])
                throw new SameWarriorException();
            choice = Swap.SWAP; 

                
        }
        else
            choice = listChoices[i];
        return choice; 
    }
    
    
    /**
     * It returns the name of the player
     * @return The name of the player
     */
public String getName()
   {
       return this.name;
   }

    /**
     * It changes the warrior who is controlled by the player
     */
    public void changeWarrior()
    {
        this.warriorChosen = this.listWarriors[this.input.getIndexWarrior()];
    }
}
