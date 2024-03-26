package treinamento;

import java.util.Scanner;

public class AlunoNotas {
    
    public static void main(String args[]) {
       Scanner scanner = new Scanner(System.in);
       
       double nota1;
       double nota2;
       double nota3;
       double nota4;
       
       System.out.println("Digite sua primeira nota: ");
       nota1 = scanner.nextDouble();
       System.out.println("Digite sua segunda nota: ");
       nota2 = scanner.nextDouble();
       System.out.println("Digite sua terceira nota: ");
       nota3 = scanner.nextDouble();
       System.out.println("Digite sua quarta nota: ");
       nota4 = scanner.nextDouble();
       
       double media = (nota1 + nota2 + nota3 + nota4) / 4.0;
       
       if (media >= 7) {
    	   System.out.println("Você foi aprovado com a média: " + media);
       } else if (media >= 5 && media <=7 ) {
    	   System.out.println("Você está de recuperação");
       } else {
    	   System.out.println("Você está reprovado");
       }
       
    }
}
