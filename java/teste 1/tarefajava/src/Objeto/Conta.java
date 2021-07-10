package Objeto;

public class Conta {
    //atributo
	private int numero;
	private  double saldo;
	private  double limite;
	
	//construtor
	
	public Conta(int numero){
		this.numero = numero;
	}
	
	public Conta(int numero,double saldo){
		this.numero = numero;
		this.saldo=saldo;
	}

	public Conta(int numero, double saldo, double limite, boolean deposita, int imprimeExtrato) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		
	}
	//empapsulamento

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
	 
}
