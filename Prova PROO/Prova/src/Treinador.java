import java.util.Scanner;

public class Treinador {
    Scanner inserir = new Scanner(System.in);
    private String nome;
    private int curso;
    private String nomeCurso;
    private double telefone;
    String informatica = "Informática";
    String eletroeletronica = "Eletroeletrônica";

    public Treinador() {
        System.out.println("Digite o nome do treinador:");
        nome = inserir.next();
        System.out.println("Escolha o curso do treinador:");
        System.out.println(" ");
        System.out.println("1 --------------- Informática");
        System.out.println("2 ---------- Eletroeletrônica");
        curso = inserir.nextInt();
        while (curso != 1 && curso != 2) {
            System.out.println("Opção inválida, digite novamente!");
            curso = inserir.nextInt();
        }
        if (curso == 1) {
            nomeCurso = "Informática";
        }
        if (curso == 2) {
            nomeCurso = "Eletroeletrônica";
        }

        System.out.println(" ");
        System.out.println("Digite o telefone do treinador:");
        telefone = inserir.nextDouble();
    }

    public void setTreinador() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("-------=======[ ALTERAR TREINADOR ]=======-------");
        System.out.println("DIgite o nome do novo treinador:");
        this.nome = inserir.next();
        System.out.println("Escolha o curso do novo treinador:");
        System.out.println(" ");
        System.out.println("1 --------------- Informática");
        System.out.println("2 ---------- Eletroeletrônica");
        curso = inserir.nextInt();
        while (curso != 1 && curso != 2) {
            System.out.println("Curso inválido, digite novamente!");
            curso = inserir.nextInt();
        }
        if (curso == 1) {
            nomeCurso = "Informática";
        }
        if (curso == 2) {
            nomeCurso = "Eletroeletrônica";
        }
        
        System.out.println(" ");
        System.out.println("Digite o telefone do novo treinador:");
        this.telefone = inserir.nextDouble();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Treinador alterado com sucesso!");
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return nomeCurso;
    }

    public double getTelefone() {
        return telefone;
    }
}