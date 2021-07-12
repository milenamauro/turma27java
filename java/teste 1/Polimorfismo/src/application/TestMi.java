package application;
import entitites.Funcionario;
import entitites.Terceiro;
public class TestMi {

	public static void main(String[] args) {
	 
		Funcionario func1 = new Funcionario("001",40,20.50);
		Terceiro ter1= new Terceiro("100",80,15.00,100.20);
		
		System.out.println("FUNCIONARIO CLT");
		System.out.println("Matricula: "+func1.getMatricula());
		System.out.println("Salario atual: "+func1.salario());
		
		System.out.println("FUNCIONARIO TERCEIRO");
		System.out.println("Matricula: "+ter1.getMatricula());
		System.out.println("Salario atual: "+ter1.salario());

	}

}
 