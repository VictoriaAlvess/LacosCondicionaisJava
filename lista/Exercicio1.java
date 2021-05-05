package primeira.lista;

import java.util.Scanner;

/*
 *Faça um programa que receba três inteiros e diga qual deles é o maior.
 */

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero1, numero2, numero3, numeroMaior=0;
		
		System.out.println("Digite o primeiro número: ");
		numero1 = ler.nextInt();
		
		System.out.println("Digite o segundo número: ");
		numero2 = ler.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		numero3 = ler.nextInt();
		
		if (numero1 > numero2 && numero1 > numero3) {
			numeroMaior = numero1;
			
		}else if (numero2 > numero1 && numero2 > numero3) {
			numeroMaior = numero2;
			
		}else if (numero3 > numero1 && numero3 > numero2) {
			numeroMaior = numero3;
		}
		
		System.out.println("O maior número digitado foi: " + numeroMaior);
	}
}
