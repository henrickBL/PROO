import java.util.Scanner;

public class Equipe {
    Scanner inserir = new Scanner(System.in);
    private String esporte;
    private double pontuacao;
    private Atleta[] atleta;
    private Treinador treinador;

    public String getEsporte(){
        return esporte;
    }

    public double getPontuacao(){
        return pontuacao;
    }
}