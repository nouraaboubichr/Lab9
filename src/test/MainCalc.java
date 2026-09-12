/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.Calculator;
import entities3.Logger;

/**
 *
 * @author hp
 */
public class MainCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Calculator calc = new Calculator();

        try {
            System.out.println("10 / 2 = " + calc.div(10, 2));
            System.out.println("10 / 0 = " + calc.div(10, 0));

        } catch (ArithmeticException ex) {
            Logger.logErreur("Erreur de calcul : " + ex.getMessage());

        } finally {
            System.out.println("Fin du calcul.");
        }
    }
    
}
