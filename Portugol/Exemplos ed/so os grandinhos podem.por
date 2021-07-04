programa
{
	
	funcao inicio()
	{
          inteiro idade
          inteiro contador=1
		
		escreva("Digite sua idade:")
		leia(idade)


		enquanto(idade < 18){
			escreva("Você não tem idade para acessar \n")
		
		     escreva("Digite sua idade:")
		     
		     contador++
		     se(contador>3){
		     	se(contador==1){
		     		escreva("Aqui não é luga pra tu!!")
		     	} 
		     	senao se (contador==2){
		     		escreva("Vc de novo??? Rala peito!!")
		     	} senao se (contador==3){
		     		escreva ("Voce é guerreiro \n")
		     		pare	
		     	}
		     	
		     	
		     		
		     }
		      leia(idade)
	   
		}
		se(contador==1){
			escreva("Parabéns você está grandinho")	
		}
		senao{
			escreva("Vaza fio")
		}

           
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 15; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */