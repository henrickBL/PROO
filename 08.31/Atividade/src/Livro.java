import java.util.Scanner;

public class Livro {
    Scanner inserir = new Scanner(System.in);
    private String titulo;
    private String autor;
    private String genero;
    private double preco;

    Livro() {
        System.out.println("Digite o título do livro:");
        titulo = inserir.nextLine();
        System.out.println("Digite o autor do livro:");
        autor = inserir.nextLine();
        System.out.println("DIgite o gênero do livro:");
        genero = inserir.nextLine();
        System.out.println("Digite o preço do livro:");
        preco = inserir.nextDouble();
    }

    public void Exibir() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Gênero: " + getGenero());
        System.out.println("Preço: " + getPreco());
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double reajuste) {
        this.preco = preco + ((reajuste/100) * preco);
        System.out.println("Novo preço: " + this.preco);
    }
}
