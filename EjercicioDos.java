/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodos;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioDos {

    /**
     * @param args the command line arguments
     * Se debe pedír un nombre y se debe mostrar el mismo nombre.
     * 
     */
    public static void main(String[] args) {
        String nombre;
        Scanner miEscanerNuevo = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        nombre= miEscanerNuevo.nextLine();
        System.out.println("Su nombre es: " + nombre);
        
        // TODO code application logic here
    }
    
}
