package tarefajava;
import java.util.Scanner;

public class tarefa2execicio4 {
		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			
			int numero;
			
			System.out.println("Digite um numero par ou impar: ");
			numero = leia.nextInt();
			
			if(numero%2==0) {
				System.out.println(numero+" é par! e a raiz quadrada desse número é: "+Math.sqrt(numero));	
			}
			if(numero%2==1) {
				System.out.println(numero+" é ímpar! e esse número elevado ao quadrado é: "+Math.pow(numero, 2));
			}
		}
}
 