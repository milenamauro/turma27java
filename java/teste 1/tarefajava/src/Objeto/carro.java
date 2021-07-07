package Objeto;

public class carro {
	
	public String modelo;
	public String cor;
	public double motor;
	public String tipoDecombu;
	public boolean ligado;
	public int velocidade;
	
	public void ligarCarro() {
	ligado=true;
	System.out.println("Carro ligando...");
	
	
	    }
	public void desligarCarro() {
		if(velocidade==0){
			ligado=false;
			System.out.println("Desligando carro");
			
		} else {
			System.out.println("Desacelerar carro");} 
		
		}
	public void acelerar() {
		velocidade++;
		
	}

}