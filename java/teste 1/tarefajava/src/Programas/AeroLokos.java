package Programas;

import Objeto.Aviao;

public class AeroLokos {

	public static void main(String[] args) {
		
		Aviao aviao1 = new Aviao();  
		//instaciar 
		
		
		aviao1.modelo = "BIMOTOR";
		aviao1.rodas = 3;
		aviao1.tipo = "PASSAGEIRO 14 LUGARES";
		aviao1.noAr = false;
		aviao1.ligado = false;
		aviao1.velocidade=0;
		
		//vamos colocar essa aviao pra voar....
		System.out.println("SITUAÇÃO DO AVIAO....");
		System.out.println("Velocimentro atual: "+aviao1.velocidade+" NO AR "+aviao1.noAr+" LIGADO "+aviao1.ligado);
		System.out.println("VAMO PRA PISTA");
		aviao1.ligar(); 
		aviao1.aumentarVelocidade();
		aviao1.aumentarVelocidade();
		aviao1.aumentarVelocidade();
		aviao1.diminuirVelocidade();
		aviao1.diminuirVelocidade();
		aviao1.diminuirVelocidade();
		System.out.println("Velocimentro atual: "+aviao1.velocidade+" NO AR "+aviao1.noAr+" LIGADO "+aviao1.ligado);
		aviao1.decolando();
		aviao1.aumentarVelocidade(40);
		System.out.println("Velocimentro atual: "+aviao1.velocidade+" NO AR "+aviao1.noAr+" LIGADO "+aviao1.ligado);
		aviao1.diminuirVelocidade(40);
		System.out.println("Velocimentro atual: "+aviao1.velocidade+" NO AR "+aviao1.noAr+" LIGADO "+aviao1.ligado);
		aviao1.pousar();
		System.out.println("Velocimentro atual: "+aviao1.velocidade+" NO AR "+aviao1.noAr+" LIGADO "+aviao1.ligado);
		aviao1.desligar();
		System.out.println("Velocimentro atual: "+aviao1.velocidade+" NO AR "+aviao1.noAr+" LIGADO "+aviao1.ligado);
	}

}