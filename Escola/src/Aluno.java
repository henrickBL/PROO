import java.util.Scanner;

public class Aluno {

	private int matricula;
	private String nome;
	private double[] notas = new double[4];
	private Scanner inserir;

	Aluno(int matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}

	Aluno() {
		inserir = new Scanner(System.in);
		System.out.print("Matrícula: ");
		matricula = inserir.nextInt();
		inserir.nextLine();
		System.out.print("Nome: ");
		nome = inserir.nextLine();
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] == 0.0) {
				System.out.printf("Nota #%d: ", i + 1);
				notas[i] = inserir.nextDouble();
			}
		}
	}

	@Override
	public String toString() {
		return String.format("\nNome: %s\nMatricula: %d\nNotas: %.1f, %.1f, %.1f, %.1f",
				nome, matricula, notas[0], notas[1], notas[2], notas[3]);
	}

	public double mostrarMedia() {
		double soma = 0.0;
		for (int i = 0; i < notas.length; i++) {
			soma += notas[i];
		}
		return soma / notas.length;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double[] getNotas() {
		return notas;
	}

}
