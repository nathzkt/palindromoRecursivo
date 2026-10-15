/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.palindromorecursivo;

/**
 * practica 1 recursividad con palindromos
 * @author nameh
 *  nathan hazael merenciano hernandez 4 C
 */
public class palindromo {
    
    //el primer metodo que valida la palabra y manda a llamar al otro metodo
    public static boolean esPalindromo(String palabra){
        if(palabra == null){ //valida si la palabra es nula 
            return false;
        }
        palabra = palabra.toLowerCase(); //convierte todas las letras d la palabra en minusculas
        palabra = palabra.replace(" ", "");//quita los espacios
        if(palabra.isEmpty()){//valida q la palabra no este vacia o haya espacios en blanco
            return false;
        }
        
        return esPalindromoAux(palabra, 0, palabra.length()-1); //llama al metodo auxiliar con la palabra validada, y las posiciones
      
    }
    //el metodo recursivo q recorre la palabra y verifica si es palindroma
    private static boolean esPalindromoAux(String palabra, int inicio, int fin){
        if(inicio>=fin){//este es el caso base de exito
            return true;//retorna true si los indices se encontraron o se cruzaron
        }
        if (palabra.charAt(inicio)!= palabra.charAt(fin)){//el caso base de fallo
            return false;//aqui retorna falso porque verifica q la ultima letra y la primera no coincidieron
        }
        //es el caso recursivo
        return esPalindromoAux(palabra, inicio+1, fin-1);//si las letras coinciden avanza 1 en inicio y retrocede 1 en fin
    }
}
