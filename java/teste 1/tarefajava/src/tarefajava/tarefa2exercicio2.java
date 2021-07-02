package tarefajava;

public class tarefa2exercicio2

private void scanf(String string, float x) {
	// TODO Auto-generated method stub
	
{
	 
	float x;
	float y;
	float z;
	
	System.out.println("Digite um número\n");
	 scanf("%f",&&x);
	 
	 System.out.println("Digite um número\\n");
	 scanf("%f",&&y);
	 
	 System.out.println("Digite um número\\n");
	 scanf("%f",&&z);
	 
	 
	 if (x < y && y < z)
	 {
		 System.out.println("A ordem crescente é: %2.f %2.f %2.f ", x, y, z);
	 }

	 else if (x < z && z < y)
		 
	 {
		 System.out.println("A ordem crescente é: %2.f %2.f %2.f ", x, z, y);
	 }

  else if (z < x && x < y)
		 
	 {
		 System.out.println("A ordem crescente é: %2.f %2.f %2.f ", z, x, y);
	 }
	 
   else
   {
		 System.out.println("A ordem crescente é: %2.f %2.f %2.f ", z, y, x);
	 }
	 
}
 
}
