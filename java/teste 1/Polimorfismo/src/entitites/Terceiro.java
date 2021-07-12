package entitites;
//atributo
public class Terceiro extends Funcionario {
	
private double adicional;



//sobrecarga construtor
public Terceiro(String matricula, int horasTrabalhadas, double valorHorastrabalhadas, double adicional) {
	super(matricula, horasTrabalhadas, valorHorastrabalhadas);
	this.adicional = adicional;
}

public Terceiro(String matricula, double adicional) {
	super(matricula);
	this.adicional = adicional;
}

  //encapsulamento
public double getAdicional() {
	return adicional;
}

public void setAdicional(double adicional) {
	this.adicional = adicional;
}
 










}



