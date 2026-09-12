/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities2;

/**
 *
 * @author hp
 */

public class User {

    private String nom;
    private int age;

    public User(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public void validate() throws InvalidUserException {

        if (nom == null || nom.trim().isEmpty()) {
            throw new InvalidUserException("Nom d'utilisateur invalide");
        }

        if (age < 18) {
            throw new InvalidUserException("Utilisateur mineur (age=" + age + ")");
        }
    }

    public String toString() {
        return "User[nom=" + nom + ", age=" + age + "]";
    }
}
