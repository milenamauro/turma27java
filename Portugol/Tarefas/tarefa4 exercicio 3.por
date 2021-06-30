programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro N1[4][6]
		inteiro N2[4][6]
		inteiro M1[4][6]
		inteiro M2[4][6]

		inteiro linha = 0, coluna = 0

		para(linha=0;linha<4;linha++){
			para(coluna=0;coluna<6;coluna++){
				 
				N1[linha][coluna] = Util.sorteia(5,8)
				N2[linha][coluna] = Util.sorteia(4,9)
				M1[linha][coluna] = N1[linha][coluna] + N2[linha][coluna]
				M2[linha][coluna] = N1[linha][coluna] - N2[linha][coluna]
			}
		}
				escreva("MATRIZ N1\n")
				para(linha=0;linha<4;linha++){
					para(coluna=0;coluna<6;coluna++){
					escreva(N1[linha][coluna]," ")
		
		
			}
				escreva("\n")
		}
				escreva("MATRIZ N2\n")
				para(linha=0;linha<4;linha++){
					para(coluna=0;coluna<6;coluna++){
					escreva(N2[linha][coluna]," ")

			}
				escreva("\n")
		}
				escreva("MATRIZ M1\n")
				para(linha=0;linha<4;linha++){
					para(coluna=0;coluna<6;coluna++){
					escreva(M1[linha][coluna]," ")
		
			}
			escreva("\n")
		}
				escreva("MATRIZ M2\n")
				para(linha=0;linha<4;linha++){
					para(coluna=0;coluna<6;coluna++){
					escreva(M2[linha][coluna]," ")
		
			}
			escreva("\n")
		}
	}
} 
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1132; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */