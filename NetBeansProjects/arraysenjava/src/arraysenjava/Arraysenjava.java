/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysenjava;

import java.util.*;

/**
 *
 * @author josmar01
 */
public class Arraysenjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int longitud = 40;
        ArrayList<Integer> a = new ArrayList<>(longitud);
        Random r1 = new Random(100);
        for(int i=0;i < longitud;i++){
         a.add(r1.nextInt());
        }
        for(int i=0;i < a.size();i++){
         System.out.println(a.get(i));
        }
        System.out.println("Tamaño del vector " + a.size());
    }
    
}
