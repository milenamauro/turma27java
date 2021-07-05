package tarefajava;

import java.util.Scanner;

//*Faça um programa em que permita a entrada de um número qualquer e exiba 
	// se este número é par ou ímpar. Se for par exiba também a raiz quadrada
	//do mesmo; se for ímpar exiba o número elevado ao quadrado.

public class tarefa2exercicio4 {
   public static void main(string[] args) {
	   Scanner read=new Scanner (System.in);
	   int numero;
	   
	   System.out.println("digite um número:  \n");
	   numero=read.nextInt();
	   if ((numero%2)==0)
		   Sytem.out.printf("O numero é par e sua raíz quadrada é: %.2f/n", Math.sqrt(numero,2))
	   
   }
   else {
	   Sytem.out.printf("O numero é imppar e seu quadrado é: %.2f/n", Math.pow(numero,2))
	   
	   
   }
   
   
   
	 
	 
	
	 
}
