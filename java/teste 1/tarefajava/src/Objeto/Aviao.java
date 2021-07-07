package Objeto;


public class Aviao {

	//atributos
	public int rodas;
	public String modelo; 
	public String tipo;
	public boolean noAr;
	public int velocidade;
	public boolean ligado;
	public String ve;
	
	
	public void ligar() {
		ligado = true;
	}
	public void desligar() {
		ligado = false;
	}
		
	public void decolando() {
		for (int x=1; x<=10; x++) {
			aumentarVelocidade1();
		}
		
		noAr=true;
		
	}
	
	public void pousar1() {
		for (int x=1; x<=10; x++) {
			diminuirVelocidade1();
		}
		noAr=false;
		
	}
	
	public void aumentarVelocidade1() {
		velocidade++;
	}
	
	public void aumentarVelocidade1(int acrescimo) {
		velocidade = velocidade + acrescimo;
	}
	
	public void diminuirVelocidade1() {
		velocidade--;
	}
	
	public void diminuirVelocidade1(int decrescimo) {
		velocidade-= decrescimo;
	}
	
 
		
		public void pousar() {
			for (int x=1; x<=10; x++) {
				diminuirVelocidade1();
			}
			noAr=false;
			
		}
		
		public void aumentarVelocidade() {
			velocidade++;
		}
		
		public void aumentarVelocidade(int acrescimo) {
			velocidade = velocidade + acrescimo;
		}
		
		public void diminuirVelocidade() {
			velocidade--;
		}
		
		public void diminuirVelocidade(int decrescimo) {
			velocidade-= decrescimo;
		}
		
	}
