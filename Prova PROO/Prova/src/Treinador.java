import java.util.Scanner;

public class Treinador {
    Scanner inserir = new Scanner(System.in);
    String informatica = "Informática";
    String eletroeletronica = "Eletroeletrônica";
    private String nome;
    private int curso;
    private String nomeCurso;
    private String telefone;

    public Treinador() {
        System.out.println(" ");
        System.out.println("Digite o nome do treinador:");
        nome = inserir.next();
        System.out.println(" ");
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
        telefone = inserir.next();
    }









    public void setTreinador() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("-------=======[ ALTERAR TREINADOR ]=======-------");
        System.out.println("DIgite o nome do novo treinador:");
        this.nome = inserir.next();
        System.out.println(" ");
        System.out.println("Escolha o curso do novo treinador:");
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
        System.out.println("Digite o telefone do novo treinador:");
        this.telefone = inserir.next();
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


    

    public String getTelefone() {
        return telefone;
    }
}