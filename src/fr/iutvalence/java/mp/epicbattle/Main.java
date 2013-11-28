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
        
         Warrior[] listWarriors1;
         listWarriors1 = new Warrior[2];
         listWarriors1[1] = Warrior.AXEMAN1;
         listWarriors1[2] = Warrior.BUISNESSMAN;
         
         Warrior[] listWarriors2;
         listWarriors2 = new Warrior[2];
         listWarriors2[1] = Warrior.AXEMAN2;
         listWarriors2[2] = Warrior.SPEARMAN1;
         
        game = new Battle(J1, Heros.CONAN, listWarriors1, J2, Heros.CONAN, listWarriors2); 
        game.play();

    }

}
