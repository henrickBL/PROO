import java.util.Scanner;

public class Equipe {
    Scanner inserir = new Scanner(System.in);
    private String nome;
    private String esporte;
    private double pontuacao;
    Atleta[] atleta;
    Treinador treinador;
    private int quantAtletas;
    private int i;
    String futebol = "Futebol";
    String volei = "Vôlei";
    String basquete = "Basquete";

    public Equipe(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Digite o nome da equipe:");
        nome = inserir.next();
        System.out.println("Digite a quantidade de atletas na equipe:");
        quantAtletas = inserir.nextInt();
        for(i = 0; i < quantAtletas; i++){
            atleta = new Atleta[i];
        }
        System.out.println("Digite o esporte que a equipe vai participar (Apenas futebol, vôlei e basquete são aceitos):");
        esporte = inserir.next();
        if ((esporte.equalsIgnoreCase(futebol)) == false && (esporte.equalsIgnoreCase(volei)) == false && (esporte.equalsIgnoreCase(basquete)) == false) {
            System.out.println(" ");
            System.out.println("Esporte inválido, tente novamente!");
            System.out.println(" ");
            esporte = inserir.next();
        }
        treinador = new Treinador();
    }

    public void adicionarAtleta() {
        for (i = 0; i < quantAtletas; i++) {
            if (atleta[i] == null) {
                atleta[i] = new Atleta();
                break;
            }
        }
    }

    public int getQuantAtletas() {
        return quantAtletas;
    }

    public String getNome() {
        return nome;
    }

    public String getEsporte(){
        return this.esporte;
    }

    public double getPontuacao(){
        return this.pontuacao;
    }

    public void setPontuacao(double x) {
        this.pontuacao = pontuacao + x;
    }
}