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
    List<Ouverture> ListeOuverture = new ArrayList();
    Sol(int id, List LC, List LR, List LO) {
        this.idSol=id;
        this.ListeCoins=LC;
        this.ListeRevetements=LR;
        this.ListeOuverture=LO;
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
        double s;
     double L1=longeur(this.ListeCoins.get(0),this.ListeCoins.get(1));
     double L2=longeur(this.ListeCoins.get(1),this.ListeCoins.get(2));
     double L3=longeur(this.ListeCoins.get(2),this.ListeCoins.get(3));
         if (L1!=L2) {
             s = L1*L2;
        }   else {
             s= L2*L3; 
            }  
        for( Ouverture o : ListeOuverture){
            s=s-o.surface();
        }
        return s;
    }    
    
    
    String tosave(){
        String s ;
        s="Sol;"+this.idSol;
        for(Coin c: ListeCoins){    // pour lecture il faudra faire un while ou un if pour changer d'objet car les liste ouverture et revetement sont a longueur variable
            s=s+";"+c.getid();
        }
        s=s+";revetement";
        for(Revetement r : ListeRevetements){
            s=s+";"+r.getid();
        }
        s=s+";ouverture";
        for(Ouverture o : ListeOuverture){
            s=s+";"+o.getid();
        }
        return s;
    }
    
    double montantrevet(){
        double prix=0;
        for( Revetement r:ListeRevetements){
            prix=prix+( surface()*r.getPu());
        }
        return prix;
    }
    int getid(){
        return this.idSol;
    }
}
