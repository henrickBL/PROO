import java.util.Scanner;

public class Produto {
    Scanner inserir = new Scanner(System.in);
    private String descricao;
    int quant;
    double preco;
    private int cod;
    Fabricante fab;

    Produto() {
        System.out.println("Digite o código do produto:");
        cod = inserir.nextInt();
        System.out.println("Digite o preço do produto:");
        preco = inserir.nextDouble();
        System.out.println("Digite a quantidade de produtos desta categoria:");
        quant = inserir.nextInt();
        fab = new Fabricante();
    }

    public void showProduto() {
        System.out.println("==== INFORMAÇÕES DO PRODUTO ====");
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Preço: " + this.preco);
        System.out.println("Código: " + this.cod);
        fab.showFabricante();
    }

    public void setQuant(int quant) {
        System.out.println("Digite a nova quantidade de produtos:");
        this.quant = inserir.nextInt();
    }

    private double totalPreco = preco * quant;

    public double getTotalPreco() {
        return totalPreco;
    }
}

/*
 * 1 v
 * 2 v
 * 3 1/2 v
 * 4 1/2 v
 * 5 1/3 v
 * 6
 */