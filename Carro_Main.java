package objetoClasse;

public class Carro_Main {
	
	public static void main(String[]  args) {
		Carro carro = new Carro();
		System.out.println("O modelo do carro é: " + carro.modeloHoje());
		System.out.println("O ano do carro é: " + carro.anoAtual());
		System.out.println("O valor do carro é: " + carro.valorAtual());
	}
}
