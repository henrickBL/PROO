import java.util.Scanner;

public class Cd extends Livraria {
    Scanner inserir = new Scanner(System.in);
    private String titulo;
    private int numFaixas;
    private float preco;

    Cd() {
        System.out.println("Qual o título do CD?");
        titulo = inserir.next();
        System.out.println("Qual o número de faixas do CD?");
        numFaixas = inserir.nextInt();
        System.out.println("Qual o preço do CD?");
        preco = inserir.nextFloat();
    }

    public void Exibir() {
        System.out.println("");
        System.out.println("Título: " + titulo);
        System.out.println("Preço: " + preco);
        System.out.println("Número de faixas: " + numFaixas);
        System.out.println("");
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumFaixas() {
        return numFaixas;
    }

    public float getPreco() {
        return preco;
    }

    public float calcularDesconto() {
        return preco - (preco * 25/100);
    }
}
