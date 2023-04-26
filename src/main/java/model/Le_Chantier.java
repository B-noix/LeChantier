/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package model;

//import fr.insa.chantier.le_chantier.model.Lire;
//import fr.insa.chantier.le_chantier.model.Mur;
//import fr.insa.chantier.le_chantier.model.Coin;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
/**
 *
 * @author bcosson01
 */
public class Le_Chantier {
    public static void SaveCoin( ArrayList<Coin> listeCoin){
        
    }
    public static void main(String[] args){
      
     double x,y;
        ArrayList<Coin> listeCoin = new ArrayList<>();
       ArrayList<Coin> liste = new ArrayList<>();
     System.out.println(" nouveau coin ");
     System.out.println(" entrer position x");
     x=Lire.d();
     System.out.println(" entrer position y");
     y=Lire.d();
     
     Coin c = new Coin(0,x,y);
     c.afficher();
     listeCoin.add(c);
     
     
    
     
     
     
     System.out.println(" nouveau coin ");
     System.out.println(" entrer position x");
     x=Lire.d();
     System.out.println(" entrer position y");
     y=Lire.d();
     c =  new Coin(1,x,y);
      
      
     listeCoin.add(c);
     
     
    System.out.println(listeCoin);
     
    Mur Mur = new Mur(1,listeCoin.get(0),listeCoin.get(1));
    Mur.afficher();
    
    
    
    /* System.out.println(c1.toString());
    try{
    BufferedWriter coin=new BufferedWriter(new FileWriter("coin.txt",true));
    coin.write(c1.toString());
    coin.write("test");
    System.out.println("ca marche lol");
    coin.close();
    }
    catch (IOException err)
{System.out.println("Erreur :\n"+err);}

*/
    }  //fin main
}   // fin classe
