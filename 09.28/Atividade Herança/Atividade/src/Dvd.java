import java.util.Scanner;

public class Dvd extends Livraria {
    Scanner inserir = new Scanner(System.in);
    private String titulo;
    private float preco;
    private int duracao;

    Dvd() {
        System.out.println("Qual o título do DVD?");
        titulo = inserir.next();
        System.out.println("Qual o preço do DVD?");
        preco = inserir.nextFloat();
        System.out.println("Qual a duração do DVD?");
        duracao = inserir.nextInt();
    }

    public void Exibir() {
        System.out.println("");
        System.out.println("Título: " + titulo);
        System.out.println("Preço: " + preco);
        System.out.println("Duração: " + duracao);
        System.out.println("");
    }

    public float calcularDesconto() {
        this.preco = preco - (preco * 15/100);
        return preco;
    }
}
