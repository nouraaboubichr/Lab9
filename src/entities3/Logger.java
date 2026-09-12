/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author hp
 */


public class Logger {

    private static final String FICHIER_LOG = "error.log";

    public static void logErreur(String message) {

        // true = mode append (ajout a la fin du fichier, sans l'ecraser)
        try (FileWriter fw = new FileWriter(FICHIER_LOG, true);
             PrintWriter pw = new PrintWriter(fw)) {

            pw.println("[ERREUR] " + message);

        } catch (IOException e) {
            System.err.println("Impossible d'ecrire dans le fichier log : " + e.getMessage());
        }
    }
}
