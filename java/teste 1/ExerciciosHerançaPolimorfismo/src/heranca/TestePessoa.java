package heranca;

public class TestePessoa {
   public static void main(String args[]) {
	   
	   
	   Pessoa Milena = new Pessoa("Milena", 666);
	   Funcionario1 KatyPerry = new Funcionario1("Katy Perry", 6969, "Cantriz");
	   Pessoa Rihanna = new Funcionario1("Rihanna", 6689, "Maquiadora");
	   Pessoa Bethania = new Coordenador ("Bethania", 485,"Rainha");
	   
	   System.out.println(Milena.getMatricula());
	   System.out.println(KatyPerry.getDepartamento());
	   System.out.println(Rihanna.getMatricula());
	   System.out.println(Bethania.getNome());
	   
	   
   }
}
