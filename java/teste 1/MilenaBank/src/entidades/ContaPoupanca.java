package entidades;

public class ContaPoupanca extends Conta {
    
	  private int diaAniversarioPoupanca

	public ContaPoupanca(int numero, String nomeCliente, int diaAniversarioPoupanca) {
		super(numero, nomeCliente);
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	 
	 
	}

	public int getDiaAniversarioPoupanca() {
		return diaAniversarioPoupanca;
	}

	public void setDiaAniversarioPoupanca(int diaAniversarioPoupanca) {
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}

}
