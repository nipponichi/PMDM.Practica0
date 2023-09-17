package practica0;

//Clase Coche hereda de vehículo
public class Coche extends Vehiculo {
	private String tipo = "Coche";
	private String marca = "Lada";
	private String matricula = "8546GZV";
	private long kilometros = 450000;
	private int deposito = 10;
	private int consumo = 2;
	private int distancia = 25;
	private int depositoLleno = deposito;
			;
	//Constructor clase Coche
	Coche(){
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
