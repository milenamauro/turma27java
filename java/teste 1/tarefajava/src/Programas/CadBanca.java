package Programas;
import java.util.Scanner;

import Objeto.FrontLoko;
import Objeto.Pessoa;
public class CadBanca {

@SuppressWarnings("null")
public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Objeto.Pessoa cliente1 = new Objeto.Pessoa();
		Objeto.FrontLoko desenho = new Objeto.FrontLoko();
		
				
		System.out.println("Digite seu nome: ");
		Scanner leia1 = null;
		cliente1.nome = leia1.next();
		System.out.println("Digite o ano de nascimento :");
		cliente1.anoNascimento = leia1.nextInt();
		linha(80);
		if (cliente1.calcularIdade(2021)>=18) {
			System.out.println("Pode comprar tudo!!!");
		} else {
			System.out.println("Proibido conteudo menor de 18 anos!!!");
		}
		
		desenho.linha(50);
		desenho.mensagem();
		
	}
	
	public static void linha(int tamanho) {
		for (int x=1; x<=tamanho; x++) {
			System.out.print("-");
		}
		System.out.println();
	}

}
