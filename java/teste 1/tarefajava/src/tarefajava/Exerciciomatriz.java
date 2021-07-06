package tarefajava;
import java.util.Scanner;
public class Exerciciomatriz {
public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		//String alunos[] = new String[4]; //0...3
		
		String alunos[] = {"JOAO", "MARCOS", "MARIA", "pedro"};
		String matricula[] = new String[4];
		int notas[] = new int[4];
		String aux;
		
		
		final int LIMITE=4;
		System.out.println("Cadastro de notas");
		for (int x=0; x<alunos.length; x++) {
			System.out.println("Aluno "+(x+1));
			matricula[x]=  "MAT-"+(x+1);
			System.out.print("Matricula "+matricula[x]+" alune "+alunos[x].toUpperCase()+" : ");
			notas[x] = read.nextInt();
			
		}
		System.out.println("BOLETIM");
		for (int x=0; x<LIMITE; x++) {
			if (notas[x]>=5) {
				System.out.printf("%s - %s nota : %d APROVADO\n",matricula[x],alunos[x].toUpperCase(),notas[x] );
			} else {
				System.out.printf("%s - %s nota : %d AINDA NAO, CONTINUE ESTUDANDO!!!\n",matricula[x],alunos[x].toUpperCase(),notas[x] );
			}
			
		}
		
		System.out.println("Escolha o aluno que deseja pesquisa a nota pela matricula");
		System.out.println("Digite a matricula");
		aux = read.next().toUpperCase();
		
		for (int x=1; x<4; x++) {
			//if (matricula[x].equals(aux)) {
			if (matricula[x].equals(aux)) {
				if (notas[x]>=5) {
					System.out.printf("%s - %s nota : %d APROVADO\n",matricula[x],alunos[x].toUpperCase(),notas[x] );
				} else {
					System.out.printf("%s - %s nota : %d AINDA NAO, CONTINUE ESTUDANDO!!!\n",matricula[x],alunos[x].toUpperCase(),notas[x] );
				}
			}
		}
		
		
	}

} 