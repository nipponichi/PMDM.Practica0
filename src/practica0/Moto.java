package practica0;

//Clase Moto hereda de vehículo
public class Moto extends Vehiculo {
	private final String TIPO = "Moto";
	private final String MARCA = "Ural";
	private final String MATRICULA = "6469CLK";
	private final int CONSUMO = 1;
	private final long KILOMETROS = 16000;
	private final int DEPOSITO = 15;
	private final int DEPOSITO_LLENO = DEPOSITO;
			
	//Constructor clase Moto
	Moto(){
		setTipo(TIPO);
		setMarca(MARCA);
		setMatricula(MATRICULA);
		setKilometros(KILOMETROS);
		setDeposito(DEPOSITO);
		setConsumo(CONSUMO);
		setDepositoLleno(DEPOSITO_LLENO);
	}
}
