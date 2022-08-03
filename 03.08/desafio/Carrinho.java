import java.util.Scanner;

public class Carrinho {
    Scanner inserir = new Scanner(System.in);
    private int cod;
    int quantProdutos;
    private int i = 0;
    Produto[] produto;
    double total;

    /**
     * 
     */
    Carrinho() {
        System.out.println("Digite o código do novo carrinho:");
        cod = inserir.nextInt();
        System.out.println("Digite a quantidade de produtos, no geral, que deseja comprar: (Máx.: 100    Mín.: 1)");
        quantProdutos = inserir.nextInt();
        while (quantProdutos > 100 || quantProdutos < 1) {
            quantProdutos = inserir.nextInt();
        }
        produto = new Produto[quantProdutos];
        for (i = 0; i < quantProdutos; i++) {
            produto[i] = new Produto();
        }
    }

    public double getTotal() {
        for (i = 0; i < quantProdutos; i++) {
            total = +produto[i].getTotalPreco();
        }
        return this.total;
    }
}