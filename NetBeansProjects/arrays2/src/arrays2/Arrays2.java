/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays2;
import java.util.*;
/**
 *
 * @author josmar01
 */
public class Arrays2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        boolean encontrado = false;
        int i, valor,buscando;
        int[] a = new int [100000]; //array de 7 elementos
        Random r1 = new Random(100);
       
        for( i=0;i < a.length;i++){
         a[i] = r1.nextInt();
        }
        
        /*
        System.out.println("Indica el valor que vas a buscar");
        buscando = sc.nextInt();
        
        for (i = 0; i < a.length && !encontrado; i++) 
        {
          if (buscando == a[i])
          {
            encontrado = true;
            System.out.println("El elemento "+ buscando + " está en la posicion " + i);
          }
          //se muestra cada elemento del array
        }
        if (!encontrado)
        {
          System.out.println("No existe");
        }*/
        long time_start, time_end;
        
        /*for( i=0;i < a.length;i++){
          System.out.println(a[i]);
        }*/
        time_start = System.currentTimeMillis();
        Insercion(a);
        time_end = System.currentTimeMillis();
        System.out.println("El tiempo del algoritmo Insercion es " + (time_end - time_start));
        /*for( i=0;i < a.length;i++){
          System.out.println(a[i]);
        }*/
        time_start = System.currentTimeMillis();
        Seleccion(a);
        time_end = System.currentTimeMillis();
        System.out.println("El tiempo del algoritmo Seleccion es " + (time_end - time_start));
        /*for( i=0;i < a.length;i++){
          System.out.println(a[i]);
        }*/
        time_start = System.currentTimeMillis();
        shellSort(a);
        time_end = System.currentTimeMillis();
        System.out.println("El tiempo del algoritmo shellsort es " + (time_end - time_start));
        /*for( i=0;i < a.length;i++){
          System.out.println(a[i]);
        }*/time_start = System.currentTimeMillis();
        burbuja(a);
        time_end = System.currentTimeMillis();
        System.out.println("El tiempo del algoritmo burbuja es " + (time_end - time_start));
        
        
    }
   public static int[] Insercion (int[] vector) {
      for (int i=1; i < vector.length; i++) {
         int aux = vector[i];
         int j;
         for (j=i-1; j >=0 && vector[j] > aux; j--){
              vector[j+1] = vector[j];
          }
         vector[j+1] = aux;
      }
      return vector;
   }
   
   
   public static int[] Seleccion(int[]matrix){
        int i, j, k, p, buffer, limit = matrix.length-1;
        for(k = 0; k < limit; k++){
            p = k;
            for(i = k+1; i <= limit; i++){
                if(matrix[i] < matrix[p]) p = i;
                if(p != k){
                    buffer = matrix[p];
                    matrix[p] = matrix[k];
                    matrix[k] = buffer;
                }
            }
        }
        return matrix;
    }
   
   public static int[] shellSort(int[] matrix) {
    for ( int increment = matrix.length / 2;increment > 0;
          increment = (increment == 2 ? 1 : (int) Math.round(increment / 2.2))) {
        for (int i = increment; i < matrix.length; i++) {
            for (int j = i; j >= increment && matrix[j - increment] > matrix[j]; j -= increment) {
                int temp = matrix[j];
                matrix[j] = matrix[j - increment];
                matrix[j - increment] = temp;
            }
        }
    }
    return matrix;
}
   
    public static int[] burbuja(int[]matrix){
        int temp;
        for(int i=1;i < matrix.length;i++){
            for (int j=0 ; j < matrix.length- 1; j++){
                if (matrix[j] > matrix[j+1]){
                    temp = matrix[j];
                    matrix[j] = matrix[j+1];
                    matrix[j+1] = temp;
                }
            }
        }
        
        /*for(int i=1;i < matrix.length;i++){
          System.out.println(matrix[i]);
        }*/
        return matrix;
    }
}
