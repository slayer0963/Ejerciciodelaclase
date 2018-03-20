/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author 14B06LA
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        
        
        double gravedad=9.8;
            double fuerza,masa;
            
            System.out.println("¿Ingrese la fuerza en Newton?");
            fuerza = r.nextDouble();
            
            masa = fuerza / gravedad;
            System.out.println("El peso de la maquina es: "+masa+"kg");
    }
    
}
