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

    public Equipe(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Digite o nome da equipe:");
        nome = inserir.next();
        System.out.println("Digite quantAtletas quantidade de atletas na equipe:");
        quantAtletas = inserir.nextInt();
        for(i = 0; i < quantAtletas; i++){
            atleta = new Atleta[i];
        }
        System.out.println("Digite o esporte que quantAtletas equipe vai participar:");
        esporte = inserir.next();
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
        return this.nome;
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