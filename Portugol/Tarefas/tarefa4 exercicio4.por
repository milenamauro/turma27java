programa
{
	/*
Crie um programa que receba valores do usuário para preencher uma matriz 3X3,
	e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
	diagonal, ou seja, diagonal principal.
	*/
	funcao inicio()
	{
		inteiro matriz[3][3], somaMatrizes = 0
		inteiro linha = 0, coluna = 0
		
		para(linha=0;linha<=2;linha++){
			para(coluna=0;coluna<=2;coluna++){
				escreva("Digite o valor de: ",linha," - ", coluna," da matriz ")
				leia(matriz[linha][coluna])
				somaMatrizes += matriz[linha][coluna]
				
			}

		}	
			para(linha=0;linha<=2;linha++){
				para(coluna=0;coluna<=2;coluna++){
					escreva(matriz[linha][coluna],"\n")
				}
			}	
			
			escreva("A soma dos valores da matriz é: ", somaMatrizes)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 540; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1138; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */