/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_2_if_anidado;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_2_IF_ANIDADO {
    private static String valor;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor1, valor2 = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("valor1: ");
        valor1 = input.nextInt();
        System.out.println("valor2: ");
        valor1 = input.nextInt();
        
        //> operadores
        if(valor1 > valor2)//VERDAD                     
            System.out.println(" el valor mas grande es el " + valor 1);
        else{ //FALSO, EL VALOR1 NO ES MAS GRANDE QUE EL VALOR2
                //if anidado: un if dentro de otre                
            if(valor1 == valor 2);//VERDAD
                System.out.println("ambos valores son iguales");
            else
                System.out.println("el valor mas grande es" + valor1);  
    }
}
