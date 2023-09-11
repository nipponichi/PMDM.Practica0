package practica0;

public class Moto extends Vehiculo {
	private String marca = "Ural";
	private String matricula = "6469CLK";
	private long kilometros = 16000;
	private int deposito = 15;
	
	Moto(){
		setMarca(this.marca);
		setMatricula(this.matricula);
		setKilometros(this.kilometros);
		setDeposito(this.deposito);
	}
	
	public void info() {
		System.out.println("************************");
		System.out.println("Moto");
		System.out.println(marca);
		System.out.println(matricula);
		System.out.println(kilometros);
		System.out.println(deposito);
		System.out.println("************************");
	}
	
	public void avance() {
		if (deposito > 0) {
			deposito -= 1;
			System.out.println("El vehiculo se desplaza");
			kilometros += 25;
		} else {
			System.out.println("No tiene gasolina");
		}
	}
	
	public void llenado() {
		if (deposito < 15) {
			System.out.println("Deposito lleno");
			deposito = 15;
		} else {
			System.out.println("El deposito ya esta lleno");
		}
	}

}
