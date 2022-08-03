import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner inserir = new Scanner(System.in);
        String nomeComparacao = " ";
        int x;
        int i;
        boolean menu = true;
        int novoCarrinho;
        Carrinho carrinho1 = new Carrinho();
        Carrinho[] carrinho2;

        while (menu) {
            System.out.println("======= MENU =======");
            System.out.println("1 ----------------------------------- Cadastrar produto");
            System.out.println("2 ----------------------------------- Consultar produto");
            System.out.println("3 ----------------- Consultar produtos de um fabricante");
            System.out.println("4 --------------------- Pagar compra e finalizar pedido");
            x = inserir.nextInt();

            while (x != 1 && x != 2 && x != 3 && x != 4 && x != 5 && x != 6) {
                System.out.println("Número inválido, insira novamente:");
                x = inserir.nextInt();
            }

            if (x == 1) {
                System.out.println("Quantos produtos deseja cadastrar?");
                novoCarrinho = inserir.nextInt();
                carrinho2 = new Carrinho[novoCarrinho];
                for (i = 0; i < novoCarrinho; i++) {
                    carrinho2[i] = new Carrinho();
                }
            } else {
                if (x == 2) {
                    for (i = 0; i < carrinho1.quantProdutos; i++) {
                        carrinho1.produto[i].showProduto();
                    }
                } else {
                    if (x == 3) {
                        System.out.println("Digite o nome do fabricante que deseja consultar os produtos:");
                        nomeComparacao = inserir.nextLine();
                        for (i = 0; i < carrinho1.quantProdutos; i++) {
                            if (carrinho1.produto[i].fab.getNome() == nomeComparacao) {
                                carrinho1.produto[i].showProduto();
                            }
                        }
                    } else {
                        if (x == 4) {
                            System.out.println("Total a pagar: " + carrinho1.getTotal());
                            menu = false;
                        }
                    }
                }
            }
        }
    }
}