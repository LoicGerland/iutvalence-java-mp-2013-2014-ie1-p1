package fr.iutvalence.java.mp.epicbattle;

/**
 * @author Kayrak Gerland The class player define one of the two opponents of
 *         the battle. It is compound of the name of the player and the heros
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
    private Heros heroChosen;

    // TODO (fixed) do not say how it works but what it does
    /** At first, we will use just one heros to test the program
     * This constructor create the player with the hero chosen 
     * @param name the name of the player
     */
    public Player(String name, Heros heroChosen)
    {
        this.name = name;
        this.heroChosen = heroChosen;

    }

}
