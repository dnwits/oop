/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 * Exercici 7: Comptar les vegades que apareix una lletra en una cadena
 * Escriu un mètode que compti quantes vegades apareix una lletra en una cadena.
 * @author ves8167
 */
public class ex07 {
    public static void main(String[] args) {
        String meow = "Cadena de text on s'ha de contar les 'A'.";
        System.out.println(meow);
        //System.out.println("totes les 'e' de la frase = "+ meow.indexOf('e'));
        char letra = 'a';
        System.out.println("La frase té "+ contarLetras(meow.toLowerCase(), letra)+ " 'A'");
    }
    public static int contarLetras(String cadena, char caracter){
        int comptador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                comptador++;
            }
        }
        return comptador;
    }
}
