/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities1;

import entities3.Logger;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */

public class FileUtil {

    public static List<Integer> readNumbers(String path) {

        List<Integer> list = new ArrayList<Integer>();

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {

            String line;

            while ((line = reader.readLine()) != null) {

                line = line.trim();

                if (line.isEmpty()) {
                    continue;
                }

                list.add(Integer.parseInt(line));
            }

        } catch (IOException e) {
            Logger.logErreur("Erreur d'E/S : " + e.getMessage());

        } catch (NumberFormatException e) {
            Logger.logErreur("Format invalide dans le fichier : " + e.getMessage());
        }

        return list;
    }
}