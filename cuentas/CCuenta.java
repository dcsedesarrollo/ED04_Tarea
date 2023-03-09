/**
 * Esta clase representa una cuenta bancaria.
 * Contiene variables encapsuladas, el m�todo constructor por defecto, el constructor por par�metros y m�todos getters y setters.
 */

package cuentas;
public class CCuenta {

	/** Variables encapsuladas */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /** M�todo constructor vac�o*/
    public CCuenta()
    {
    }

    /** M�todo constructor con par�metros*/
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /** M�todo estado, devuelve el saldo */
    public double estado()
    {
        return saldo;
    }

    /** M�todo ingresar dinero. Si se inserta una cantidad menor a cero devuelve una excepci�n */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /** M�todo retirar dinero. Si se inserta una cantidad menor a cero devuelve una excepci�n */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    
    /** M�todo operativa_cuenta. Se deben dar dos par�metros */
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
