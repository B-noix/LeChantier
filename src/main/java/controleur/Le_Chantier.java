/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package controleur;

//import fr.insa.chantier.le_chantier.model.Lire;
//import fr.insa.chantier.le_chantier.model.Mur;
//import fr.insa.chantier.le_chantier.model.Coin;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import model.*;
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
       ArrayList<Coin> listeCoinTemp = new ArrayList<>();
       ArrayList<Mur> listeMur = new ArrayList<>();
       ArrayList<Mur> listeMurTemp = new ArrayList<>();
       ArrayList<Piece> listePiece = new ArrayList<>();
       ArrayList<Piece> listePieceTemp = new ArrayList<>();
       //ArrayList<Coin> listeAppart = new ArrayList<>();
       //ArrayList<Coin> listeAppartTemp = new ArrayList<>();
       
       
       
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
    
    ArrayList<Revetement> revet = new ArrayList<Revetement>();
    ArrayList<Ouverture> Listeouvert = new ArrayList<Ouverture>();
    Mur Mur = new Mur(1,listeCoin.get(0),listeCoin.get(1),revet,Listeouvert);
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
