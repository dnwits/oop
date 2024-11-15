/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop;

/**
 *
 * @author ves8167
 */
public class OOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //String greeting = "Hello world!";
        //System.out.println(greeting);
        
        //CREAR ARRAY Y OUTPUT DE ESTA:
        char[] helloArray = { 'h', 'e', 'l', 'l', 'o', ' ',':','3'};
        String helloString = new String(helloArray);  
        System.out.println( helloString );
        //CONTAR LOS CARACTERES MOSTRADOS POR PANTALLA DEL STRING ANTERIOR(accessor method)
        int len = helloString.length();
        System.out.println( "String Length is : " + len );
        //CONCATENACIÓN :3
        String string1 = " chased";
        String string2 = "The cat";
        System.out.println("Meow " + string1 + " Tod.");
        System.out.println(string2.concat(string1)+ " Tod.");
        // FORMATED STRING
        String fs;
        int cookie = 30;
        float meow = 10.5f;
        fs = String.format("%s was baking %d cookies and then %s a mouse at %f km/h", string2, cookie, string1, meow);
        // %d = integer ----- %s = string ------- %f = float -------- %n = es un salto de linea
        // despues del texto pueden ir variables o datos normales
        System.out.println(fs);
        //string.charAt dice el caracter en la posición indicada COMIENZA DESDE 0
        int index1 = 2;
        int index2= 10;
        System.out.println("Valores de los indices son "+index1+" y "+index2);
        System.out.println("The character value at the " + index1 + " index is: " + fs.charAt(index1));
        System.out.println("The character value at the " + index2 + " index is: " + fs.charAt(index2));
        
        String fs2 = String.format("%s says that today is %2$s", string2, "miercoles", "viernes");
        // el %2$s indica que seleccione el elemento en la posición entre el % y el $ de la lista
        System.out.println(fs2);
        //Dejar espacios (10 en este caso). Si se modifica a |%-20d| el texto se ajusta a la izquierda
        String fstest = String.format("|%10d|", 93); 
        //Si se pone + delante del 10 el resultado mostrarà si el numero es negativo o positivo
        //Si se pone un 0 delante del 10 los espacios serán 0's
        System.out.println(fstest);
        //pasa el valor a octal y hexadecimal
        int conver = 127;
        String fsconver = String.format("%o y %x", conver, cookie);
        System.out.println(fsconver);
        //ESPECIFICAR LONGITUD permitida
        String fslong = String.format("%.5s", string2);
        System.out.println(fslong);
        
        
        
        
    }
}
