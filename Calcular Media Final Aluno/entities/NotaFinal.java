package entities;

public class NotaFinal {

	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	public double nota4;

	public double finalNota() {
		return nota4 = nota1 + nota2 + nota3;
	}

	public double pontosRestantes() {
		if ((nota4) >= 60) {
			return 0.0;
		} else {
			return 60.0 - finalNota();
		}

	}

}
