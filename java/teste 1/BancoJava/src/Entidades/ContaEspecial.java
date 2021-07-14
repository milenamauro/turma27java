package Entidades;

import javax.swing.JOptionPane;

public class ContaEspecial extends Conta {
	
	private double limite;
	private int qtdMovimentos;
	
	public ContaEspecial(int numero, String nomeCliente, double limite) {
		super(numero, nomeCliente);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public void usarLimite(double valor) {
		double aux;
		
		if(valor>(this.limite+this.saldo)) {
			JOptionPane.showMessageDialog(null,"Falha na operação!\nSaldo insulficiente");
		}else if(valor> this.saldo && valor<= this.limite) {
			aux = this.saldo - valor;
			limite = limite+aux;
			if(this.saldo!=0) {
				this.debito(this.saldo);
			}
			this.qtdMovimentos++;
			
			
		}else if((this.saldo+this.limite)>valor){
			aux = this.saldo - valor;
			limite = limite+aux;
			if(this.saldo!=0) {
				this.debito(this.saldo);
			}
			this.qtdMovimentos++;
		}
		
	}
	
	@Override
	public void debito(double valorDebito) {
		int opc;
		if(valorDebito<=0) {
			JOptionPane.showMessageDialog(null,"Valor para debito invalido!");
		}else if(valorDebito>saldo){
			JOptionPane.showMessageDialog(null,"Falha na operação!\nSaldo insulficiente");
			opc = Integer.parseInt(JOptionPane.showInputDialog("Deseja utilizar o limite?\nDigite:\n1- Sim\n2- Não\n\nSaldo atual Limite: R$"+this.limite));
			if(opc==1) {
//				double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor desejado:"));
				this.usarLimite(valorDebito);
			}else if(opc==2) {
				JOptionPane.showMessageDialog(null,"Muito obrigado! :)");
			}else {
				JOptionPane.showMessageDialog(null,"Opção invalida!");
			}
		}else {
			this.saldo = this.saldo-valorDebito;
			JOptionPane.showMessageDialog(null,"Operação realizada com sucesso!\nSeu novo saldo é de: R$"+this.saldo);
			this.qtdMovimentos++;
		}
		
		
	}
	
	@Override
	public void telas() {
		int opc;
		double valor;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Bem vinde "+this.getNomeCliente()+" a sua Conta Especial - Nº "+this.getNumero()+" digite:\n1-Debito\n2- Credito\n3- para sair\n\nSaldo atual: R$"+this.getSaldo()+"\nSaldo do Limite: R$"+this.limite+"\n\n Quantidade de movimentos restantes: "+(10-this.qtdMovimentos)));
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
					JOptionPane.showMessageDialog(null,"Obrigado por Utilizar O FCBM!\n Volte Sempre!");
					break;
				default: 
					JOptionPane.showMessageDialog(null,"Opção invalida!\nPor favor, tente novamente!");
					break;
			}
		}while(opc!=3 && this.qtdMovimentos<=10);
		if(this.qtdMovimentos>10) {
			JOptionPane.showMessageDialog(null, "Quantidade de movimentos exedida!");
		}
	}
	
}