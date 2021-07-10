programa
{
	/*Faça um programa que crie um vetor por leitura
	com 5 valores de pontuação de uma atividade e o escreva
	em seguida. Encontre após a maior pontuação e a apresente. 

I Criar um vetor com 5 espaços
II Preencher o vetor com números que o usuário quiser
III Exibir vetor(todos os números)
IV Encontrar maior número do vetor
IIV 
*/
	funcao inicio()
	{
	   inteiro pontuacao[5], maiorPontuacao=0



	   para(inteiro i=0; i<5; i++){
	   	escreva("Digite um número:\n")
	   	leia(pontuacao[i])
	   	se(pontuacao[i]>maiorPontuacao){
	   		maiorPontuaca=pontuacao[i]
	   		
	   	}
	   	
	   }
	   para(inteiro i=0; i<5; i++){
	   	escreva(pontuacao[i]+"\n")
	   }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 506; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */