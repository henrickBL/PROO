import java.util.Scanner;

public class Livro extends Livraria {
    Scanner inserir = new Scanner(System.in);
    private String titulo;
    private String autor;
    private float preco;

    Livro() {
        System.out.println("Qual o título do livro?");
        titulo = inserir.next();
        System.out.println("Qual o autor do livro?");
        autor = inserir.next();
        System.out.println("Qual o preço do livro?");
        preco = inserir.nextFloat();
    }

    public void Exibir() {
        System.out.println("");
        System.out.println("Título: " + titulo);
        System.out.println("Preço: " + preco);
        System.out.println("Autor: " + autor);
        System.out.println("");
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public float getPreco() {
        return preco;
    }

    public float calcularDesconto() {
        
        return preco - (preco * 30/100);
    }
}
