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
    List<Coin> listeCoins =  new ArrayList<Coin>() ;
    List<Revetement> listeRevetements = new ArrayList<Revetement>() ;
    
    Sol(int id, List LC, List LR) {
        this.idSol=id;
        this.listeCoins=LC;
        this.listeRevetements=LR;
    }
    
    void afficher() {
        System.out.println(" ===== Sol ==== ");
        this.idSol.afficher(); on reflechiera
       
    }    
}
