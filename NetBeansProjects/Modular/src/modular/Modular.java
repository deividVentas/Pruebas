/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modular;

import java.util.Scanner;

/**
 *
 * @author josmar01
 */
public class Modular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numero, numeros_positivos, numeros_pares;
        char sacar_piramide;
        //System.out.print("Introduzca un numero: ");
        //numero = sc.nextInt();
        //numeros_positivos = NumerosPositivos(numero);
        //System.out.println("Tienes " + numeros_positivos + " numeros positivos");
        //numeros_pares = Numeros_hasta_doscientos();
        //Tabla_Multiplicar();
        Menu();
    }
    public static int NumerosPositivos(int a)
    {
      Scanner sc = new Scanner(System.in);
      int contador_positivo = 0;
      int contador_negativo = 0;
      while (a != 0){
               
               if(a > 0) {
                 contador_positivo++;
               }
               else {
                 contador_negativo++;
               }
               System.out.print("Introduzca un número: ");
               a = sc.nextInt();
        }
        System.out.print("Tienes "+ contador_positivo + " positivos\n");
        System.out.print("Tienes "+ contador_negativo + " negativos\n");
        
        
        return contador_positivo;
    }
    public static int Numeros_hasta_doscientos()
    {
      int contador = 0;
      while (contador < 200){
          System.out.println(contador= contador + 2);
        }
      
      
      return contador;
    }
    public static void Tabla_Multiplicar()
    {
      int i;
      int j;
      char num = '*';
      for(i = 1; i <= 10; i++) {
          
          for(j = 1; j <= 10; j++){
            System.out.print(num*j);
            System.out.print("  ");
          }
          num ++;
          System.out.println();
       }
      
    }
    public static String Vocales(String x)
    {
        String es_vocal="si";
      if(x == "a" || x == "e" || x == "i" || x == "o" || x == "u")
          es_vocal = "Es una vocal";
      return es_vocal;
    }
    public static void Menu()
    {
      int eleccion, numero1, numeros_positivos;
      eleccion = 1;
      String vocal, que_vocal_es;
      Scanner sc = new Scanner(System.in); 
      while (eleccion != 0){
      System.out.println("Este es el menu de inicio, selecciones una opcion...");
      System.out.println("----------------------------------------------------");
      System.out.println("1) Funcion numeros positivos");
      System.out.println("2) Funcion primeros doscientos numeros positivos");
      System.out.println("3) Funcion tabla de multiplicar");
      System.out.println("4) Funcion vocales");
      System.out.println("-----------------------------------------------");
      System.out.println("Esperando respuesta...");  
      eleccion = sc.nextInt();
      switch(eleccion)
        {
          case 1: System.out.println("Introduzca un numero");
                  numero1 = sc.nextInt();
                  numeros_positivos = NumerosPositivos(numero1);
                  System.out.println("Tienes " + numeros_positivos + " numeros positivos");
                  break;
                
          case 2: Numeros_hasta_doscientos();
                  break;
        
          case 3: Tabla_Multiplicar();
                  break;
                  
          case 4: System.out.print("Introduce una vocal ");
                  vocal = sc.next();
                   System.out.print(Vocales(vocal));
                  
        }
      }
      System.out.print("Gracias por utilizarlo");
    }
 }
