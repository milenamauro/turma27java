programa
{
/*
 Faça um programa que mostre uma contagem na tela de
 233 a 456, só que contando de 3 em 3
 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver
*/

	
	funcao inicio()
	{    inteiro numero
	     inteiro soma=0
	     real total=0.0
	
		escreva("Digite um numero: ")
		leia(numero)
		enquanto(numero>0){
		soma=soma+numero
		total++
		escreva("Digite um numero: ")
		leia(numero)
 	
		}
		limpa()
		escreva("Tota de numerosl"+total)
		escreva("Soma dos numeros"+soma)
		escreva("Média dos números: "+(soma/total))
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 70; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */