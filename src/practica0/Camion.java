package practica0;

//Clase Camion hereda de vehículo
public class Camion extends Vehiculo {
	private final String TIPO = "Camion";
	private final String MARCA = "Gaz";
	private final String MATRICULA = "5123MGJ";
	private final int CONSUMO = 3;
	private final long KILOMETROS = 450000;
	private final int DEPOSITO = 100;
	private final int DEPOSITO_LLENO = DEPOSITO;
	
	//Constructor clase Camión
	Camion(){
		setTipo(TIPO);
		setMarca(MARCA);
		setMatricula(MATRICULA);
		setKilometros(KILOMETROS);
		setDeposito(DEPOSITO);
		setConsumo(CONSUMO);
		setDepositoLleno(DEPOSITO_LLENO);
	}
}
