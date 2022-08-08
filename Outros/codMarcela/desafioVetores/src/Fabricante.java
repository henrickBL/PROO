import java.util.Scanner;

public class Fabricante {
  Scanner leia = new Scanner(System.in);;
  private String nome, telefone, email;

  public Fabricante(){
    System.out.println("--------Fabricante--------");
    System.out.println("\nNome: ");
    nome = leia.nextLine();
    System.out.println("\nTelefone: ");
    telefone = leia.nextLine();
    System.out.println("\nE-mail: ");
    email = leia.nextLine();
  }
  
  public String getNome() {
      return nome;
  }
  public String getTelefone() {
      return telefone;
  }
  public String getEmail() {
      return email;
  }
  public void setNome(String nome) {
      this.nome = nome;
  }


}