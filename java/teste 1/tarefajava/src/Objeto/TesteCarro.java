package Objeto;

public class TesteCarro {

	public static void main(String[] args) {

       Carro2 meuCarro = new Carro2();
       meuCarro.cor = "Vermleho";
       meuCarro.modelo = "Passat";
       meuCarro.velocidadeAtual=0;
       meuCarro.velocidadeMaxima=80;
       
       meuCarro.liga();
       
       meuCarro.acelera(20);
       System.out.println(meuCarro.velocidadeAtual);
       meuCarro.pegaMarcha();

	}

}
