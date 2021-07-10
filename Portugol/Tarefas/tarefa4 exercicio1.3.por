programa
{
	/*Faça um programa que pegue um número do teclado e calcule a soma 
	de todos os números  de 1 até ele. Ex.:
	o usuário entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.
	
	I numero do teclado 0 e 9
	Calcule a soma dos numeros de 1 até o numero digitado
*/
	funcao inicio()
	{
		inteiro num, contador=0, soma=0
		escreva("Escreva número entre 1 e 9: \n")
		leia(num)
		faca{
			contador=contador+1
			escreva(contador+" + ")
			soma=contador+soma
			
		} enquanto(contador<num)
		  escreva("\n" + soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 379; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */