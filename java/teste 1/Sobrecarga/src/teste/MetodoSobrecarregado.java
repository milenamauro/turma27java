package teste;

public class MetodoSobrecarregado {

	public void testaMetodosSobrecarregados() {
		
		
		System.out.printf("Salario em numero inteiro:  %\n",salario(1000));
		System.out.printf("Salario em numero double:  %\n",salario(7.500));
	}
	
	public int salario(int valorInt) {
   System.out.printf("Salario com argumento inteiro:  %\n",valorInt);
   return valorInt * valorInt;
	}
	
	public double salario(double valorDouble){
		System.out.printf("Salario com argumento double:  %\n",valorDouble);
		   return valorDouble * valorDouble;
	}
}
