/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import java.util.*;
/**
 *
 * @author josmar01
 */
public class Clases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String nombre, numero;
        double tipo, importe;

        //se crea objeto cuenta1 sin parámetros
        //se ejecuta el constructor por defecto
        Cuenta cuenta1 = new Cuenta("Juan Ferrández Rubio", "12345678901234567890", 1.75, 300);
        Cuenta cuenta2 = new Cuenta("Juan Ferrández Rubio", "12345678901234567890", 1.75, 300);
        Cuenta cuenta3 = new Cuenta("Juan Ferrández Rubio", "12345678901234567890", 1.75, 300);
       /* System.out.print("Nombre : ");
        nombre = sc.nextLine();
        System.out.print("Número de cuenta : ");
        numero = sc.nextLine();
        System.out.print("Tipo de interes : ");
        tipo = sc.nextDouble();
        System.out.print("Saldo: ");
        importe = sc.nextDouble();

        cuenta1.setNombre(nombre);
        cuenta1.setNumero_cuenta(numero);
        cuenta1.setIntereses(tipo);
        cuenta1.setSaldo(importe);*/
        
        //System.out.println(cuenta1.getNombre());
        
        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());
        System.out.println(cuenta3.toString());
        
        /*if (cuenta1.Ingreso(1000)){
            System.out.println("El saldo es: "+ cuenta1.getSaldo());
        }
        else
        {
            System.out.println("La operación no se ha podido realizar");
        }
        if (cuenta1.Reintegro(3200))
        {
            System.out.println("Tu saldo actual es de " + cuenta1.getSaldo());
        }
        else
        {
            System.out.println("La operacion no se a podido realizar");
        }
        */
        if (cuenta1.Transferencia(cuenta2, 100))
        {
            System.out.println("Tu saldo de C1 es " + cuenta1.getSaldo());
            System.out.println("El saldo de C2 es "+ cuenta2.getSaldo());
        }
        else
        {
            System.out.println("No se ha podido realizar con exito");
        }
    }
}
