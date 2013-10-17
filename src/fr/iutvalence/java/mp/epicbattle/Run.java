package fr.iutvalence.java.mp.epicbattle;

public class Run
{
    

    public static void main(String[] args)
    {
        // Temporally in the Class battle.
        // Constants
        
        // Spells
        /**
         * Yell is the spell of Conan. It inflicts damage to the opponent.
         */
        final Effect YELL = new Destruction("Yell", 5, 5);
        // Passives
        /**
         * The barbarian's karma is a passive which inflicts damages to the enemy warrior each turn.
         */
        final Effect BARBARIANKARMA = new Destruction("barbarian karma", 2, 1);
        // Heroes
        /**
         * Conan is an offensive hero.
         */
        final Heros CONAN = new Heros("Conan", YELL, BARBARIANKARMA); 
        // Attacks
        /**
         * Ax Blow is the basic attack of the axeman.
         */
        final Effect AXBLOW = new Destruction("Ax Blow", 5, 10);   
        // Warriors
        /**
         * Axeman is a barbarian warrior.
         */
        final Warrior AXEMAN = new Warrior("Axeman", 10, 30, 10, AXBLOW);
        
        String J1 = "J1";
        
        String J2 = "J2";
        
        Battle Game;
        
        Game = new Battle(J1,CONAN,AXEMAN,J2,CONAN,AXEMAN);
        
        System.out.println(AXEMAN.getHp());
        CONAN.getSpell().application(15, AXEMAN);
        System.out.println(AXEMAN.getHp());
        
    }

}
/* Battle(String name1, Heros hero1, Warrior warrior1, 
        String name2, Heros hero2, Warrior warrior2) */