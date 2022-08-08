import java.util.Scanner;

public class Produto {
    
   Scanner leia = new Scanner(System.in);
  
  private String descricao;
  private int quant;
  private double preco;
  private String codigo;
  private Fabricante fabricante;
 
  public Produto(){
    
    System.out.println("Sobre Produto----->");
    System.out.println("Digite a descrição do produto: ");
    descricao = leia.nextLine();
    System.out.println("Qual a Quantidade: ");
    quant = leia.nextInt();
    System.out.println("Qual o Preço? ");
    preco = leia.nextDouble();
    System.out.println("Código: ");
    codigo = leia.next();
    fabricante = new Fabricante();
  }

  public Fabricante getFabricante() {
      return fabricante;
  }
  public String getDescricao() {
      return descricao;
  }
  public double getPreco() {
      return preco;
  }
  public int getQuant() {
      return quant;
  }
  public String getCodigo() {
      return codigo;
  }
  public void setQuant(int quant) {
      this.quant = quant;
  }
}