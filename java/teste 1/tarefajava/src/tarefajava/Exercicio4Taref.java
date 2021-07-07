package tarefajava;

import java.util.Scanner;

/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação 
de uma atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente. 
*/
public class Exercicio4Taref 
{public static void main (String[] args) {
	
	Scanner reader = new Scanner (System.in);
	
	int pontuacao[] = new int[5];
	int maior = 0;
	
	for (int i = 0; i < 5;i++) {
		
		System.out.println("Tecle a " + (i+1) + "ª pontuação: ");
		pontuacao[i] = reader.nextInt();
		
		if (pontuacao[i] > maior){
			maior = pontuacao[i];
		}
	}
	
	System.out.println("Maior pontuação foi: " + maior);
	
}
}