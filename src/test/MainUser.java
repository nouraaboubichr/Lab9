/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities2.InvalidUserException;
import entities2.User;
import entities3.Logger;

/**
 *
 * @author hp
 */
public class MainUser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User[] users = new User[3];
        users[0] = new User("Alice", 30);
        users[1] = new User("", 25);
        users[2] = new User("Bob", 16);

        for (int i = 0; i < users.length; i++) {

            User u = users[i];

            try {
                u.validate();
                System.out.println("Utilisateur valide : " + u);

            } catch (InvalidUserException e) {
                Logger.logErreur("Validation echouee pour " + u + " : " + e.getMessage());
            }
        }
    }
    
}
