/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities1.FileUtil;
import java.util.List;

/**
 *
 * @author hp
 */
public class MainFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         List<Integer> nums = FileUtil.readNumbers("numbers.txt");

        System.out.println("Nombres lus : " + nums);
    }
    
}
