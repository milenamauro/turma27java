package Entidades;

import javax.swing.*;

public class contaEstudante extends Conta {
	private double limite = 5000;
	private int qtdMovimentos;

	public contaEstudante(int numero, String nomeCliente) {
		super(numero, nomeCliente);
	}

	public double getLimite() {
		return limite;
	}
	
	public void emprestimo(double emprestimoJa) {
		if (emprestimoJa<=limite) {
			limite = limite - emprestimoJa;
			this.credito(emprestimoJa);
		} else {
			
			JOptionPane.showMessageDialog(null,"Limite indisponível.");

		}
		
	}
	
	
	@Override
	public void telas() {
		double saldoDebito;
		double saldoCredito;
		double emprestimoJa;
		int escolha;
		
		int opc;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Bem vinde "+this.getNomeCliente()+" a sua Conta Estudantil - Nº "+this.getNumero()+" digite:\n1- Débito\n2- Crédito\n3- Emprestimo Já!\n4- para sair\n\nSaldo Atual: R$"+this.saldo+"\nSaldo para emprestimo: R$"+this.limite+"\n\n Quantidade de movimentos restantes: "+(10-this.qtdMovimentos)));
			switch(opc) {
			case 1:
				saldoDebito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor desejado: "));
				this.debito(saldoDebito);
				break;
			case 2:
				saldoCredito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor desejado: "));
				this.credito(saldoCredito);
				break;
			case 3:
				emprestimoJa = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do empréstimo: "));
				this.emprestimo(emprestimoJa);								
				break;
			case 4:
				JOptionPane.showMessageDialog(null,"Foi disponível um emprestimo, gostaria de receber?");
				escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite:\n 1. SIM \n 2. NÃO"));
				if (escolha == 1) {
					emprestimoJa = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do empréstimo: "));
					this.emprestimo(emprestimoJa);
				} else if (escolha == 2 ) {
					JOptionPane.showMessageDialog(null,"Obrigado por escolher o FCBM!  Até a próxima.");
				}
				break;
			default: 
				JOptionPane.showMessageDialog(null,"Opção invalida!\nPor favor, tente novamente!");
				break;
			}
		}while(opc!=4);
	}

}