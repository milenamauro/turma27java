programa
{
	/* 1- Elaborar um programa que efetue a leitura sucessiva 
	de valores numéricos e apresente no final o total do somatório
	, a média e o total de valores lidos. O programa deve fazer as 
	leituras dos valores enquanto o usuário estiver fornecendo valores 
	positivos. Ou seja, o programa deve parar quando o usuário fornecer
	um valor negativo.
	
	I Usuario n mostra nada
	II programa só olha entra 233 a 456
	III Enquanto o programa estiver olhando os numeros entre 300 e 400
	ele quer que mostre de 3 em 3
	IV senaoTodo o resto mostra de 5 em 5*/

  
	funcao inicio()
	{

	     inteiro num=233
		faca{
               se(num>=300 e num>=400){
               num=num+3	
               escreva(num+"\n")	
               	
               } senao {
               	num=num+5
               	escreva(num+"\n")
               }
			
		} enquanto(num>=233 e num<=456)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 823; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */