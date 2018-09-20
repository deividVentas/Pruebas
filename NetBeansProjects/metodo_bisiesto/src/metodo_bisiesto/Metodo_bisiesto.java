/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo_bisiesto;
import java.util.*;
/**
 *
 * @author josmar01
 */
public class Metodo_bisiesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int año;
        System.out.print("Introduzca el año ");
        año = sc.nextInt();
        if(esBisiesto(año))
            System.out.println("Bisiesto");
        else
            System.out.println("No es bisiesto");
    }
    public static boolean esBisiesto(int a)
    {
      if(a%4==0 && a%100!=0 || a%400==0)
          return true;
      else
          return false;
    }
}
