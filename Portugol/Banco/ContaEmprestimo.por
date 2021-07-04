programa
{
	
// Menu principal
	// BANCO FCBM -  
	// *Limpar tela*
	// *Func Deb && Cred*


	
	funcao inicio()
	{
		inteiro opc
		real saldo = 100.0
		real limite = 1000.0
		inteiro diaAniversario = 3

		faca{
			escreva("\nDigite a opcao desejada:\n 1- Conta poupanca\n 2- Conta corrente\n 3- Conta Especial\n 4- Conta Empresa\n 5- Conta Estudantil\n 6- Sair\n")
			leia(opc)
			escolha(opc){
				
				caso 1:
				contaPoup(diaAniversario, saldo)
				pare

				caso 2:
				/*contaCorre()*/
				pare

				caso 3:
				contEspecial(saldo, limite)
				
				pare

				caso 4:
				contaEmpres(saldo)
				
				pare

				caso 5:
				/*contaEstu()*/
				
				pare

				caso 6:
				escreva("Obrigado por escolher o FCBM!!! :)")
				pare

				caso contrario:
				escreva("Opcao invalida\nDigite novamente!")
				pare
			}
		}enquanto(opc != 6)
		
	}

	funcao contaPoup(inteiro diaAniversario, real saldo){
		inteiro diaAtual
		inteiro cont = 0
		caracter mov
		caracter opc
		real valor

		
		escreva("BANCO - FCBM\n")
		escreva("SLOGAN\n")
		faca{
			escreva("Qual o dia atual?")
			leia(diaAtual)
			se(diaAtual == diaAniversario){
				saldo = (saldo*0.05)+saldo
			}
			escreva("Conta do tipo: Poupança")
			escreva("\nSaldo na conta: R$",saldo)
			escreva("\nDigite:\n D - Para debitar \n C - Para creditar: ")
			leia(mov)
			se(mov == 'd' ou mov == 'D'){
				escreva("\nDigite o valor a ser debitado:")
				leia(valor)
				saldo = debito(saldo, valor)
			}senao se (mov == 'c' ou mov == 'C'){
				escreva("\nDigite o valor a ser creditado:")
				leia(valor)
				saldo = credito(saldo, valor)
			}
			escreva("Conta do tipo: Poupança")
			escreva("\nNovo Saldo na conta: R$",saldo)
			
			escreva("\nDeseja continuar?\n Digite S/N")
			leia(opc)
			
			cont++
		}enquanto(cont >=10 ou opc !='n')
		
		
	}

	funcao contEspecial(real saldo, real limite){
		caracter opc = 's'
		caracter mov
		real valor
		real aux
		inteiro cont = 0
		
		escreva("FCBM\n")
		escreva("SLOGAN\n")
		faca{
			escreva("Conta do tipo: Especial")
			escreva("\nSaldo na conta: R$",saldo)
			escreva("\nLimite: R$", limite)
			escreva("\nDigite:\n D - Para debitar \n C - Para creditar: ")
			leia(mov)  
		// Começo das transações:
			se(mov == 'd' ou mov == 'D'){
				escreva("\nQual o valor do debito?")
				leia(valor)
				se(saldo >= valor){
					saldo = saldo - valor
				}senao se(valor > saldo e limite >= valor){
					aux = saldo - valor
					limite = limite + aux	
				}senao se (valor > saldo e valor > limite){
					escreva("Valor excedido!")
				}
				
			}
			se (mov == 'c' ou mov == 'C'){
				escreva("\nQual o valor a ser creditado?")
				leia(valor)
				saldo = saldo + valor
			}
		// Finalização da movimentação
			escreva("\nNovo saldo: R$", saldo)
			escreva("\nNovo valor de limite: R$", limite)
		// Contador de movimentos ++
			cont++
		
			escreva("\nDeseja continuar?\n Digite S/N")
			leia(opc)
		
		}enquanto(opc != 'n' ou cont >= 10)

		se(cont>=10){
			escreva("\nLimite de movimentação atingido")
			escreva("Obrigado por utilizar FCBM")
		}senao{
			escreva("\nObrigado por utilizar FCBM")
		}
	}

	funcao real debito(real saldo, real valor){
		se(saldo >= valor){
			saldo = saldo - valor
		}senao se(saldo <= valor){
			escreva("Saldo insuficiente!")
		}
		retorne saldo
	}

 

	funcao real credito(real valor, real saldo){
		saldo = saldo + valor
		retorne saldo
	}


//*(+) pedirEmprestimo (soma no saldo e tira do empresitmo)*//

	funcao contaEmpres(real saldo){
		  real emprestimoEmpresa=10000
		  inteiro mov=0
		  real valor
		  inteiro opcao=0
		  inteiro acao
		  
          escreva("FCBM\n")
		escreva("SLOGAN\n")

		      faca {
		     escreva("Conta do tipo: Especial")
			escreva("\nSaldo na conta: R$",saldo)
		      	escreva("\nDigite 1 para crédito e 2 para débito:")
		      	leia(acao)
		      	se(acao==1){
		      		escreva ("\nDigite o valor desejado")
		      		leia (valor)
		      	saldo=credito(saldo, valor) 
		      	
		      	}
		      	se(acao==2){
		      		escreva("\nDigite o valor desejado") 
		      		leia(valor)
		      		saldo=debito(saldo, valor)
		      	}
		      	escreva(" \nVocê gostaria de um emprestimo?")
		      	
			 
	           leia(mov)
	           se(mov == 1){ 
	           	escreva("\n Quanto você gostaria?")
	           	leia(valor)

	           
	           se(valor<=10000) {
	           	escreva(" \nVocê pode pegar um emprestimo")
	           	emprestimoEmpresa=emprestimoEmpresa-valor 
	           	saldo=valor+saldo 
	           	escreva(" \nSeu novo saldo é:",saldo)
	
	          
			 } 
			  senao { 
			  	escreva(" \nVocê não pode pegar um emprestimo. Esse valor está indisponivel!!!")
			  	
           	
           	}
		 
		 

		 	 
		 }
		 
                se(mov==2){
                escreva(" \nQue pena, seu emprestimo não aconteceu :(")
                	
                }
		      escreva(" \nVocê quer continuar? Digite 1, se não digite 2")
		      leia (opcao)
		      }
			  
                enquanto(opcao!=2) 
		
	}  
	
	

	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1572; 
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
 * @POSICAO-CURSOR = 4664; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */