/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 * Exercici 1: Comprovar si una cadena conté una paraula específica
 * Escriu un mètode que comprovi si una cadena conté una paraula específica.
 * @author ves8167
 */
public class ex01 {
    public static void main(String[] args) {
        String frase = "La paraula es gat, no massa complicat.";
        CharSequence paraula = "gat";
        boolean bool = frase.contains(paraula);
        System.out.println("El String contiene la palabra especificada? " + bool);
    }
}
