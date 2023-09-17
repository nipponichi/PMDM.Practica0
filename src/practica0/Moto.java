package practica0;

//Clase Moto hereda de vehículo
public class Moto extends Vehiculo {
	private String tipo = "Moto";
	private String marca = "Ural";
	private String matricula = "6469CLK";
	private long kilometros = 16000;
	private int deposito = 15;
	private int consumo = 1;
	private int distancia = 25;
	private int depositoLleno = deposito;
			
	//Constructor clase Moto
	Moto(){
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
