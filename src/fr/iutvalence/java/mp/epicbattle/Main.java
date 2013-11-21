package fr.iutvalence.java.mp.epicbattle;

/**
 * The class main, for test the game
 * 
 * @author GERLAND, KAYRAK
 * 
 */
public class Main
{

    /**
     * In this main ,we create some heroes,warriors and spell to test the game.
     *
     */
    public static void main(@SuppressWarnings("javadoc") String[] args)
    {
        String J1 = "J1";
        String J2 = "J2";
        Battle game;
        game = new Battle(J1, Heros.CONAN, Warrior.AXEMAN1, J2, Heros.CONAN, Warrior.AXEMAN2); 
        game.play();

    }

}
