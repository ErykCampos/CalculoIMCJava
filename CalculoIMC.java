package Desafios;

import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Qual seu peso? ");
		double peso = entrada.nextDouble();
		
		System.out.print("Qual sua altura? ");
		double altura = entrada.nextDouble();
		
		double imc = peso / Math.pow(altura, 2);
		
		System.out.printf("Seu IMC é... %.2f", imc);
		
		entrada.close();
	}
}
