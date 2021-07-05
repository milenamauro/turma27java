package tarefajava;

//Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5

import java.util.Scanner;

public class Tarefa3exercicio1{

	public static void main(String[] args) {
		
		System.out.println("Todos os números que dividos por 11, o resto é 5");
		
		for (int i = 1000; i <= 1999; i ++) {
		
			if (i % 11 == 5) {
				System.out.println(i);
			}
		}	
	}
}