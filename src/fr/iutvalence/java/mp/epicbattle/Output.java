package fr.iutvalence.java.mp.epicbattle;

 /**
 * The class used to display informations
 * @author GERLAND, KAYRAK
 *
 */
public class Output
{
    /**
     * It displays player's attacks
     * @param listChoices list of his choices
     */
    public static void displayAttacks(Effect[] listChoices)
    {
        int i;
        for ( i=0;i<3;i++)
        {
            System.out.println(i+". "+listChoices[i].getName());
        }
 
    }
    
    /**
     * It displays the warriors of the player
     * @param listChoices list of his choices
     */
    public static void displayWarriors(Warrior[] listWarriors)
    {
        int i;
        for ( i=0;i<2;i++)
        {
            System.out.println(i+". "+listWarriors[i].getName());
        }
 
    }
    
    /**
     * It displays The Heroes,the Warriors playing and their HP
     * @param 
     *         players The players
     */
    public static void displayGameState(Player[] players)
    {
        System.out.println(players[Battle.PLY1].getHero().getName()+" "+players[Battle.PLY1].getWarrior().getName()+" "+players[Battle.PLY1].getWarrior().getHp()+"HP");   
        System.out.println(players[Battle.PLY2].getHero().getName()+" "+players[Battle.PLY2].getWarrior().getName()+" "+players[Battle.PLY2].getWarrior().getHp()+"HP");
        
    }
    
    
}
