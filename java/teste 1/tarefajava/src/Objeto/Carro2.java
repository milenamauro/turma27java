package Objeto;

public class Carro2 {
	
	
	 String cor;
     String modelo;
     double velocidadeAtual;
	 public double velocidadeMaxima;
	 
	 
	 void liga() 
	 {
		 System.out.println("O carro está ligado...");
	 }
	 
	 
	 void acelera(double quantidade)
	 {
		 double velocidaeNova = this.velocidadeAtual+quantidade;
		 this.velocidadeAtual=velocidaeNova;
	 }
	 
	int pegaMarcha()
	{
		if(this.velocidadeAtual<0) 
		{
			return -1;
		}
		if(this.velocidadeAtual>=0 && this.velocidadeAtual<40)
		{
			return 1;
			
		}
		if(this.velocidadeAtual>=40 && this.velocidadeAtual<80)
		{
			return 2;
		}
		return 0;
	}
	 
	 
}
	 
 