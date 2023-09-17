package practica0;

//Clase Coche hereda de vehículo
public class Coche extends Vehiculo {
	private static String marca = "Lada";
	private static String matricula = "8546GZV";
	private static long kilometros = 450000;
	private static int deposito = 10;
	
	//Constructor clase Coche
	Coche(){
		setMarca(marca);
		setMatricula(matricula);
		setKilometros(kilometros);
		setDeposito(deposito);
	}
	
	////Obtenemos la información del vehículo.
	@Override
	public void info() {
		System.out.println("************************");
		System.out.println("Tipo: Coche");
		System.out.println("Marca: "+marca);
		System.out.println("Matricula: "+matricula);
		System.out.println("Kilometros: "+kilometros);
		System.out.println("Deposito: "+deposito);
	}
	
	//El vehículo se desplaza 25km
	@Override
	public void avance() {
		if (deposito >= 2) {
			deposito -= 2;
			kilometros += 25;
			System.out.println("El coche se desplaza 25km");
		} else {
			System.out.println("No tiene suficiente gasolina");
		}
	}
	
	//Llena el deposito del vehículo
	@Override
	public void llenado() {
		if (deposito < 10) {
			deposito = 10;
			System.out.println("Deposito lleno a su maxima capacidad de "+deposito+"L");
		} else {
			System.out.println("El deposito ya esta lleno");
		}
	}
	
}
