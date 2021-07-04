programa
{
	
	funcao inicio()
	{
		//numeros inteiros
		//numero for impar e multiplo de 3 vc deve somar
		//media desses numeros multiplos de 3 e impares
		//se o usuario digita 0 o programa terminar
		//mostrar qual foi o maior numero multiplo de 3 e impar digitado
		
		 // media, maior numero. fazer em bloco
		 //variaveis


		 inteiro numero =0
		 inteiro totalImparMultiplo3=0
		 real contador3impar=0
		 real media3impar=0.00
		 
		 //entrada
		 faca {
		 escreva("Digite o numero:   ")
		 leia(numero)
		 se ((numero%2)==1 e (numero%3) ==0){
		totalImparMultiplo3 += numero
		contador3impar++
		se(numero > maiorNumero){
              maiorNumero = numero
		 }

		 
	   } enquanto(numero !=0)
//saida

      media3impar = totalImparMultiplo3 / contador3impar
      
	 escreva ("Media dos numeros impares multiplos de 3 :")
      escreva("Fim de programa")
      
      }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 634; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */