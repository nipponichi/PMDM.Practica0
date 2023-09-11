package practica0;

public class Camion extends Vehiculo {
	private String marca = "Gaz";
	private String matricula = "5123MGJ";
	private long kilometros = 450000;
	private int deposito = 100;
	
	Camion() {
		setMarca(this.marca);
		setMatricula(this.matricula);
		setKilometros(this.kilometros);
		setDeposito(this.deposito);
	}
	
	public void info() {
		System.out.println("************************");
		System.out.println("Camion");
		System.out.println(marca);
		System.out.println(matricula);
		System.out.println(kilometros);
		System.out.println(deposito);
		System.out.println("************************");
	}
	
	public void avance() {
		if (deposito > 0) {
			deposito -= 3;
			System.out.println("El vehiculo se desplaza");
			kilometros += 25;
		} else {
			System.out.println("No tiene gasolina");
		}
	}
	
	public void llenado() {
		if (deposito < 100) {
			System.out.println("Deposito lleno");
			deposito = 100;
		} else {
			System.out.println("El deposito ya esta lleno");
		}
	}
}
