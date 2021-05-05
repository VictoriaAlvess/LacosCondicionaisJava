package primeira.lista;
/*
 * Faça um programa que entre com três números e coloque em ordem crescente.
 */
import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero1, numero2, numero3;
		
		System.out.println("Digite o primeiro número: ");
		numero1 = ler.nextInt();
		
		System.out.println("Digite o segundo número: ");
		numero2 = ler.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		numero3 = ler.nextInt();
		
		if (numero1 <= numero2 && numero2 <= numero3) {
			System.out.println("A ordem crescente é: " + numero1  + numero2 +  numero3);
			
		}else if(numero1 <= numero3 && numero3 <= numero2) {
			System.out.println("A ordem crescente é: " + " " + numero1 + " " + numero3 + " " + numero2);
			
		}else if(numero2 <= numero1 && numero1 <= numero3) {
			System.out.println("A ordem crescente é: " + numero2 + numero1 + numero3);
			
		}else if(numero2 <= numero3 && numero3 <= numero1) {
			System.out.println("A ordem crescente é: " + numero2 + numero3 + numero1);
			
		}else if(numero3 <= numero1 && numero1 <= numero2) {
			System.out.println("A ordem crescente é: " + numero3 + numero1 +  numero2);
			
		}else {
			System.out.println("A ordem crescente é: " + numero3 + numero2 + numero1);
			
		}
		
		
	
	}
}
