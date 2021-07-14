package heranca;

public class Preguica extends Animal {

	private final boolean LENTO = true;
	private final boolean MACIO = true;
	public final String alimentacao = "Herbívoro";
	
	public Preguica(String nome, String sexo, int idade, boolean domestico) {
		super(nome, sexo, idade, domestico);
		
	}
	
	 @Override
	public void emitirSom() {
		System.out.println("Preguiça faz barulho?");
	}
	
	public void subirEmArvore() {
		if (this.isLento()) {
			System.out.println("Demora um pouco mas vai, parece eu");
		}
	}

	public boolean isLento() {
		return LENTO;
	}

	public boolean isFofinho() {
		return MACIO;
	}

}