package cuentas;

public class Main {
	public static void main(String[] args) {

		CCuenta Cuenta1;
		Cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);

		operativa_cuenta(Cuenta1, 2300);
	}

	private static void operativa_cuenta(CCuenta Cuenta1, float cantidad) {

		double saldoActual;

		saldoActual = Cuenta1.estado();
		System.out.println("El saldo actual es " + saldoActual);
		try {
			Cuenta1.retirar(2300);
		} catch (Exception e) {
			System.out.print("Fallo al retirar");
		}
		try {
			System.out.println("Ingreso en cuenta");
			Cuenta1.ingresar(695);
		} catch (Exception e) {
			System.out.print("Fallo al ingresar");
		}
	}

}
