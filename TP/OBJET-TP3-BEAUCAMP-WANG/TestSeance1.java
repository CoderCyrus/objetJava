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
public class TestSeance1 {

    public static void main(String[] args) {

        World w1 = new World();
        w1.creeMondeAlea();

        w1.robin.affiche();
         System.out.println();
        w1.peon.affiche();
         System.out.println();
        w1.bugs1.affiche();

        
        System.out.println();
        System.out.println("Initialisation d'un nouvel archer :");
        Archer arc = new Archer();
        System.out.println("Archer possède " + arc.getNbFleches() + " fleches");
        arc.setNbFleches(4);
        System.out.println("Modificaition le nombre fleches :");
        arc.affiche();

        System.out.println();
        System.out.println("Initialisation d'un nouvel lapin :");
        Lapin l = new Lapin();
        System.out.println("Le lapin possède " + l.getPtVie() + " points de vie");
        l.setPtVie(30);
        System.out.println("Modificaition les points de vie de lapin :");
        l.affiche();
        
        System.out.println("Test du constructeur de recopie :");
        Personnage p1 = new Personnage();
        Personnage p2 = new Personnage(p1); // recopie
        p1.setPos(new Point2D(10, 2));
        p1.affiche();
        p2.affiche();
           

    }

}
