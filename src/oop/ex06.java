/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 * Exercici 6: Invertir una cadena
 * Escriu un mètode que inverteixi una cadena donada.
 * @author ves8167
 */
public class ex06 {
    public static void main(String[] args) {
        String teclat = "Cadena per invertir";
        System.out.println(teclat);
        System.out.println(invertir_cadena(teclat));
        System.out.println(teclat + " invertit és: " + invertirCadena(teclat));
    }
    public static String invertir_cadena (String cadena){
        String cad_inv = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
	cad_inv = cad_inv + cadena.charAt(i);
	}
	return cad_inv;
    }
    public static String invertirCadena(String cadena) {
        return new StringBuilder(cadena).reverse().toString();
    }
}
