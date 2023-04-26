package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author lcoves01
 */
public class Revetement {
    int Idrevetement;
    String designation;
    boolean pourMur;
    boolean pourSol;
    boolean pourPlafond;
    double prixUnitaire;
    
     public Revetement( int id , String nom , boolean pMur , boolean pSol , boolean pplafond, double prix){
        this.Idrevetement=id;
        this.designation=nom;
        this.pourMur=pMur;
        this.pourPlafond=pplafond;
        this.pourSol=pSol;
        this.prixUnitaire=prix;
    }
}
