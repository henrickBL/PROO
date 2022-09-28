import java.util.Scanner;

public class Livro extends Livraria {
    Scanner inserir = new Scanner(System.in);
    private String titulo;
    private float preco;
    private String autor;

    Livro() {
        System.out.println("Qual o título do livro?");
        titulo = inserir.next();
        System.out.println("Qual o preço do livro?");
        preco = inserir.nextFloat();
        System.out.println("Qual o autor do livro?");
        autor = inserir.next();
    }

    public void Exibir() {
        System.out.println("");
        System.out.println("Título: " + titulo);
        System.out.println("Preço: " + preco);
        System.out.println("Autor: " + autor);
        System.out.println("");
    }

    public float calcularDesconto() {
        this.preco = preco - (preco * 30/100);
        return preco;
    }
}
