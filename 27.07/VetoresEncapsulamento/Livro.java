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
        System.out.println("Título: " + this.titulo);
        System.out.println("Gênero: " + this.genero);
        System.out.println("Autor: " + autor.getNome());
        System.out.println("E-mail do autor: " + autor.getE_mail());
        System.out.println("CEP de residência do autor: " + autor.getCEP());
        System.out.println("Estado de residência do autor: " + autor.getEstado());
        System.out.println("Cidade de residência do autor: " + autor.getCidade());
    }

    public void atualizarLivro(){

    }

    public void excluirLivro(){

    }
}