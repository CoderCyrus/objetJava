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
public class Point2D {
    private int x;
    private int y;
      
     public Point2D(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public Point2D(){
        this.x = 0;
        this.y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void setPosition(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void translate(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }
    
    public void affiche(){
        System.out.println("[" + this.x + " ; " + this.y + "]");
    }
    
}



