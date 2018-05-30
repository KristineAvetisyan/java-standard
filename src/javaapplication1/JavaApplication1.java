/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;
import jdk.nashorn.internal.ir.BreakNode;

/**
 *
 * @author educacionit
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String palabra = scan.nextLine();
        boolean esPalindromo = true; // Palindromo es neuquen 
//        char c = palabra.charAt(0);//Vuelve elemento 0 = n  (neuquen)
//        char[] caracters = palabra.toCharArray();
//        char[] cs = scan.nextLine().toCharArray();
        
        int hasta = palabra.length() / 2;
        
        for (int i = 0, j = palabra.length() - 1; i < hasta; i++, j--) {
            if (palabra.charAt(i) != palabra.charAt(j)) {
                esPalindromo = false;
                break;
            }
        }
        //hola
        
        System.out.println("La palabra " + (esPalindromo ? "es" : "no es") + " Palindromo");
        


    }

}
