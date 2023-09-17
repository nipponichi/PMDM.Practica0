package practica0;

import java.util.Scanner;

//Clase vehículo
public abstract class Vehiculo {
	
	private String tipo;
	private String marca;
	private String matricula;
	private long kilometros;
	private int deposito;
	private int distancia;
	private int consumo;
	private int depositoLleno;
	
	
	static Vehiculo coche = new Coche();
	static Vehiculo moto = new Moto();
	static Vehiculo camion = new Camion();
	
	//Constructores de vehículo
	Vehiculo(){
		
	}
	
	Vehiculo(String tipo, String marca, String matricula, long kilometros, int deposito){
		this.tipo = tipo;
		this.marca = marca;
		this.matricula = matricula;
		this.kilometros = kilometros;
		this.deposito = deposito;
	}
	
	//Muestra la información del vehículo
    public void info() {
		System.out.println("************************");
		System.out.println("Tipo: "+tipo);
		System.out.println("Marca: "+marca);
		System.out.println("Matricula: "+matricula);
		System.out.println("Kilometros: "+kilometros);
		System.out.println("Deposito: "+deposito);
		System.out.println("************************");
    }
    
	//El vehículo se desplaza 25km
    public void avance() {
		if (deposito >= consumo) {
			deposito -= consumo;
			kilometros += distancia;
			System.out.println("El "+tipo+" se desplaza "+distancia+"km");
		} else {
			System.out.println("El vehiculo no tiene suficiente gasolina para"
					+ "recorrer los "+distancia+"km");
		}
    }
    
	//Llena el depósito del vehículo
    public void llenado() {
		if (deposito < depositoLleno) {
			deposito = depositoLleno;
			System.out.println(tipo+": Deposito lleno a su maxima capacidad de "+deposito+"L");
		} else {
			System.out.println(tipo+": El deposito ya esta lleno");
		}
    }
	
    //Setter y Getter.
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
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public int getConsumo() {
		return consumo;
	}

	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

	public int getDepositoLleno() {
		return depositoLleno;
	}

	public void setDepositoLleno(int depositoLleno) {
		this.depositoLleno = depositoLleno;
	}

	//Metodo main
	public static void main(String[] args) {
		menu();
	}
	
	//Menu inicial
	static void menu() {
		int seleccion;
		boolean esMenu = false;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Selecciona una opcion:"
				+ "\n1.Informacion de vehiculos"
				+ "\n2.Mover vehiculos"
				+ "\n3.Llenar depositos"
				+ "\n4.Salir");
		
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
					cerrarPrograma();
				default:
					System.out.println("Selecciona una opcion valida");
					esMenu = true;
			}
		}while(esMenu);
		sc.close();
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
		System.out.println("************************"
				+ "\nEstado de los vehiculos actualizado:");
		infoVehiculo();
		menu();
	}
	
	static void llenarDeposito() {
		coche.llenado();
		moto.llenado();
		camion.llenado();
		menu();
	}
	
	static void cerrarPrograma() {
		System.out.println("Gracias por utilizar nuestro software");
		System.exit(0);
	}

	
}
