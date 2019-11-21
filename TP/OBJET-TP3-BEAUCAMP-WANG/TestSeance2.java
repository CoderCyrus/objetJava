/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

/**
 *
 * @author muruowang
 */
public class TestSeance2 {

    public static void main(String[] args) {
        // testDeDeplacement();
        //testRecopie();
        //testGenerationAlea();
        testCombatCAC();
        //testCombatDistance();
       // testCombatMagique();

    }

    public static void testDeDeplacement() {
        System.out.println("Test de la méthode de déplacement");
        World w1 = new World();
        w1.creeMondeAlea();

        // pour Archer
        w1.robin.affiche();
        System.out.println();
        w1.robin.deplace();
        w1.robin.affiche();

        w1.guillaumeT.affiche();
        System.out.println();
        w1.guillaumeT.deplace();
        w1.guillaumeT.affiche();
        
       System.out.println("");
    }

    public static void testRecopie() {
        System.out.println("Test du constructeur de recopie");
        World w2 = new World();
        w2.robin.affiche();
        w2.robin.deplace();
        w2.robin.affiche();

        w2.guillaumeT.affiche();
        System.out.println("");
    }

    public static void testGenerationAlea() {
        System.out.println("Test de la génération de position aléatoires");
        World w3 = new World();
        w3.creeMondeAlea();
        w3.afficheWorld();
        System.out.println("");
    }
    
    public static void testCombatCAC() {
        System.out.println("Test du combat au corps à corps");
        World w1 = new World();
        w1.creeMondeAlea();
        
        w1.grosBill.setPos(new Point2D(0, 0));
        w1.wolfie.setPos(new Point2D(1,0));
        System.out.println("Wolfie :");
        w1.wolfie.affiche();
        System.out.println("");
        
        System.out.println("Gros Bill attaque wolfie !");
        w1.grosBill.combattre(w1.wolfie);
        System.out.println("");
        System.out.println("Wolfie :");
        w1.wolfie.affiche();
        System.out.println("");
    }
    
    public static void testCombatDistance() {
        System.out.println("Test du combat à distance");
        World w1 = new World();
        w1.creeMondeAlea();
        
        
        w1.robin.setPos(new Point2D(0, 0));
        w1.guillaumeT.setPos(new Point2D(3,2));
        
        System.out.println("Robin attaque guillaumeT !");
        w1.robin.combattre(w1.guillaumeT);
        System.out.println("");
        w1.robin.affiche();
        System.out.println("");
        w1.guillaumeT.affiche();
        System.out.println("");
    }
    
    public static void testCombatMagique() {
        System.out.println("Test du combat magique");
        World w1 = new World();
        w1.creeMondeAlea();
        
        w1.wolfie.setPos(new Point2D(2, 0));
        w1.merlin.setPos(new Point2D(0, 0));
        
        System.out.println("Merlin attaque wolfie !");
        w1.merlin.combattre(w1.wolfie);
        System.out.println("");
        w1.merlin.affiche();
        System.out.println("");
        System.out.println("Wolfie :");
        w1.wolfie.affiche();
        System.out.println("");
    }
}
