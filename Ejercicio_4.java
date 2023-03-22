
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
/* Dada una cantidad de grados centígrados se
debe mostrar su equivalente en grados Fahrenheit.
La fórmula correspondiente es: F = 32 + (9 * C / 5).
*/
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero1;
        int numero2;
        System.out.println("Indicar grados centígrados.");
        numero1 = leer.nextInt();
        numero2 = 32+(9*numero1/5);
        System.out.println("El equivalente a fahrenheit es "+ numero2);
    }
    
}
