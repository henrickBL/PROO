import java.util.Scanner;

public class Treinador {
    Scanner inserir = new Scanner(System.in);
    private String nome;
    private String curso;
    private double telefone;

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public double getTelefone() {
        return telefone;
    }
}