package Objeto;

public class ProdutoEletronico {

	public String fabricante, tipo, fonteDeAlimentacao;
	public boolean movel, ligado;
	public Double quantidaDebateriaporhora;
	
	public void ligar() {
		if (!ligado) {
			ligado = true;
			System.out.println("ligaar.");
		}
	}
	
	  
	    public void desligar() {
		if (ligado) {
			ligado = false;
			System.out.println("desligar");
		}
	}
}