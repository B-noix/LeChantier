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

    //contructeur
    public Ouverture (int id, double x , double y){
        this.idOuverture=id;
        this.dimx=x;
        this.dimy=y;
    }
    
    //affiche, sers a rien , seulement pour test
    public void afficher(){
        System.out.println("Ouverture "+ this.idOuverture+" dimx= "+this.dimx+" ; dimy= " + this.dimy);
    }
    
    
    // renvoie un string bien former pour placer dans le fichier text de sauvegarde
     // utile seulement dans écriture du fichier text
    public String toSave(){
        return( "Ouverture;"+this.idOuverture+";"+this.dimx+";"+this.dimy);
    }
    
    //renvoie la valeur de la surface que couvre l'ouverture
    public double surface(){
        return dimx*dimy;
    }    
    //revoie un int de l'identifiant de l'ouverture
    public int getid(){
        return this.idOuverture;
    }
}
