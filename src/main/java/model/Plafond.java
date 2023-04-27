package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


 import java.util.*; 

/**
 *
 * @author echaslotdenize01
 */
public class Plafond {
    //Déclaration des attributs
    int idPlafond;
    List<Coin>ListeCoins=new ArrayList<Coin>();
    List<Revetement>ListeRevetements=new ArrayList<Revetement>();
    List<Ouverture> ListeOuverture = new ArrayList();
    //Constructeur de la classe
    Plafond(int id, List LC, List LR,List LO ){
        this.idPlafond=id;
        this.ListeCoins=LC;
        this.ListeRevetements=LR;
        this.ListeOuverture=LO;
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
             s= L1*L2;
        }   else {
             s= L2*L3; 
            } 
          for( Ouverture o : ListeOuverture){
            s=s-o.surface();
        }
        return s;
    }
     void afficher(){
        System.out.println("==== plafond =====");
        for ( Coin c : ListeCoins){
            c.afficher();
        }
    }
     }
     
                
    
      
 
    
    
    
    

