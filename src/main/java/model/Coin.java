package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;

public class Coin {

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Coin{");
        sb.append("idCoin=").append(idCoin);
        sb.append(", cx=").append(cx);
        sb.append(", cy=").append(cy);
        sb.append('}');
        return sb.toString();
    }
    // Attributs
    int idCoin;
    double cx;
    double cy;
    ArrayList<Coin> listeCoin;
    
    // Constructeur
    Coin(int id, double x, double y)
    {
      this.idCoin=id;
      this.cx=x;
      this.cy=y;
    }
    
    void afficher()
    {
        System.out.println(" Coin : id ="+this.idCoin+" abscisse = "+this.cx+ " Ordonnée ="+this.cy);
    }
   public double getx(){ 
       return cx;
   }
    public double gety(){ 
       return cy;
   }
     public int getid(){ 
       return idCoin;
   }
     // renvoie un string bien former pour placer dans le fichier text de sauvegarde
     // utile seulement dans écriture du fichier text
     public String toSave(){
         StringBuilder sb = new StringBuilder();
        sb.append("Coin");
        sb.append(";").append(idCoin);
        sb.append(";").append(cx);
        sb.append(";").append(cy);
        
        return sb.toString();
     }
            
}
