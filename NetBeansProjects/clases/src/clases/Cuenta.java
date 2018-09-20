/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author josmar01
 */
public class Cuenta {
    private String nombre;
    private String numero_cuenta;
    private double intereses;
    private double saldo;

    public Cuenta(String nombre, String numero_cuenta, double intereses, double saldo) {
        this.nombre = nombre;
        this.numero_cuenta = numero_cuenta;
        this.intereses = intereses;
        this.saldo = saldo;
    }

   

    public Cuenta() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(String numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public double getIntereses() {
        return intereses;
    }

    public void setIntereses(double intereses) {
        this.intereses = intereses;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
     @Override
    public String toString() {
        return "Cuenta{" + "nombre=" + nombre + ", numero_cuenta=" + numero_cuenta + ", intereses=" + intereses + ", saldo=" + saldo + '}';
    }
    public boolean Ingreso(int ingresar){
        if (ingresar < 0)
        {
          return false;
        }
        else
        {
                  saldo = saldo + ingresar;
                  return true;
        }
    }
    public boolean Reintegro(int retirar)
    {
        boolean ok;
        
        if (retirar > saldo)
        {
           ok = false;
        }
        else
        {
           saldo = saldo - retirar;
           ok = true;
        }
        return ok;
    }
    public boolean Transferencia(Cuenta c, int cantidad)
    {
        boolean ok;
        if (c.saldo > cantidad)
        {
            ok = true;
            c.saldo = saldo - cantidad;
            this.saldo = saldo + cantidad;
        }
        else
        {
            ok = false;
        }
        return ok;
    }
}
