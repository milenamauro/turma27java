package introducao;

 
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class CadChurras2 {
	
	public static void main(String[]args) {
		Scanner read= new Scanner(System.in);
		
		List<String> listaChurras = new ArrayList<>();
		
		listaChurras.add("Refri");
		listaChurras.add("Pão de alho");
		listaChurras.add("Queijinho");
		listaChurras.add("Cerveja");
		listaChurras.add("Carne de jaca");
		listaChurras.add("Carne do futuro");
		listaChurras.add("Linguiça do futuro");
	   
		System.out.println("tamanho atual da lista:"+listaChurras.size());
		
		for(String item: listaChurras) {
			System.out.println("item: "+item);
			   
		}
		 
		
	 
		
	}
}