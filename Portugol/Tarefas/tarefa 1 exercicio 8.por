programa
{
	inclua biblioteca Matematica--> matematica
	//O custo ao consumidor de um carro novo é a soma do custo de fábrica
	//com a percentagem 
	//do distribuidor e dos impostos (aplicados ao custo de fábrica)
	//Supondo que a percentagem do distribuidor seja de 28% e 
	//os impostos de 45%, escrever um sistema que leia o custo de 
	//fábrica de um carro e escreva o custo ao consumidor. 
	funcao inicio()
	{
	//variaveis 
	//custocons=soma do custofa + % =28%
	//impos 28%
	real porcDist=28, impo = 45, custoFa, custoCons,info,retorna,custoComimpost, 
	custoComdistri

     escreva("Qual o custo do carro da fabrica")
     leia (custoFa)
     custoComimpost=custoFa*(impo/100) 
     custoComdistri= custoFa* (porcDist/100)
     custoCons = custoComimpost + custoComdistri + custoFa
     escreva("Qual o valor final?",custoCons)

     
     
  
     
    
     
	
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 837; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */