package Objeto;

public class Patinete {

	int rodinhas;
	String tipo;
	int velocidade = 0;
	boolean eletrico, temFreio;
	
	Patinete(int rodas, String marca, boolean eletrico, boolean temFreio){
		this.rodinhas = rodas;
		this.tipo = marca;
		this.eletrico = eletrico;
		this.temFreio = temFreio;
	}
	
	public void empurraComOPe() {
		velocidade++;
	}
	
	public void frearComPe() {
		if (velocidade > 0) {
			velocidade--;
		}
	}
	
	public void acelerar() {
		if (eletrico) {
			velocidade += 5;
		}
	}
	
	public void frearComFreio() {
		if (temFreio) {
			if (velocidade > 5) {
			velocidade -= 5;
			}
			else {
				velocidade = 0;
			}
		}
	}
	
}