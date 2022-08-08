import java.util.Scanner;

public class Menu {
    Scanner leia = new Scanner(System.in);
    int opcao = 0;
    Carrinho carrinho = new Carrinho();

    Menu(){
        while (opcao != 6){
            System.out.println(" =======      MENU    ========= ");
            System.out.println("1 - Cadastrar produtodos ao sistema");
            System.out.println("2 - Consultar produtos no Carrinho");
            System.out.println("3 - Atualizar produtos no carrinho");
            System.out.println("4 - Pagar compra");
            System.out.println("5 - Remover produto do carrinho ");
            System.out.println("6 - Sair");
            System.out.println("Escolha uma das opções acima: ");
            opcao = leia.nextInt(); 
         switch (opcao){
            case 1:
                Cadastrar();
                break;
            case 2:
                Consultar();
                break;
            
            case 3:
                atualizarProdutos();
                break;
            case 4:
                Pagar();
                break;
            case 5:
                Remover();
                break;
            case 6:
                System.out.println("Sair. ");
                break;
      
            default:
                break;
        }
      }
    }

    void Cadastrar(){
        for (int i = 0; i < carrinho.getProduto().length; i++) {
        if (carrinho.getProduto()[i] == null) {
             carrinho.cadastrar();
            break;
            }
        }
    }
        
   void Consultar(){
        
        System.out.println("Informe o nome do fabricante: ");
        String fabricante = leia.next();
        for (int i = 0; i < carrinho.getProduto().length; i++) {
            if (carrinho.getProduto()[i] != null) {
                if (carrinho.getProduto()[i].getFabricante().getNome().equalsIgnoreCase(fabricante)) {
                    System.out.println(carrinho.getProduto()[i]);
                }
            }
        }
        }
    void atualizarProdutos (){
      int quantNova;
        System.out.println("\nInforme o código do produto: ");
        String cod = leia.nextLine();
        for (int i = 0; i < carrinho.getProduto().length; i++) {
            if (carrinho.getProduto()[i] != null) {
                if (carrinho.getProduto()[i].getCodigo().equalsIgnoreCase(cod)) {
                    System.out.printf("Nova quantidade: ");
                    quantNova = leia.nextInt();
                    carrinho.getProduto()[i].setQuant(quantNova);
                }
            }
        }
   }
  
    void Pagar(){
        System.out.println("Pagar compra");
        System.out.println("Valor total = R$ " + carrinho.totalPagar());
        for (int i = 0; i < carrinho.getProduto().length; i++) {
            if (carrinho.getProduto()[i] != null) {
                carrinho.getProduto()[i] = null;
            }
        }
    } 
     void Remover (){
        System.out.println("Remover produto");
        System.out.println("Informe o código do produto: ");
        String cod = leia.nextLine();
        for (int i = 0; i < carrinho.getProduto().length; i++) {
            if (carrinho.getProduto()[i] != null) {
                if (carrinho.getProduto()[i].getCodigo().equalsIgnoreCase(cod)) {
                    carrinho.getProduto()[i] = null;
                }
            }
        }
    } 
}