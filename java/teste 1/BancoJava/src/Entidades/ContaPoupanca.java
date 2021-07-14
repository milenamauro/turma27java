package Entidades;

import javax.swing.JOptionPane;

public class ContaPoupanca extends Conta{
	private int diaAniversario;
	private int qtdMovimentos;

	public ContaPoupanca(int numero, String nomeCliente, int diaAniversario) {
		super(numero, nomeCliente);
		this.diaAniversario = diaAniversario;
	}

	 void ContaPoupanca1(int numero, String nome, int dia) {
		// TODO Auto-generated constructor stub
	}

	public int getDiaAniversario() {
		return diaAniversario;
	}

	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}
	
	public void verificaDia(int dia) {
		double ajuste;
		
		if(dia == diaAniversario) {
			ajuste = this.saldo*0.09;
			this.credito(ajuste);
			JOptionPane.showMessageDialog(null,"Parabéns hoje é aniversário da sua conta!\nSeu saldo foi ajustado para: R$"+this.getSaldo());
		}else {
			JOptionPane.showMessageDialog(null,"Infelizmente hoje não é o aniversário da sua conta!");
		}
	}
	
	@Override
	public void telas() {
		int opc;
		double valor;
		int dia;
		boolean verificado = false;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Bem vinde "+this.getNomeCliente()+" a sua Conta Poupança - Nº "+this.getNumero()+" digite:\n1-Debito\n2- Credito\n3- Verificar data de Aniversario da conta\n4- para sair\n\nSaldo atual: R$"+this.getSaldo()+"\n\n Quantidade de movimentos restantes: "+(10-this.qtdMovimentos)));
			switch(opc) {
				case 1:
					valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser Debitado:"));
					this.debito(valor);
					break;
				case 2:
					valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser creditado:"));
					this.credito(valor);
					break;
				case 3:
					if(verificado==false) {
						dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia de hoje:"));
						this.verificaDia(dia);
						verificado = true;
					}else {
						JOptionPane.showMessageDialog(null, "A sua conta já foi verificada!");
					}
					break;
				case 4:
					JOptionPane.showMessageDialog(null,"Obrigado por Utilizar o G8 - FCBM");
					break;
				default: 
					JOptionPane.showMessageDialog(null,"Opção invalida!\nPor favor, tente novamente!");
					break;
			}
		}while(opc!=4);
		if(this.qtdMovimentos>10) {
			JOptionPane.showMessageDialog(null, "Quantidade de movimentos exedida!");
		}
	}
	
}