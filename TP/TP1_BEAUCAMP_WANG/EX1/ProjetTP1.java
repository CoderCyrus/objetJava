/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.centralenantes.projettp1;

/**
 *
 * @author muruowang
 */
public class ProjetTP1 {
      public static void main(String[] args) {
        int i = 0;
        System.out.println(
        "Début du programme !");
                      // premiere partie du programme
                      i *= 2;
        i = i + 1;
        System.out.println("La variable i vaut : " + i);
        // deuxieme partie du programme
        i += 2;
        i = (i / 2) * 2;
        System.out.println("Fin du programme, je pense que i vaut 3");
        System.out.println("Le résultat final est : "+ i);

        // troisieme partie : bissextile
        int annee = 1996;
        if (((annee  %4 == 0) && (annee % 100 != 0)) || (annee % 400 == 0)) {
            System.out.println(annee+ " est une annee bissextile");
        } else {
            System.out.println(annee+" n'est pas bissextile");
        }

    }
    
}
