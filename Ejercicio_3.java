
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nico
 */
/*Escribir un programa que pida una frase
y la muestre toda en mayúsculas
y después toda en minúsculas. 
*/
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String Frase;
        System.out.println("Escribe una frase.");
        Frase = leer.nextLine();
        System.out.println( "Minusculas = "+ Frase.toLowerCase() );
        System.out.println( "Mayusculas = " + Frase.toUpperCase() );        
    }  
}
