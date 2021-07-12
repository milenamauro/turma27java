package heranca;

public class Zoo {

	public static void main(String[] args) {
		
		
		Cavalo Cavalo = new Cavalo("1", "macho", 7, true, "Malhado");
		
		peDepano.emitirSom();
		peDepano.correr();

		
		Cachorro caramela = new Cachorro("Caramela", "femea", 5, true, "Vira-lata", true);
		
		caramela.correr();
		caramela.emitirSom();
		caramela.correrAtrasDeMoto(true);
		
		if (caramela.isMacio()) {
			System.out.println("Ownnt");
		}
		
		
		Preguica preguica = new Preguica("Antonia", "femea", 25, false);
		
		preguica.emitirSom();
		preguica.subirEmArvore();
		
		if (preguica.isMacio()) {
			System.out.println("Macia mas perigosa");
		}
		
	}

}