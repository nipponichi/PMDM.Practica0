package practica0;

import java.util.Scanner;

public class Vehiculo {
	
	private String marca;
	private String matricula;
	private long kilometros;
	private int deposito;
	
	static Coche coche = new Coche();
	static Moto moto = new Moto();
	static Camion camion = new Camion();
	
	Vehiculo(){
		
	}
	
	Vehiculo(String marca, String matricula, long kilometros, int deposito){
		this.marca = marca;
		this.matricula = matricula;
		this.kilometros = kilometros;
		this.deposito = deposito;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public long getKilometros() {
		return kilometros;
	}

	public void setKilometros(long kilometros) {
		this.kilometros = kilometros;
	}

	public int getDeposito() {
		return deposito;
	}

	public void setDeposito(int deposito) {
		this.deposito = deposito;
	}

	
	
	public static void main(String[] args) {
		menu();
	}
	
	static void menu() {
		int seleccion;
		boolean esMenu = false;
		
		do {
			System.out.println("Selecciona una opcion:"
				+ "\n1.Informacion de vehiculos"
				+ "\n2.Mover vehiculos"
				+ "\n3.Llenar depositos"
				+ "\n4.Salir");
		
			Scanner sc = new Scanner(System.in);
			seleccion = sc.nextInt();
		
			switch(seleccion) {
				case 1:
					infoVehiculo();
					break;
				case 2:
					avanzarVehiculo();
					break;
				case 3:
					llenarDeposito();
					break;
				case 4:
					System.out.println("Cerrando programa");
					System.exit(0);
				default:
					System.out.println("Selecciona una opcion valida");
					esMenu = true;
			}
		}while(esMenu);
	}
	
	static void infoVehiculo() {
		coche.info();
		moto.info();
		camion.info();
		menu();
	}

	static void avanzarVehiculo() {
		coche.avance();
		moto.avance();
		camion.avance();
		menu();
	}
	
	static void llenarDeposito() {
		coche.llenado();
		moto.llenado();
		camion.llenado();
		menu();
	}
}
