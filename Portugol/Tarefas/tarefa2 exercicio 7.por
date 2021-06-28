//7) Receber valores de base e altura de um triângulo e 
//verificar se são valores válidos (positivos maiores que zero).
//Em caso afirmativo, calcular a área do triângulo.
//8) Construa um sistema para ler uma variável numérica 
//N e imprimi-la somente se a mesma for maior que 100, 
//caso contrário imprimi-la com o valor zero.



programa
{
	
	funcao inicio()
	{
		real valorBase, valorAltura, areaDotriangulo
		escreva("Digite o base do triangulo:")
		leia(valorBase)

		escreva("Digite o valor da altura do triangulo:")
		leia(valorAltura)

       se (valorBase>0 e valorAltura>0){
       	 areaDotriangulo= (valorBase*valorAltura/2)
       	 escreva("A area do triangulo é:  " + areaDotriangulo)
       }

       
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 459; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */