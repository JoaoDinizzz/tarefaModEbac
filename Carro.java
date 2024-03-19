package objetoClasse;

public class Carro {
	
	private double valor;
	private String modelo;


	public static void main(String[] args) {

	}
	
	
	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String modeloHoje() {
		return "Nissan";
	}
	
	public int anoAtual() {
		return 2024;
	}
	
	public double valorAtual() {
		return 96.567;
	}
} 

