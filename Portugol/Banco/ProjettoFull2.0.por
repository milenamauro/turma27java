programa
{

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
				limpa()
				contaPoup(diaAniversario, saldo)
				pare

				caso 2:
				limpa()
				contaCorrent(saldo)
				pare

				caso 3:
				limpa()
				contEspecial(saldo, limite)

				pare

				caso 4:
				limpa()
				contaEmpres(saldo)

				pare

				caso 5:
				limpa()
				contEstu(saldo)

				pare

				caso 6:
				limpa()
				escreva("Obrigado por escolher o FCBM!!! ;)\n    *--Não se esqueça--*\n|<*<*FOGUETE NÃO TEM RÉ!*>*>|")
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


		escreva("BANCO - G8: FCBM\n")
		escreva("*>>>>Juntos fazemos seu dinheiro evoluir<<<<*\n")
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
		escreva("\nObrigado por escolher o FCBM! :)\n")

	}

	funcao contEspecial(real saldo, real limite){
		caracter opc = 's'
		caracter mov
		real valor
		real aux
		inteiro cont = 0

		escreva("BANCO - G8: FCBM\n")
		escreva("*>>>>Juntos fazemos seu dinheiro evoluir<<<<*\n")
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
					saldo = 0	
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
		  inteiro cont = 0

          escreva("BANCO - G8: FCBM\n")
		escreva("*>>>>Juntos fazemos seu dinheiro evoluir<<<<*\n")

		      faca {
		     escreva("Conta do tipo: Empresarial")
			escreva("\nSaldo na conta: R$",saldo)
		      	escreva("\nDigite 1 para crédito e 2 para débito:")
		      	leia(acao)
		      	se(acao==1 e cont <= 10){
		      		escreva ("\nDigite o valor desejado: R$")
		      		leia (valor)
		      		saldo=credito(saldo, valor) 
		      		escreva("\nNovo saldo na conta: R$",saldo)

		      	}
		      	se(acao==2 e cont <= 10){
		      		escreva("\nDigite o valor desejado: R$") 
		      		leia(valor)
		      		saldo=debito(saldo, valor)
		      		escreva("\nNovo saldo na conta: R$",saldo)
		      	}
		      	escreva(" \nVocê gostaria de um emprestimo?\n1- Sim\n2- Não")


	           leia(mov)
	           se(mov == 1){ 
	           	escreva("\n Quanto você gostaria? R$")
	           	leia(valor)


	           se(valor<=10000) {
	           	escreva(" \nVocê pode pegar um emprestimo! :)\n")
	           	emprestimoEmpresa=emprestimoEmpresa-valor 
	           	saldo=valor+saldo 
	           	escreva(" \nSeu novo saldo é:",saldo)


			 } 
			  senao { 
			  	escreva(" \nVocê não pode pegar um emprestimo. Esse valor está indisponivel!!!\n")


           	}

		 }

                se(mov==2){
                escreva(" \nQue pena, seu emprestimo não aconteceu :(\n")

                }
		      escreva(" \nVocê quer continuar? Digite 1, se não digite 2\n")
		      leia (opcao)
		      cont++
		      }enquanto(opcao!=2) 
		      escreva("\nObrigado por escolher o FCBM! :)\n")

		}


		funcao contEstu(real saldo){
		  real emprestimo=5000
		  inteiro mov=0
		  real valor
		  inteiro opcao=0
		  inteiro acao
		  inteiro cont = 0

	          escreva("BANCO - G8: FCBM\n")
			escreva("*>>>>Juntos fazemos seu dinheiro evoluir<<<<*\n")

		      faca {
		     escreva("Conta do tipo: Estudantil")
			escreva("\nSaldo na conta: R$",saldo)
		      	escreva("\nDigite 1 para crédito e 2 para débito:")
		      	leia(acao)
		      	se(acao==1 e cont <=10){
		      		escreva ("\nDigite o valor desejado R$")
		      		leia (valor)
		      		saldo=credito(saldo, valor) 
		      		escreva("\nNovo saldo na conta: R$",saldo)
		      	}
		      	se(acao==2 e cont <= 10){
		      		escreva("\nDigite o valor desejado R$") 
		      		leia(valor)
		      		saldo=debito(saldo, valor)
		      		escreva("\nNovo saldo na conta: R$",saldo)
		      	}

		      	escreva(" \nVocê gostaria de um emprestimo?\n1- Sim\n2- Não\n")
	           	leia(mov)

	           	se(mov == 1){ 
	           		escreva("\n Quanto você gostaria? R$")
	           		leia(valor)


			           se(valor<= emprestimo) {
			           	escreva(" \nVocê pode pegar um emprestimo")
			           	emprestimo=emprestimo-valor 
			           	saldo=valor+saldo 
			           	escreva(" \nSeu novo saldo é:",saldo)


					 }senao{ 
				  		escreva(" \nVocê não pode pegar um emprestimo. Esse valor está indisponivel!!!\n")
	           		 }
		 		}

                se(mov==2){
                	escreva(" \nQue pena, seu emprestimo não aconteceu :(\n")
                }
		      escreva(" \nVocê quer continuar? Digite 1, se não digite 2\n")
		      leia (opcao)
		      cont++
		      }enquanto(opcao!=2) 
		      escreva("\nObrigado por escolher o FCBM! :)\n")
		}
              funcao contaCorrent(real saldo){
              	real valor
              	inteiro mov
              	inteiro acao
              	inteiro quantiTalao=3
              	inteiro opc
              	inteiro talao
              	inteiro cont=0

              	 escreva("BANCO - G8: FCBM\n")
			 escreva("*>>>>Juntos fazemos seu dinheiro evoluir<<<<*\n")
              	faca {
              		escreva("\nTipo de conta: Conta corrente")
              		escreva ("\nSaldo atual da conta: R$" , saldo)
              		escreva ("\nDigite 1 para credito e  2 para débito: ")
              		leia (acao)


              		se(acao==1 ){
		      		escreva ("\nDigite o valor desejado R$")
		      		leia (valor)
		      	saldo=credito(saldo, valor) 

		      	}
		      	se(acao==2 ){
		      		escreva ("\nDigite o valor desejado R$")
		      		leia (valor)
		      	saldo=debito(saldo, valor) 
		      	}

              		escreva("\nO seu saldo é : R$" , saldo)
              		escreva("\nDeseja continuar?\n1- sim\n2- não\n")
              		leia(opc)
              		se(opc==2){
              			escreva("\nVocê deseja um talão ?\n1 -sim 2- não\n")
              			leia(mov)
              			se(mov==1){
              			escreva("\nVocê pode escolher até 3 taloens, digite a quantidade desejada: ")
              			leia(talao)
              			se(talao>quantiTalao){
              				escreva("\nA quantidade de taloens ultrapassou o limite permitido")
              			}senao{
              				quantiTalao=quantiTalao-talao
              				saldo=saldo-(talao*30)
              				escreva("\nO seu novo saldo é : " , saldo)
              				escreva ("\nObrigada por ter chegado até aqui.\n")

              				}
              			}senao {
              			escreva ("\nObrigada por ter chegado até aqui.\n")



              		}

              		}
              		cont++

              	}enquanto(cont>=10 ou opc!=2)
              	escreva("\nObrigado por escolher o FCBM! :)\n")
	}

}



/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1936; 
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
 * @POSICAO-CURSOR = 9494; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */