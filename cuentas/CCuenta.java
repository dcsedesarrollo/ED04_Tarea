/**
 * Esta clase representa una cuenta bancaria.
 * Contiene variables encapsuladas, el método constructor por defecto, el constructor por parámetros y métodos getters y setters.
 */

package cuentas;
public class CCuenta {

	/** Variables encapsuladas */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /** Método constructor vacío*/
    public CCuenta()
    {
    }

    /** Método constructor con parámetros*/
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /** Método estado, devuelve el saldo */
    public double estado()
    {
        return saldo;
    }

    /** Método ingresar dinero. Si se inserta una cantidad menor a cero devuelve una excepción */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /** Método retirar dinero. Si se inserta una cantidad menor a cero devuelve una excepción */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    
    /** Método operativa_cuenta. Se deben dar dos parámetros */
    public void operativa_cuenta (CCuenta cuenta, float cantidad) {
    	double saldoActual;
    	
    	saldoActual = cuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
    
}
