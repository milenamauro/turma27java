package tarefajava;

import java.util.Scanner;

public class tarefa1exercicio2 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int dias,meses,anos,idade,idadeemDias;
		
		System.out.println("Insira sua idade em dias aqui: \n");
		idadeemDias = read.nextInt();
		
		anos = idadeemDias/365;
		meses = (idadeemDias%365);
		dias = (idadeemDias%365)%30;
		System.out.println("Você tem: "+anos+" anos de idade, "+meses+" meses e "+dias+" dias de vida!");
		
	}
}