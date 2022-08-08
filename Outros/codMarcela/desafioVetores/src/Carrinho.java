import java.util.Scanner;

public class Carrinho {

  Scanner leia = new Scanner(System.in);  
  private String codigo;
  private Produto[] produto;

  public Carrinho() {
    produto = new Produto[2];
  }
  
  public void cadastrar() {
  
    for (int i = 0; i < produto.length; i++) {
        if (produto[i] == null) {
            produto[i] = new Produto();
            break;
        }
    }
  }
  public String getCodigo() {
      return codigo;
  }
  public Produto[] getProduto() {
      return produto;
  }
  public float totalPagar() {
      float totalPagar = 0;
    for (int i = 0; i < produto.length; i++) {
    if (produto[i] != null && produto[i].getPreco() != 0 && produto[i].getQuant() != 0) {
              totalPagar += produto[i].getPreco() * produto[i].getQuant();
        }
     }
    return totalPagar;
  }
}