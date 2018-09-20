/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;
import java.util.*;
/**
 *
 * @author josmar01
 */
public class Metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numero1, numero2, resultado;
        System.out.print("Introduce primer numero: ");
        numero1 = sc.nextInt();
        System.out.print("Introduce segundo numero: ");
        numero2 = sc.nextInt();
        resultado = sumar(numero1, numero2);
        System.out.println("Suma: " + resultado);
    }
    
    public static int sumar(int a, int b)
    {
      int c;
      c = a + b;
      return c;
    }
    
}
