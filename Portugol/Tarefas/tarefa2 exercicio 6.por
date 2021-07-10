//Elabore um sistema que dada a idade de um nadador classifique-o em 
//uma das seguintes categorias:
//Infantil A = 5 a 7 anos maior ou igual a 5 e menor e igual a 7
//Infantil B = 8 a 11 anos maior ou igual a 8 e menor e igual a 11
//Juvenil A = 12 a 13 anos maior ou igual a 12 e menor e igual a 13
//Juvenil B = 14 a 17 anos  maior ou igual a 14 e menor e igual a 17
//Adultos = Maiores de 18 anos maior ou igual a 18

programa
{
	
	funcao inicio()
	{
		inteiro idade
		escreva("Qual sua idade?:  ")
		leia(idade)
		se   (idade >=5 e idade <=7) { 
			escreva ("Vocé é da categoria Infantil A ")
			
		}
         senao se (idade>=8 e idade <= 11) {
         	   escreva ("Você é da categoria Infantil B ")
         }

         senao se (idade>=18 e idade >= 18) {
         	   escreva ("Você é maior ")
         	
         }

		senao se (idade>=12 e idade <= 13) {
         	   escreva ("Você é da categoria Juvenil B ")
		}
		senao se (idade>=14 e idade <= 17) {
         	   escreva ("Você é da categoria Juvenil A ")

         	 }
		senao se (idade>=18) {
         	  
         	  	escreva("Vc é maior de idade")
   
		} senao { escreva("idade invalida")

         	  	}
         	  }
         	   
	 
	 
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1190; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */