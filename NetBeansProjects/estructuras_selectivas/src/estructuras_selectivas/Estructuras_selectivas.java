/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras_selectivas;
import java.util.*;
/**
 *
 * @author josmar01
 */
public class Estructuras_selectivas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 0;
        int contador_positivo = 0;
        int contador_negativo = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        num = sc.nextInt();
        while (num != 0){
               
               if(num > 0) {
                 contador_positivo++;
               }
               else {
                 contador_negativo++;
               }
               System.out.print("Introduzca un número: ");
               num = sc.nextInt();
        }
        System.out.print("Tienes "+ contador_positivo + " positivos\n");
        System.out.print("Tienes "+ contador_negativo + " negativos\n");
    }
    
}
    
