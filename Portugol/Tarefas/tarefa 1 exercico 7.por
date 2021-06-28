programa
{

//7. Um sistema de equações lineares do tipo: 
//Escreva um sistema que lê os coeficientes a,b,c,d,e e f
//e calcula e mostra os valores de x e y. 
//x= ce - bf/ae-bd   ----- y=af-cd/ae-bd

	
	funcao inicio()
	{
		//variaves
		real vA, vB, vC, vD, vE, vF, x, y
		escreva("Informe o numero:  ")
		leia(vA)

		escreva("Informe o numero:  ")
		leia(vB)

		escreva("Informe o numero:  ")
		leia(vC)
		
		escreva("Informe o numero:  ")
		leia(vD)
		
		escreva("Informe o numero:  ")
		leia(vE)

		escreva("Informe o numero:  ")
		leia(vF)
		
		 x = ((vC*vE) - (vB*vF) / (vA*vE) - (vB*vB*vD))

		 y = (vA + vF) - (vC*vC) / ((vA* vE) - (vB*vD))

		 escreva (x, x)
		 
		 escreva(y, y)
		 
		 
		

		
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 604; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */