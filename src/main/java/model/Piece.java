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
    int idPiece;
    int sol;
    int plafond;
    List<Mur> ListeMur = new ArrayList<Mur>();
    
    Piece(int id, int s, int p , List L){
        this.ListeMur=L;
        this.idPiece=id;
        this.plafond=p;
        this.sol=s;
        
       
    }
    //calcul la somme de la surface de chaque mur de la piece
    double surfacePiece(){
        int i;
        double s=0;
        for(i=0;i<this.ListeMur.size();i++){
         s = this.ListeMur.get(i).surface() + s;
        }
        return s;     
    }
}
