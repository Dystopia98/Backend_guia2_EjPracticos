
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
/*Escribir un programa que lea un número entero por teclado 
y muestre por pantalla el doble, el triple 
y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
*/
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        int doble;
        int triple;
        System.out.println("Ingresar un número.");
        numero = leer.nextInt();
        doble = numero*2;
        triple = numero*3;
        System.out.println("Doble = "+ doble );
        System.out.println("Triple = "+ triple );
        System.out.println("Raiz Cuadrada = "+ Math.sqrt(numero) );
    }
    
}
