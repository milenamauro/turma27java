package tarefajava;

public class vetorExemplo3 {
	@SuppressWarnings("null")
	public static void main (String[] args) {
	
	String nome="Mi";
	String[] ed = null;
	String nomes[]= ed;
  
	
	int x = 0;
	if(nomes[x].equals("MI")) {
		
		System.out.println("OK … A MI");
	}
	else {
		System.out.println("n√O … A MI");
	}

}
}