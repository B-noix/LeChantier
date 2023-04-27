package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;
public class Mur {
    
    //attributs
    int idMur;
    Coin debut, fin;
    ArrayList<Ouverture> Listeouverture = new ArrayList ();
    ArrayList<Revetement> revet = new ArrayList<Revetement>() ;
    
    //constructeur
    Mur(int id, Coin dc, Coin fc, ArrayList revet, ArrayList ouverture)
    {
        this.idMur=id;
        this.debut=dc;
        this.fin=fc;
        this.revet=revet;
        this.Listeouverture=ouverture;
    }
    
    void afficher()
    {System.out.println("==== Mur =====");
        this.debut.afficher();
        this.fin.afficher();    
    }
    
    double longueur()
    {
        return(Math.sqrt((this.fin.cx-this.debut.cx)*(this.fin.cx-this.debut.cx) + (this.fin.cy-this.debut.cy)*(this.fin.cy-this.debut.cy)));
    }
    
    double surface()
    {
        double s;
       // System.out.println("\nEntrer la Hauteur du mur (hauteur sous-plafond)");
        //double hsp=Lire.d();
        s=(this.longueur()*2.70);
        for(Ouverture o : Listeouverture){
            s=s-o.surface();
        }
        return s;
    }
   // renvoie un string bien former pour placer dans le fichier text de sauvegarde
     // utile seulement dans écriture du fichier text
    public String toSave() {
        String s= "Mur" + "," + idMur + "," + debut.getid() + "," + fin.getid() ;  // Mur;3;5;8;5;7...
        for(Ouverture o:Listeouverture){
            s=s+";"+o.getid();
        }
        return s;
    }
    public Coin getdebut() {
        return debut;
    }

    public Coin getFin() {
        return fin;
    }

    public List getReve() {
        return revet;
    }
    
    double montantRevet(){
       double prix=0;
        for(Revetement r : revet ){
            prix=prix + r.getPu()*surface();
        }
        return prix;
    }
    int getid(){
        return this.idMur;
    }
}
