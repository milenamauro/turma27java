package Entidades;

import javax.swing.*;

public class ContaEmprestimo extends Conta {

	public ContaEmprestimo(int numero, String nomeCliente) {
		super(numero, nomeCliente);
	}
	private double limite=10000;
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public void emprestimo(double valor) {

		if (valor <= limite) { 
			this.credito(valor);
			limite=limite-valor;

		}else{
			JOptionPane.showMessageDialog(null,"Opção invalida!\nPor favor, tente novamente!");
		}

	}

	@Override

	public void telas() {
		int opc;
		double valor;
		int choic;

		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Bem vinde "+this.getNomeCliente()+" a sua Conta Empresarial - Nº "+this.getNumero()+" digite:\n1- Credito\n2- Debito\n3- Pegar emprestimo\n4- para sair\n\nSaldo Atual: R$"+this.saldo+"\nSaldo para emprestimo: R$"+this.limite+"\n\n Quantidade de movimentos restantes: "+(10-this.qtdMovimentos)));
			switch(opc) {
			case 1:
				valor=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor desejado: "));
				this.credito(valor);
				break;

			case 2:
				valor=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor desejado: "));
				this.debito(valor);
				break;
			case 3:
				valor=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor desejado: "));
				this.emprestimo(valor);
				break;
			case 4:
				JOptionPane.showMessageDialog(null,"Gostaria de fazer um emprestimo? ");
				choic= Integer.parseInt(JOptionPane.showInputDialog("Digite:\n 1 - Sim \n 2 - Não????"));
				if(choic==1){ 
					valor=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor desejado: "));
					this.emprestimo(valor);
				}else if (choic==2){ 
					JOptionPane.showMessageDialog(null, "Que pena :(");
				}
				break; 
			default: 
				JOptionPane.showMessageDialog(null,"Opção invalida!\nPor favor, tente novamente!");
				break;
			}
		}while(opc!=4);

	}
}