package tarefajava;
import java.util.*;
public class Tarefas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub faça um
		//sistema que leia a idade de uma pessoa expressa em anos meses e dias e mostre-a expressa apenas em dias. 
		
		Scanner ler = new Scanner (System.in);
		int idade;
		String nome;
		
		System.out.printf("entre com sua idade:  ");
		idade = ler.nextInt();
		ler.nextLine();  //limpa o buffer
		System.out.printf("entre com seu nome:  ");
		nome = ler.nextLine();
		
		System.out.printf("/nSeu nome: %s, nome");
		System.out.printf("/nSua idade %d, idade");
		
		if(idade>=18)
		{
		
			System.out.printf("/nVocê é maior de idade");
			
		}
		
		else if (idade>=1&& idade<18)
			
		{
			System.out.printf("/n Você é menor de idade");
		}
		else
		{
			System.out.printf("/n VocÊ entrou com uma idade invalida")
		}
		

	} 

}
