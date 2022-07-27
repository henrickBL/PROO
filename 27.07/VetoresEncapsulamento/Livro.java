package Vetores_e_Encapsulamento;
import java.util.Scanner;

public class Livro {
    Scanner inserir = new Scanner(System.in);
    private String titulo;
    private String genero;
    private Autor autor;

    Livro(){
        System.out.println("Digite o título do livro");
        titulo = inserir.nextLine();
        System.out.println("Digite o gênero do livro:");
        genero = inserir.nextLine();
        autor = new Autor();
    }

    public void consultarLivro(){

    }

    public void atualizarLivro(){

    }

    public void excluirLivro(){

    }
}