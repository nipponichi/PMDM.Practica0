package practica0;

//Clase moto hereda de vehículo
public class Moto extends Vehiculo {
	private String marca = "Ural";
	private String matricula = "6469CLK";
	private long kilometros = 16000;
	private int deposito = 15;
	
	//Constructor clase Moto
	Moto(){
		setMarca(this.marca);
		setMatricula(this.matricula);
		setKilometros(this.kilometros);
		setDeposito(this.deposito);
	}
	
	//Obtenemos la información del vehículo.
	@Override
	public void info() {
		System.out.println("************************");
		System.out.println("Tipo: Moto");
		System.out.println("Marca: "+marca);
		System.out.println("Matricula: "+matricula);
		System.out.println("Kilometros: "+kilometros);
		System.out.println("Deposito: "+deposito);
		System.out.println("************************");
	}
	
	//El vehículo se desplaza 25km
	@Override
	public void avance() {
		if (deposito >= 1) {
			deposito -= 1;
			kilometros += 25;
			System.out.println("El vehiculo se desplaza 25km");
		} else {
			System.out.println("No tiene suficiente gasolina");
		}
	}
	
	//Llena el deposito del vehículo
	@Override
	public void llenado() {
		if (deposito < 15) {
			deposito = 15;
			System.out.println("Deposito lleno a su maxima capacidad de "+deposito+"L");
		} else {
			System.out.println("El deposito ya esta lleno");
		}
	}

}
