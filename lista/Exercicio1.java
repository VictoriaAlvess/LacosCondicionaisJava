package primeira.lista;

import java.util.Scanner;

/*
 *Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
 */

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero1, numero2, numero3, numeroMaior=0;
		
		System.out.println("Digite o primeiro n�mero: ");
		numero1 = ler.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		numero2 = ler.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		numero3 = ler.nextInt();
		
		if (numero1 > numero2 && numero1 > numero3) {
			numeroMaior = numero1;
			
		}else if (numero2 > numero1 && numero2 > numero3) {
			numeroMaior = numero2;
			
		}else if (numero3 > numero1 && numero3 > numero2) {
			numeroMaior = numero3;
		}
		
		System.out.println("O maior n�mero digitado foi: " + numeroMaior);
	}
}
