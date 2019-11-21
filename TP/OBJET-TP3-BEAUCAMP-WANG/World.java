/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

import java.util.Random;
import java.util.ArrayList;

/**
 * Le monde 2D dans lequel évolue les créatures du jeu World of ECN.
 *
 * @author muruowang
 */
public class World {

    /**
     * Un archer nommé Robin.
     */
    public Archer robin;
    /**
     * Un paysan nommé Péon.
     */
    public Paysan peon;
    /**
     * Un premier lapin.
     */
    public Lapin bugs1;
    /**
     * Un deuxième lapin.
     */
    public Lapin bugs2;

    /**
     * TP3 : Copiez robin dans guillaumeT Un archer nommé guillaumeT.
     */
    public Archer guillaumeT;
    public Guerrier grosBill;
    public Mage merlin;
    public Loup wolfie;

    /**
     * Le constructeur sans paramètres qui initialise les créatures avec leurs
     * valeurs par défaut puis attribue un nom à chaque personnage.
     */
    public World() {
        this.robin = new Archer();
        robin.setNom("Robin");
        this.peon = new Paysan();
        peon.setNom("Péon");
        this.bugs1 = new Lapin();

        this.bugs2 = new Lapin();
       
        this.grosBill = new Guerrier();
        grosBill.setNom("grosBill");
        this.merlin = new Mage();
        merlin.setNom("merlin");
        // TP3 
        this.guillaumeT = new Archer(robin);
        guillaumeT.setNom("guillaumT");
        
        this.wolfie = new Loup();
        

    }

    /**
     * Place toutes les créatures dans le monde 2D, en s'assurant qu'ils aient
     * tous une position différente et que deux personnages soient au plus à une
     * distance de 5 l'un de l'autre.
     */
    public void creeMondeAlea() {

        // nombres pseudo-aleatoires
        Random generateurAleatoire = new Random();
        // génération la position du première  personnage
        Point2D newPos = new Point2D(generateurAleatoire.nextInt(10), generateurAleatoire.nextInt(10));

        ArrayList<Point2D> positions = new ArrayList<Point2D>();
        // ajouter la position danns la tableau
        positions.add(newPos);

        for (int i = 0; i < 7; i++) {
            boolean isValid = false;
            while (!isValid){
                newPos = new Point2D(generateurAleatoire.nextInt(10), generateurAleatoire.nextInt(10));
                boolean checkValid = true;
                for (Point2D pos : positions) {
                    checkValid = checkValid && (pos.distance(newPos) <= 5 && !pos.equals(newPos));
                }
                isValid = checkValid;
            }
            positions.add(newPos);  
        }
     
        this.grosBill.setPos(positions.get(0));
        this.guillaumeT.setPos(positions.get(1));
        this.merlin.setPos(positions.get(2));
        this.peon.setPos(positions.get(3));
        this.robin.setPos(positions.get(4));
        this.bugs1.setPos(positions.get(5));
        this.bugs2.setPos(positions.get(6));
        this.wolfie.setPos(positions.get(7));

    }

    public void tourDeJeu() {
    }

    /**
     * Affichage textuel de tous les attributs de tous les créatures du monde.
     */
    public void afficheWorld() {

        System.out.println("Tous les personnages du monde :");
        this.grosBill.affiche();
        this.guillaumeT.affiche();
        this.merlin.affiche();
        this.peon.affiche();
        this.robin.affiche();
        System.out.println("Tous les monstres du monde :");
        this.bugs1.affiche();
        this.bugs2.affiche();
        this.wolfie.affiche();
    }

}
