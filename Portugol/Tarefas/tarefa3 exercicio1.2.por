programa
{
/*
ENQUANTO
1- Elaborar um programa que efetue a leitura sucessiva de 
valores numéricos e apresente no final o total do somatório, 
a média e o total de valores lidos. O programa deve fazer as leituras
dos valores enquanto o usuário estiver fornecendo valores positivos. Ou seja, 
o programa deve parar quando o usuário fornecer um valor negativo.

i- Leia um monte de numero
ii some todos os numeros lidos
iii media de todos os numeros lidos
iv mostrar quantos numeros foram lidos
--- condicao só executa se o numero inserio for maior do que 0, ou seja um 
numero positivo
*/

	
	funcao inicio()
	{    inteiro numero
	     inteiro soma=0
	
		escreva("Digite um numero")
		leia(numero)
		enquanto(numero>0){
		soma=soma+numero
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 744; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */