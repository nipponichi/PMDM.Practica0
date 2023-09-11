package practica0;

public class Coche extends Vehiculo {
	private static String marca = "Lada";
	private static String matricula = "8546GZV";
	private static long kilometros = 450000;
	private static int deposito = 10;
	
	Coche(){
		setMarca(marca);
		setMatricula(matricula);
		setKilometros(kilometros);
		setDeposito(deposito);
	}
	
	public void info() {
		System.out.println("************************");
		System.out.println("Coche");
		System.out.println(marca);
		System.out.println(matricula);
		System.out.println(kilometros);
		System.out.println(deposito);
		System.out.println("************************");
	}
	
	public void avance() {
		if (deposito > 0) {
			deposito -= 2;
			System.out.println("El vehiculo se desplaza");
			kilometros += 25;
		} else {
			System.out.println("No tiene gasolina");
		}
	}
	
	public void llenado() {
		if (deposito < 10) {
			System.out.println("Deposito lleno");
			deposito = 10;
		} else {
			System.out.println("El deposito ya esta lleno");
		}
	}
	
}
