package Testes;

public class TesteInterface {
 public static void main (String args[]) {
	 
	 ParticipanteForum participante = new ParticipanteForum();
	 Leitor leitor = participante;
	 System.out.println("O participante está lendo:  "+leitor.lendo());
	 Programador programador = participante;
	 String Java="java";
	 programador.pensando(Java.toCharArray());
	 System.out.println("E programador:" + programador.digitando());
 }
}
