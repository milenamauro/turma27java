programa
{
	/*
Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
	que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine 
	e imprima a média aritmética dos lançamentos, contabilize e apresente também
	quantas foram as ocorrências da maior pontuação.
	*/
	funcao inicio()
	{
		inteiro valorDado[10], maiorValor = 0, x = 0, mediaValor = 0

		para(x=0;x<=9;x++){
			escreva("Digite o valor do dado: ")
			leia(valorDado[x])
			mediaValor += valorDado[x]
			se(valorDado[x]>maiorValor){
				maiorValor = valorDado[x]
			}
		}
		escreva("A media dos valores é: ",mediaValor/10)
		escreva("\nO maior valor inserido é: ", maiorValor)
	}
	
} 
 */
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 686; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */