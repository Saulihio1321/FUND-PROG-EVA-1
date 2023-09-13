/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_9_area_de_triangulo;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_9_AREA_DE_TRIANGULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    double base;
    double altura;
    double area;
    Scanner captu = new Scanner(System.in);
    System.out.println("base de triangulo");
    base = captu.nextDouble();
    System.out.println("altura de triangulo");
    altura = captu.nextDouble();
    area=(base * altura)/2;
    System.out.println("area del triangulo");
    System.out.println(area);
    }
    
    
}
