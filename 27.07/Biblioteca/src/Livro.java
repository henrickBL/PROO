import java.util.Scanner;

public class Livro {
    Scanner inserir = new Scanner(System.in);
    private String titulo;
    private String genero;
    private Autor[] autor;
    private int quantAutores;
    private int i;

    Livro(){
        System.out.println("Digite o título do livro");
        titulo = inserir.nextLine();
        System.out.println("Digite o gênero do livro:");
        genero = inserir.nextLine();
        System.out.println("Quantos autores o livro possui? (Máx.: 4    Mín.: 1)");
        quantAutores = inserir.nextInt();
        while (quantAutores > 4 || quantAutores < 1) {
            quantAutores = inserir.nextInt();
        }
        autor = new Autor[quantAutores];
        for(i = 0; i < quantAutores; i++){
            autor[i] = new Autor();
        }
    }

    public void consultarLivro(){
        System.out.println("Título: " + this.titulo);
        System.out.println("Gênero: " + this.genero);
        for(i = 0; i < quantAutores; i++){
            autor[i];
        }
        System.out.println("E-mail do autor: " );
        System.out.println("CEP de residência do autor: " );
        System.out.println("Estado de residência do autor: " );
        System.out.println("Cidade de residência do autor: " );
    }

    public void atualizarLivro(){

    }

    public void excluirLivro(){

    }
}