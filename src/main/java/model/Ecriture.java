/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import model.Coin;
import model.Mur;

public class Ecriture {

    public static void sauvegarder( ArrayList<Coin> ListeCoin, ArrayList<Mur> ListMur,ArrayList<Piece> ListePiece) {
        try {
            FileWriter fw = new FileWriter("sauvegarde.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            for (Coin c : ListeCoin) {
                bw.write(c.toSave() + "\n");
            }

            for (Mur m : ListMur) {
                bw.write(m.toSave() + "\n");
            }
            for(Piece p: ListePiece){
                bw.write(p.toSave() + "\n");
            }

            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



