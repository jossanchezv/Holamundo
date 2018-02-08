/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Holamundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Cuál es tu nombre?");
        Scanner sc = new Scanner(System.in);
        String nombre;
        nombre = sc.nextLine ();
        System.out.println("Hola "+ nombre);
    }
    
}
