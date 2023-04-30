/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Benoit
 */
    import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.Revetement;

public class lecture {




    public  List<Revetement> lireFichierRevetements() throws FileNotFoundException, IOException{
        
        List<Revetement> revetements = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("revetemments"));
        String ligne;
        while ((ligne = br.readLine()) != null) {
            String[] champs = ligne.split(";");
            int idRevetement = Integer.parseInt(champs[0]);
            String designation = champs[1];
            boolean pourMur = champs[2].equals("1");
            boolean pourSol = champs[3].equals("1");
            boolean pourPlafond = champs[4].equals("1");
            double prixUnitaire = Double.parseDouble(champs[5]);
            Revetement revetement = new Revetement(idRevetement, designation, pourMur, pourSol, pourPlafond, prixUnitaire);
            revetements.add(revetement);
        }
        br.close();
        return revetements;
    }
}


