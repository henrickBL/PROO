import java.util.Scanner;

public class Equipe {
    Scanner inserir = new Scanner(System.in);
    private String nome;
    private int esporte;
    private String nomeEsporte;
    private double pontuacao;
    Atleta[] atleta;
    Treinador treinador;
    private int quantAtletas;
    private int atletasCadastrados = 0;
    private int i;
    String futebol = "Futebol";
    String volei = "Vôlei";
    String basquete = "Basquete";

    public Equipe() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Digite o nome da equipe:");
        nome = inserir.next();
        System.out.println(" ");
        System.out.println("Digite a quantidade de atletas na equipe:");
        quantAtletas = inserir.nextInt();
        for (i = 0; i <= quantAtletas; i++) {
            atleta = new Atleta[i];
        }
        System.out.println(" ");
        System.out.println("Digite o esporte que a equipe vai participar:");
        System.out.println(" ");
        System.out.println("1 ------------------- Futebol");
        System.out.println("2 --------------------- Vôlei");
        System.out.println("3 ------------------ Basquete");
        esporte = inserir.nextInt();
        while (esporte != 1 && esporte != 2 && esporte != 3) {
            System.out.println(" ");
            System.out.println("Opção inválida, digite novamente!");
            esporte = inserir.nextInt();
        }
        if (esporte == 1) {
            nomeEsporte = "Futebol";
        }
        if (esporte == 2) {
            nomeEsporte = "Vôlei";
        }
        if (esporte == 3) {
            nomeEsporte = "Basquete";
        }
        treinador = new Treinador();
    }

    public void adicionarAtleta() {
        i = getAtletasCadastrados();
        atleta[i] = new Atleta();
        atletasCadastrados++;
    }

    public int getQuantAtletas() {
        return quantAtletas;
    }

    public int getAtletasCadastrados() {
        return atletasCadastrados;
    }

    public String getNome() {
        return nome;
    }

    public String getEsporte() {
        return nomeEsporte;
    }

    public double getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(double x) {
        this.pontuacao = pontuacao + x;
    }

    public void exibirEquipe() {
        System.out.println(" ");
        System.out.println("Equipe: " + getNome());
        System.out.println("Esporte: " + getEsporte());
        System.out.println("Pontuação: " + getPontuacao());
        System.out.println("Treinador: " + treinador.getNome());
        System.out.println("Curso do treinador: " + treinador.getCurso());
        System.out.println("Telefone do treinador: " + treinador.getTelefone());
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Atletas:");
        for (i = 0; i < getAtletasCadastrados(); i++) {
            if (atleta[i] != null) {
                System.out.println(" ");
                System.out.println("Nome: " + atleta[i].getNome());
                System.out.println("Curso: " + atleta[i].getCurso());
                System.out.println("Ano escolar: " + atleta[i].getAno());
                System.out.println("Data de nascimento: " + atleta[i].getNascDia() + "/" + atleta[i].getNascMes() + "/" + atleta[i].getNascAno());
                System.out.println(" ");
            } else {
                break;
            }
        }
    }
}