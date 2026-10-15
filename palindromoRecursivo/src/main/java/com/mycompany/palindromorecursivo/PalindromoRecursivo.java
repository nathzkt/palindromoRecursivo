/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palindromorecursivo;

/**
 *
 * @author nameh
 */
public class PalindromoRecursivo {

    public static void main(String[] args) {
        boolean resultado = palindromo.esPalindromo("RadAr");
        boolean resultado2 = palindromo.esPalindromo("   ");
        boolean resultado3 = palindromo.esPalindromo("anita lava la tina");
        boolean resultado4 = palindromo.esPalindromo("estructura");

        System.out.println("palabra radar "+ resultado);
        System.out.println("espacios en blanco "+ resultado2);
        System.out.println("palabra con espacios anita lava la tina "+ resultado3);
        System.out.println("palabra estructura "+ resultado4);

        
    }
    
}
