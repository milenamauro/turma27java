package Objeto;

public class Pessoa {
     
	//atributos
		public String nome;
		public char sexo;
		public int anoNascimento;
		
		
		public int calcularIdade() {
			return (2021-anoNascimento);
		}
		
		public int calcularIdade(int anoAtual) {
			return (anoAtual-anoNascimento);
		}
		
		
	}
	 
