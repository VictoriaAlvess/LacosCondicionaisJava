package primeira.lista;

import java.util.Scanner;

/*
 * 4-	Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar. 
 * Se for par exiba tamb�m a raiz quadrada do mesmo; 
 * se for �mpar exiba o n�mero elevado ao quadrado.
 */
public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite o n�mero: ");
		numero = ler.nextInt();
		
		if (numero % 2 == 0) {
            System.out.println("Esse numero � par");
            System.out.println("Sua raiz quadrada � igual a: " + Math.sqrt(numero));
        } else {
            System.out.println("Esse numero � impar");
            System.out.println("O n�mero elevado ao quadrado � igual a: " + Math.pow(numero, 2));
        }
	}
}
