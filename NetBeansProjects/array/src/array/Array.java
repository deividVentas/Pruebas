/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;
import java.util.*;
/**
 *
 * @author josmar01
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int i, valor;
        int [] a = new int[10];
        
        for (int j = 0; j < 10; j++)
        {
          System.out.print("Posicion: ");
          i = sc.nextInt();
          System.out.print("Valor: ");
          valor = sc.nextInt();
          
          if (i > 0 && i < a.length)
          {
            if (a[i] == 0)
            {
              a[i] = valor;
            }
            else 
            {
              System.out.println("Posicion ocupada");
            }
            
          }
        }
       for (i = 0; i < a.length; i++) {
        System.out.print(a[i] + " "); //se muestra cada elemento del array
        }
    }
    
}
