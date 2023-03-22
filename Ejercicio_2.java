
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
/*Escribir un programa que pida tu nombre,
  lo guarde en una variable
  y lo muestre por pantalla.
*/
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("Escribe tu nomre.");
        nombre = leer.next();
        String variable = nombre ;
        System.out.println("          " + variable + "");
    }  
}
