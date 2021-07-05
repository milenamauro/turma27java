//Uma empresa desenvolveu uma pesquisa para saber as características psicológicas
//dos indivíduos de uma região. Para tanto, a cada uma das pessoas era perguntado: 
//idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções (1, se a pessoa era
//calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). Pede-se para elaborar um sistema 
// que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
package tarefajava;

import java.util.Scanner;

public class Tarefa3exercicio4 {

	
		static Scanner reader = new Scanner (System.in);
		
		public static void main(String[] args) {
		
			int idade = 0, sexo = 0, personalidade = 0, calmos = 0, 
					mulheresNervosas = 0, homensAgressivos = 0, 
					outrosCalmos = 0, acimaDeQuarentaNervosos = 0, menoresDeIdadeCalmos = 0;
			char op = 'S';
			
			System.out.println("Pesquisa de personalidade");
			int i = 0;
			while (i < 150 && op == 'S') {
				System.out.println("Digite a idade do participante: ");
				idade = reader.nextInt();
				while (idade <= 0) {
					System.out.println("Digite uma idade válida: ");
					idade = reader.nextInt();
				}
				System.out.println("Digite o sexo do participante (1-feminino / 2-masculino / 3-outros): ");
				sexo = validar();
				
				System.out.println("Digite a personalidade do participante (1-calmo(a) / 2-nervoso(a) / 3-agressivo(a)): ");
				personalidade = validar();
				if (personalidade == 1) {
					calmos++;
				}
				if (sexo == 1 && personalidade == 2) {
					mulheresNervosas++;
				}
				
				if (sexo == 2 && personalidade == 3) {
					homensAgressivos++;
				}
				if (sexo == 3 && personalidade == 1) {
					outrosCalmos++;
				}
				if (idade > 40 && personalidade == 2) {
					acimaDeQuarentaNervosos++;
				}
				if (idade < 18 && personalidade == 1) {
					menoresDeIdadeCalmos++;
				}
				i++;
				System.out.println("Deseja continuar? (S/N)");
				op = reader.next().toUpperCase().charAt(0);
			}
			
			System.out.println("número de pessoas calmas: " + calmos);
			System.out.println("número de mulheres nervosas: " + mulheresNervosas);
			System.out.println("número de homens agressivos: " + homensAgressivos);
			System.out.println("número de outros calmos: " + outrosCalmos);
			System.out.println("número de pessoas nervosas com mais de 40 anos: " + acimaDeQuarentaNervosos);
			System.out.println("número de pessoas calmas com menos de 18 anos: " + menoresDeIdadeCalmos);
			
		}

		static int validar() {
			
			int escolha = reader.nextInt();
			
			while (escolha < 0 || escolha > 3) {
				System.out.println("Digite uma opção válida");
				escolha = reader.nextInt();
			}
			return escolha;
		}
		
	}
