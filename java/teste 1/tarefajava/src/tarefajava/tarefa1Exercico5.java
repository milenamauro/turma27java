package tarefajava;

import java.util.Scanner;

public class tarefa1Exercico5 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int media,n1,n2,n3;
		
		System.out.println("Notas do aluno X:");
		n1 = 2;
		System.out.println("Nota 1: "+n1);
		n2 = 3;
		System.out.println("Nota 2: "+n2);
		n3 = 5;
		System.out.println("Nota 3: "+n3);
		
		media = n1+n2+n3/3;
		System.out.println("O aluno, com as respectivas notas: 2 ,3 e 5 teve"+media+" de média");
	
		
	}
}