package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Amadou Coulibaly
 */
public class Mur {
    int idMur;
    Coin debut, fin;
    Revetement revet;
    
    
    Mur(int id, Coin dc, Coin fc, Revetement revet)
    {
        this.idMur=id;
        this.debut=dc;
        this.fin=fc;
        this.revet=revet;
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
       // System.out.println("\nEntrer la Hauteur du mur (hauteur sous-plafond)");
        //double hsp=Lire.d();
        return(this.longueur()*2.70);
    }
   
    public String toSave() {
        return "Mur" + "," + idMur + "," + debut + "," + fin ;
    }
    public Coin getdebut() {
        return debut;
    }

    public Coin getFin() {
        return fin;
    }

    public Revetement getReve() {
        return revet;
    }
}
