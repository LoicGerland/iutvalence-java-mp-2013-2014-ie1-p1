package fr.iutvalence.java.mp.epicbattle;
import java.util.Scanner;

/**
 * The class used to get input
 * @author GERLAND, KAYRAK
 *
 */
public class Input
{
    /**
     * This method is used to get the choice of the player
     * @return the index of the choice in listchoices
     */
    // TODO (fix) this should not be static
    public static int getPlayerChoice()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrez le numéro de votre choix:");
        int i = sc.nextInt();
        return i;
    }
}
