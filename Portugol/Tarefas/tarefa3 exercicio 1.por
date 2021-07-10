programa
{
/* 
1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
a) média do salário da população;
b) média do número de filhos;
c) maior salário;
d) percentual de pessoas com salário até R$100,00.
- Perguntar para 20 pessoas salario e numero de filhos
depois eu tenho que perguntar o que o servidor pede
a) Somar todos salarios e dividir por numero de habitantes
b) Somar numero de filhos e dividir por numero de habitantes
c) Comparar salários todas as vezes com ultimo maior
d) percentual de pessoas e salrio até 100*/
 

	funcao inicio()
	{ inteiro habitantes=3, filhos, somaFilhos=0
	   real mediaFilhos, media, salario, somaSalario=0.0, maiorSalario=0,menos100=0, porcentagem=0
	
		para(inteiro c=1;c<= habitantes; c++){
          escreva("Digite seu salario: ")
          leia(salario)
          escreva("Digite número de filhos ")
          leia(filhos)
         somaSalario+=salario
         somaFilhos+=filhos
          se(salario>maiorSalario){
          maiorSalario=salario	  
          }
          se(salario<100.00){
          	menos100=menos100+1
          	porcentagem=(menos100*100)/habitantes
          	
          }
		
		}
          media=somaSalario/habitantes
          escreva("A média do dalario é"+media)
          mediaFilhos=(somaFilhos/habitantes)
          escreva("\n O numero de filhos por habitantes é" + mediaFilhos)
		escreva("\n Maior salário foi"+maiorSalario)
		escreva("\n O percentual de pessoas que com salario até 100 são+ porcentagem"+%)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1519; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */