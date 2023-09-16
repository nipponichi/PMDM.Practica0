package practica0;

//Clase camión hereda de vehículo
public class Camion extends Vehiculo {
	private String marca = "Gaz";
	private String matricula = "5123MGJ";
	private long kilometros = 450000;
	private int deposito = 100;
	
	//Constructor clase Camión
	Camion() {
		setMarca(this.marca);
		setMatricula(this.matricula);
		setKilometros(this.kilometros);
		setDeposito(this.deposito);
	}
	
	//Obtenemos la información del vehículo.
	@Override
	public void info() {
		System.out.println("************************");
		System.out.println("Tipo: Camion");
		System.out.println("Marca: "+marca);
		System.out.println("Matricula: "+matricula);
		System.out.println("Kilometros: "+kilometros);
		System.out.println("Deposito: "+deposito);
		System.out.println("************************");
	}
	
	//El vehículo se desplaza 25km
	@Override
	public void avance() {
		if (deposito >= 3) {
			deposito -= 3;
			kilometros += 25;
			System.out.println("El vehiculo se desplaza 25km");
		} else {
			System.out.println("No tiene suficiente gasolina");
		}
	}
	
	//Llena el deposito del vehículo
	@Override
	public void llenado() {
		if (deposito < 100) {
			deposito = 100;
			System.out.println("Deposito lleno a su maxima capacidad de "+deposito+"L");
		} else {
			System.out.println("El deposito ya esta lleno");
		}
	}
}
