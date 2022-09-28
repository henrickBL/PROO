import java.util.Scanner;

public class Dvd extends Livraria {
    Scanner inserir = new Scanner(System.in);
    private String titulo;
    private int duracao;
    private float preco;

    Dvd() {
        System.out.println("Qual o título do DVD?");
        titulo = inserir.next();
        System.out.println("Qual a duração do DVD?");
        duracao = inserir.nextInt();
        System.out.println("Qual o preço do DVD?");
        preco = inserir.nextFloat();
    }

    public void Exibir() {
        System.out.println("");
        System.out.println("Título: " + titulo);
        System.out.println("Preço: " + preco);
        System.out.println("Duração: " + duracao);
        System.out.println("");
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public float getPreco() {
        return preco;
    }

    public float calcularDesconto() {
        return preco - (preco * 15/100);
    }
}
