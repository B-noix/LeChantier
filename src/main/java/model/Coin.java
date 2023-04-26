package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;
/**
 *
 * @author Amadou Coulibaly
 */
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
   
            
}
