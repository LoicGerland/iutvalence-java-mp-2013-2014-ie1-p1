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
    // TODO (fixed) rename field (just name)
    private String name;

    /**
     * The heros which was chosen by the player.
     */
    // TODO (fixed) rename field (just heroChosen)
    public Heros heroChosen;
    
    /**
     * The warrior which was chosen by the player.
     */
    public Warrior warriorChosen;

    // TODO (fixed) do not say how it works but what it does
    /** At first, we will use just one heros to test the program
     * This constructor creates the player with the hero chosen 
     * @param name The name of the player
     * @param heroChosen The hero which the player chose.
     */
    public Player(String name, Heros heroChosen, Warrior warriorChosen)
    {
        this.name = name;
        this.heroChosen = heroChosen;
        this.warriorChosen = warriorChosen;
    }

    
}
