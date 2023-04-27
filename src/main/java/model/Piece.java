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
public class Piece {
    
    //attributs
    int idPiece;
    int sol;
    int plafond;
    List<Mur> ListeMur = new ArrayList<Mur>();
    
    //contructeur
    Piece(int id, int s, int p , List L){
        this.ListeMur=L;
        this.idPiece=id;
        this.plafond=p;
        this.sol=s;
        
       
    }
    //calcul la somme de la surface de chaque mur de la piece en enlevant les ouvertures
    double surfaceMurPiece(){
        int i;
        double s=0;
        for(Mur m:ListeMur){
         s = m.surface() + s;
        }
        return s;     
    }
    String toSave(){
        String s="Piece;"+this.idPiece+";"+this.plafond+";"+this.sol+";Mur;";
        for(Mur m : ListeMur){
            s=s+m.getid();
        }
        return s;
    }
    
}
