package tarefajava;

import java.util.Scanner;

public class tarefa2exercicio2 {public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
	int numero1,numero2,numero3;
	System.out.println("Escreva o primeiro número 1");
	numero1 = leia.nextInt();
	System.out.println("Escreva o primeiro número 2");
	numero2 = leia.nextInt();
	System.out.println("Escreva o primeiro número 3");
	numero3 = leia.nextInt();

	if(numero1==numero2 && numero2==numero3) {
		System.out.printf("%d -  %d - %d",numero1,numero2,numero3);
	}
	else if(numero1>numero2 && numero2>numero3) {
		System.out.printf("%d - %d - %d",numero3,numero2,numero1);
	}
	else if(numero1>numero2 && numero1>numero3 && numero3>numero2) {
		System.out.printf("%d - %d - %d",numero2,numero3,numero1);
	}
	else if(numero2>numero1 && numero2>numero3 && numero3>numero1) {
		System.out.printf("%d - %d - %d",numero1,numero3,numero2);
	}
	else if(numero3>numero1 && numero3>numero2 && numero2>numero1) {
		System.out.printf("%d - %d - %d",numero1,numero2,numero3);
	}
}
}
 
