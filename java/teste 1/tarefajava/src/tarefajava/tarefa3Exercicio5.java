  
/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/

package tarefajava;

import java.util.Scanner;

public class tarefa3Exercicio5 {
		public static void main (String[] args) {
			
			Scanner reader = new Scanner (System.in);
			
			double numero = 0.0, soma = 0.0;
			
			do {
				System.out.println("Digite um número, para parar e exibir o resultado digite \"0\"");
				numero = reader.nextDouble();
				soma += numero;
			}while(numero != 0);
			
			System.out.println("Soma de todos os números digitados: " + soma);
		}
	}