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
     * The warrior chosen by the player
     */
    private int indexWarriorChosen;
    
    /**
     * This method is used to get the choice of the player
     * @return the index of the choice in listchoices
     */
    public int getPlayerChoice()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrez le numéro de votre choix:");
        int i = sc.nextInt();
        return i;
    }
    
    /**
     * 
     */
    public void chooseWarrior()
    {
        this.indexWarriorChosen = getPlayerChoice();
    }
    
    /**
     * It returns the index of the warrior
     * @return the index of the warrior
     */
    public int getIndexWarrior()
    {
        return this.indexWarriorChosen;
    }

}
