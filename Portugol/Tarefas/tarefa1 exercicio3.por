programa
{
	//3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e 
	//mostre-o expresso em horas, minutos e segundos. 
	
//OBAJETIVO: Faca um sistema que leia o tempo de duração de um evento
//em uma fábrica expressa em segundos e mostre o expresso em horas, minutos e segundos
//entrada
	funcao inicio()
	{
		inteiro tempoEvento
		inteiro horas,minutos,segundos
		
		
		escreva("Digite duração em segundos")
		leia(tempoEvento)


		//processamento
		
          horas=tempoEvento/36000
          
          minutos=(tempoEvento%3600)/60

          segundos = (tempoEvento%3600)%60
		 //saida
		 escreva("horas : "+horas+"\n")
		 escreva("minutos:  "+minutos+"\n")
		 escreva ("segundos:  " +segundos+"\n")
		 

		
	 
	
	 
	
		 
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 747; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */