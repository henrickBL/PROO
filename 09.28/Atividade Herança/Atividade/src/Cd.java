import java.util.Scanner;

public class Cd extends Livraria {
    Scanner inserir = new Scanner(System.in);
    private String titulo;
    private float preco;
    private int numFaixas;

    Cd() {
        System.out.println("Qual o título do CD?");
        titulo = inserir.next();
        System.out.println("Qual o preço do CD?");
        preco = inserir.nextFloat();
        System.out.println("Qual o número de faixas do CD?");
        numFaixas = inserir.nextInt();
    }

    public void Exibir() {
        System.out.println("");
        System.out.println("Título: " + titulo);
        System.out.println("Preço: " + preco);
        System.out.println("Número de faixas: " + numFaixas);
        System.out.println("");
    }

    public float calcularDesconto() {
        this.preco = preco - (preco * 25/100);
        return preco;
    }
}
