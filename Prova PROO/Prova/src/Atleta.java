import java.util.Scanner;

public class Atleta {
    Scanner inserir = new Scanner(System.in);
    private String nome;
    private String curso;
    private int ano;
    private String nasc;

    public String getNome(){
        return nome;
    }

    public String getCurso(){
        return curso;
    }

    public int getAno(){
        return ano;
    }

    public String getNasc(){
        return nasc;
    }
}