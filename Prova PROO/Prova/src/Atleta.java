import java.util.Scanner;

public class Atleta {
    Scanner inserir = new Scanner(System.in);
    private String nome;
    private int curso;
    private String nomeCurso;
    private int ano;
    private String nascDia;
    private String nascMes;
    private String nascAno;
    String informatica = "Informática";
    String eletroeletronica = "Eletroeletrônica";

    public Atleta(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Digite o nome do atleta:");
        nome = inserir.next();
        System.out.println(" ");
        System.out.println("Digite o curso do atleta (Informática ou Eletroeletrônica):");
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
        System.out.println("Digite o ano escolar do atleta:");
        ano = inserir.nextInt();
        System.out.println(" ");
        System.out.println("Digite a data de nascimento do atleta:");
        System.out.println("Dia:");
        nascDia = inserir.next();
        System.out.println("Mês:");
        nascMes = inserir.next();
        System.out.println("Ano:");
        nascAno = inserir.next();
    }

    public String getNome(){
        return nome;
    }

    public String getCurso() {
        return nomeCurso;
    }

    public int getAno() {
        return ano;
    }

    public String getNascDia() {
        return nascDia;
    }

    public String getNascMes() {
        return nascMes;
    }

    public String getNascAno() {
        return nascAno;
    }
}