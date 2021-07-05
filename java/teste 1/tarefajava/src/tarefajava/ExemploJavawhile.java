package tarefajava;

import java.util.*;
public class ExemploJavawhile { public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	
	int numero;
	int cont=1;
	int aux = 1;
	
	System.out.println("Digite um numero positivo: ");
	numero = read.nextInt();
	
	if(numero<=0) {
		System.out.println("Numero invalido!");
	}else {
		do {
			System.out.printf("%d + ", cont);
			cont ++;
			aux = aux +cont;
			
		}while(cont < numero);
		System.out.println(numero+" = "+aux);
	}
	
}

}
 
