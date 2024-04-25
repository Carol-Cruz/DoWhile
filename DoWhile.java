package DoWhile;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		int numeros, soma = 0;

		Scanner captura = new Scanner(System.in);

		do {
			System.out.println("Digite um número:");
			numeros = captura.nextInt();
			if (numeros != 0 && numeros > 0) {
				soma += numeros;

			}

		} while (numeros != 0);

		if (numeros == 0) {
			System.out.println("A soma dos números positivos é: " + soma);
		}

	}
}