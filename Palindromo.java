package main.java;

import java.util.Scanner;

public class Palindromo {
	public static void main(String[] args) {

		String texto; // Variável receberá o texto digitado

		Scanner leitor = new Scanner(System.in);

		System.out.printf("Digite uma palavra/texto/sequencia: ");

		texto = leitor.nextLine();

		verifica(texto);
		verifica2(texto);
		verifica3(texto);

	}

	// verifica o arquivo recebido comparando a primeira e a ultima letra.
	static boolean verifica(String texto) {

		int contadorTexto1 = 0;
		int contadorTexto2 = texto.length() - 1;

		while (contadorTexto1 < contadorTexto2) {

			if (texto.charAt(contadorTexto1) != texto.charAt(contadorTexto2)) {
				System.out.println("A palavra " + texto + "nao é um palindromo");
				return false;
			}
			contadorTexto1++; // contadorTexto1 = contadorTexto1+1;
			contadorTexto2--; // contadorTexto2 = contadorTexto2-1;
		}
		System.out.println("A palavra " + texto + " é um palindromo");
		return true;
	}
	
	
	// Inverte o texto recebido em outra string e verifica se as duas são iguais
	static boolean verifica2(String texto) {

		StringBuffer buffer = new StringBuffer(texto);
		String texto2 = buffer.reverse().toString();

		if (texto.equalsIgnoreCase(texto2)) {
			System.out.println("A palavra " + texto + " é um palindromo");
			return true;
		} else {
			System.out.println("A palavra " + texto + "não é um palindromo");
			return false;
		}
	}

	
	//Invertendo o texto recebido manualmente. (caractere por caractere)
	static boolean verifica3(String texto) {
		
		StringBuilder sb = new StringBuilder();
		
		for(int contador=texto.length()-1; contador>=0; contador--) {
			sb.append(texto.charAt(contador));
		}
		
		String texto2=sb.toString();
		
		if (texto.equalsIgnoreCase(texto2)) {
			System.out.println("A palavra " + texto + " é um palindromo");
			return true;
		} else {
			System.out.println("A palavra " + texto + "não é um palindromo");
			return false;
		}
	}
	

}