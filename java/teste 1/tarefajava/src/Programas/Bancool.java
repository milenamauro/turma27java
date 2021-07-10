package Programas;

import Objeto.Conta;

public class Bancool {

	public static void main(String[] args) {
		
		Conta cliente1= new Conta(1);
		//instanciar
		Conta clientevip= new Conta(1000.55.55);
		Conta clienteEspecial= new Conta(3);
		Conta cliJaque= new Conta(45,1995.45.2000.00);
		
		
		System.out.println(cliente1.getNumero());
		
		 
		
	}

}
