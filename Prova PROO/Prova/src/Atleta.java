import java.util.Scanner;

public class Atleta {
    Scanner inserir = new Scanner(System.in);
    private String nome;
    private String curso;
    private int ano;
    private String nasc;
    String informatica = "Informática";
    String eletroeletronica = "Eletroeletrônica";

    public Atleta(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Digite o nome do atleta:");
        nome = inserir.next();
        System.out.println("Digite o curso do atleta (Informática ou Eletroeletrônica):");
        curso = inserir.next();
        while ((curso.equalsIgnoreCase(informatica)) == false && (curso.equalsIgnoreCase(eletroeletronica)) == false) {
            System.out.println("Curso inválido, digite novamente!");
            curso = inserir.next();
        }
        System.out.println("Digite o ano escolar do atleta:");
        ano = inserir.nextInt();
        System.out.println("Digite a data de nascimento do atleta:");
        nasc = inserir.nextLine();
    }

    public String getNome(){
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public int getAno() {
        return ano;
    }

    public String getNasc() {
        return nasc;
    }
}