package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.*;
        
/**
 *
 * @author lcoves01
 */
public class Sol {
    int idSol;
    List<Coin> ListeCoins =  new ArrayList<Coin>() ;
    List<Revetement> ListeRevetements = new ArrayList<Revetement>() ;
    
    Sol(int id, List LC, List LR) {
        this.idSol=id;
        this.ListeCoins=LC;
        this.ListeRevetements=LR;
    }
    
    void afficher() {
        System.out.println(" ===== Sol ==== ");
      for ( Coin c : ListeCoins){
          System.out.print(c.getid()+"  -  ");
      }
    }
       double longeur(Coin debut , Coin fin){
        
        return(Math.sqrt((fin.cx-debut.cx)*(fin.cx-debut.cx) + (fin.cy-debut.cy)*(fin.cy-debut.cy)));
    }
    double surface(){
     double L1=longeur(this.ListeCoins.get(0),this.ListeCoins.get(1));
     double L2=longeur(this.ListeCoins.get(1),this.ListeCoins.get(2));
     double L3=longeur(this.ListeCoins.get(2),this.ListeCoins.get(3));
         if (L1!=L2) {
             return L1*L2;
        }   else {
             return L2*L3; 
            }  
    }    
}
