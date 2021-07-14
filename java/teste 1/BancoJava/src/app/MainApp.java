package app;

import java.util.*;
import javax.swing.*;
import Entidades.ContaCorrente;
import Entidades.ContaEmprestimo;
import Entidades.ContaEspecial;
import Entidades.ContaPoupanca;
import Entidades.contaEstudante;

public class MainApp {

	public static void main(String[] args) {
		int opc;
		int numero;
		String nome;
		int dia=0;
		
		// Criação de conta:
		Random random = new Random();
		numero = random.nextInt(1000);
		nome= JOptionPane.showInputDialog("Seja Bem Vinde ao Banco FCBM!\nPoderia nos informar seu nome?");
		dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia de hoje:"));
		if(dia>31 || dia<=0) {
			JOptionPane.showMessageDialog(null,"No nosso banco o cliente sempre tem razão! (Mesmo que esse dia não esteja no calendario)");
		}
		JOptionPane.showMessageDialog(null,"Olá "+nome+" sua conta foi aberta!\nO numero dela é: "+numero);
		
		
		// Instanciando Objetos:
		ContaEspecial contEspecial = new ContaEspecial(numero, nome, 1000);
		ContaPoupanca contPoup = new ContaPoupanca(numero, nome, dia);
		contaEstudante contEstu = new contaEstudante(numero, nome);
		ContaEmprestimo contEmpresa = new ContaEmprestimo(numero, nome);
		ContaCorrente contCorrente = new ContaCorrente(numero, nome);
		
		do {
			JOptionPane.showMessageDialog(null,"Bem Vindo ao Banco G8 - FCBM\nJuntos fazemos o seu Dinheiro evoluir!");
			opc = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite a opção desejada:\n 1- Conta poupanca\n 2- Conta corrente\n 3- Conta Especial\n 4- Conta Empresa\n 5- Conta Estudantil\n 6- Sair\n"));
			
			switch(opc) {
				case 1:
					contPoup.telas();
					break;
				case 2:
					contCorrente.telas();
					break;
				case 3:
					contEspecial.telas();
					break;
				case 4:
					contEmpresa.telas();
					break;
				case 5:
					contEstu.telas();
					break;
				case 6:
					JOptionPane.showMessageDialog(null,"Obrigado e volte sempre!");
					JOptionPane.showMessageDialog(null,"Nunca se esqueça!!!");
					System.err.println("                                            ,:\r\n"
							+ "                                          ,' |\r\n"
							+ "                                         /   :\r\n"
							+ "                                      --'   /\r\n"
							+ "                                      \\/ /:/\r\n"
							+ "                                      / ://_\\\r\n"
							+ "                                   __/   /\r\n"
							+ "                                   )'-. /\r\n"
							+ "                                   ./  :\\\r\n"
							+ "                                    /.' '\r\n"
							+ "                                  '/'\r\n"
							+ "                                  +\r\n"
							+ "                                 '\r\n"
							+ "                               `.\r\n"
							+ "                           .-\"-\r\n"
							+ "                          (    |\r\n"
							+ "                       . .-'  '.\r\n"
							+ "                      ( (.   )8:\r\n"
							+ "                  .'    / (_  )\r\n"
							+ "                   _. :(.   )8P  `\r\n"
							+ "               .  (  `-' (  `.   .\r\n"
							+ "                .  :  (   .a8a)\r\n"
							+ "               /_`( \"a `a. )\"'\r\n"
							+ "           (  (/  .  ' )=='\r\n"
							+ "          (   (    )  .8\"   +\r\n"
							+ "            (`'8a.( _(   (\r\n"
							+ "         ..-. `8P    ) `  )  +\r\n"
							+ "       -'   (      -ab:  )\r\n"
							+ "     '    _  `    (8P\"Ya\r\n"
							+ "   _(    (    )b  -`.  ) +\r\n"
							+ "  ( 8)  ( _.aP\" _a   \\( \\   *\r\n"
							+ "+  )/    (8P   (88    )  )\r\n"
							+ "   (a:f   \"     `\"`"+"\n FOGUETE NÂO TEM RÉ!!!");
					break;
				default:
					JOptionPane.showMessageDialog(null,"Opção invalida!\nTente Novamente!");
			}
			
		}while(opc!=6);

	}

}