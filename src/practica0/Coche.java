package practica0;

//Clase Coche hereda de vehículo
public class Coche extends Vehiculo {
	private final String TIPO = "Coche";
	private final String MARCA = "Lada";
	private final String MATRICULA = "8546GZV";
	private final int CONSUMO = 2;
	private final long KILOMETROS = 33000;
	private final int DEPOSITO = 10;
	private final int DEPOSITO_LLENO = DEPOSITO;
	
	
	//Constructor clase Coche
	Coche(){
		setTipo(TIPO);
		setMarca(MARCA);
		setMatricula(MATRICULA);
		setKilometros(KILOMETROS);
		setDeposito(DEPOSITO);
		setConsumo(CONSUMO);
		setDepositoLleno(DEPOSITO_LLENO);
	}	
}
