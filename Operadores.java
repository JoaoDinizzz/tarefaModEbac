package Operadoress;

public class Operadores {
	
	public static void main(String args[]) {
		operadores();
		logicos();
		
	}
	
	public static void operadores() {
		System.out.println("*****operadores*****");
		int Num1 = 10;
		int Num2 = 30;
		
		int operador = Num1 + Num2;
		int operador2 = Num1 - Num2;
		int operador3 = Num1 * Num2;
		int operador4 = Num1 / Num2;
		
		System.out.println(operador); 
		System.out.println(operador2);
		System.out.println(operador3);
		System.out.println(operador4);
	
	}
	
	public static void logicos() {
		
		int Num_1 = 10;
		int Num_2 = 20;		
		
		boolean operador1 = Num_1 >= 10 && Num_2 <= 20;
		System.out.println(operador1);
		
		boolean operador2 = Num_1 <= 10 || Num_2 >= 10;
		System.out.println(operador2);
		
		boolean operador3 = Num_1 >= 10;
		
		System.out.println(!operador3);
		
	}

}
