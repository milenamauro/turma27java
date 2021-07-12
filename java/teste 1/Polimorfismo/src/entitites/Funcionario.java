package entitites;

public class Funcionario {
	
	private String matricula;
	private int horasTrabalhadas;
	private double valorHorastrabalhadas;
	
	public Funcionario(String matricula, int horasTrabalhadas, double valorHorastrabalhadas) {
		super();
		this.matricula = matricula;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHorastrabalhadas = valorHorastrabalhadas;
		
		
	}
//sobrecarga de construtor
	public Funcionario(String matricula) {
		super();
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorHorastrabalhadas() {
		return valorHorastrabalhadas;
	}

	public void setValorHorastrabalhadas(double valorHorastrabalhadas) {
		this.valorHorastrabalhadas = valorHorastrabalhadas;
	}
	
	public double salario() {
		
		return (horasTrabalhadas * valorHorastrabalhadas);
		
	}

}
