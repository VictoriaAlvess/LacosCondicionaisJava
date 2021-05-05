package primeira.lista;

import java.util.Scanner;

/*
 * 4-	Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. 
 * Se for par exiba também a raiz quadrada do mesmo; 
 * se for ímpar exiba o número elevado ao quadrado.
 */
public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite o número: ");
		numero = ler.nextInt();
		
		if (numero % 2 == 0) {
            System.out.println("Esse numero é par");
            System.out.println("Sua raiz quadrada é igual a: " + Math.sqrt(numero));
        } else {
            System.out.println("Esse numero é impar");
            System.out.println("O número elevado ao quadrado é igual a: " + Math.pow(numero, 2));
        }
	}
}
