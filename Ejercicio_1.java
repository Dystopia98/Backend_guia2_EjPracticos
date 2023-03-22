
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
/* Escribir un programa que pida dos números enteros por teclado
    y calcule la suma de los dos.
   El programa deberá después mostrar el resultado de la suma
*/
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero1;
        int numero2;
        System.out.println("Ingresar 2 números enteros.");
        numero1 = leer.nextInt();
        numero2 = leer.nextInt();
        int numero3 = numero1 + numero2;
        System.out.println( "" +numero1+ " + " +numero2+ " = " +numero3+"" );
                }
    
}
