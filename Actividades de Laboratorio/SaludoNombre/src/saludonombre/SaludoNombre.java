/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package saludonombre;
import java.util.Scanner;
/**
 *
 * @author sugey
 */
public class SaludoNombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          String nombre;

         Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca su nombre: ");
        nombre = entrada.nextLine();
        System.out.println("¡Hola " + nombre + "!");
    }
    
}
