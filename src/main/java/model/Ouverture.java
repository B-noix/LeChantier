/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Benoit
 */
public class Ouverture {
    int idOuverture;
    double dimx,dimy;
    
    Ouverture (int id, double x , double y){
        this.idOuverture=id;
        this.dimx=x;
        this.dimy=y;
    }
    void afficher(){
        System.out.println("Ouverture "+ this.idOuverture+" dimx= "+this.dimx+" ; dimy= " + this.dimy);
    }
    String toSave(){
        return( "Ouverture;"+this.idOuverture+";"+this.dimx+";"+this.dimy);
    }
    double surface(){
        return dimx*dimy;
    }
}
