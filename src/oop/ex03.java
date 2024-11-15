/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 * Exercici 3: Comparar dues cadenes ignorant majúscules i minúscules
 * Escriu un mètode que compari dues cadenes ignorants les majúscules i minúscules.
 * @author ves8167
 */
public class ex03 {
    public static void main(String[] args) {
        String hola = "hola";
        String hola2 = "HOLA";
        System.out.println("Las cadenes són: " + hola + " i " + hola2);
        int compara = hola.compareToIgnoreCase(hola2);
        System.out.println("La cadenes tienen diferencias (ignorant majúscules i minúscules)? " + compara);
        //corrección
        System.out.println("Són iguals 'Hello' i 'hello' si ignoro les majúscules? " + sonIguals("Hello", "hello")); // true
    }
     public static boolean sonIguals(String cadena1, String cadena2) {
        return cadena1.equalsIgnoreCase(cadena2);
    }
}
