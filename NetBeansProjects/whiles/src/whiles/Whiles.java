/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whiles;
import java.util.*;
/**
 *
 * @author josmar01
 */
public class Whiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       char num='*';
       int i=1;
       int j=1;
       for(i = 1; i <= 6; i++) {
         
          for(j=1; j <= 10; j++){
            System.out.print(num);
          }
          System.out.println(" ");
       }
       
       /*for(i = 1; i <= 10; i++) {
          
          for(j = 1; j <= 10; j++){
            System.out.print(num*j);
            System.out.print("  ");
          }
          num ++;
          System.out.println();
       }*/
        
        /*while (num < 200){
            System.out.println(num+=2);
        }*/
        /*for(i = 0; i <5; i++) {
          for(j = 0; j <5; j++){
            System.out.print(num);
          }
          System.out.println();

        }*/
        /*while (contador < 200){
          contador ++;
          System.out.print(contador+" - ");
          System.out.println(num= num + 2);
        }*/
        
        
    }
}
    