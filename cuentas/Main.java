package cuentas;
public class Main {

    public static void main(String[] args) {
    	/** Se crean las variables */
        CCuenta cuenta1;
        double saldoActual;

        /** Se crea el objeto cuenta */
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        
        /** Se llama al m�todo estado, que se cre� en la clase CCuenta */
        saldoActual = cuenta1.estado();
        
        /** Se imprime el saldo actual en pantalla */
        System.out.println("El saldo actual es"+ saldoActual );

        /** Con una expresi�n try-catch, se intenta retirar dinero. Si falla, devuelve un mensaje.*/
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
