package practica0;

//Clase Camion hereda de vehículo
public class Camion extends Vehiculo {
	private String tipo = "Camion";
	private String marca = "Gaz";
	private String matricula = "5123MGJ";
	private long kilometros = 450000;
	private int deposito = 100;
	private int consumo = 3;
	private int distancia = 25;
	private int depositoLleno = deposito;
	
	//Constructor clase Camión
	Camion(){
		setTipo(tipo);
		setMarca(marca);
		setMatricula(matricula);
		setKilometros(kilometros);
		setDeposito(deposito);
		setConsumo(consumo);
		setDistancia(distancia);
		setDepositoLleno(depositoLleno);
	}
}
