package entities;

public class Student {
	public String name;
	
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public String toString() {
		if (notaFinal() >= 60) {
			return "PASS";
		} else {
			return "FAILED\n" + "MISSING " + String.format("%.2f", pontosRestantes());
		}
	}
	
	public double pontosRestantes() {
		double pontos = 60 - (notaFinal());
		return pontos;
	}
}
