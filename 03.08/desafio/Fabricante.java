import java.util.Scanner;

public class Fabricante {
    Scanner inserir = new Scanner(System.in);
    private String nome;
    private String telefone;
    private String email;

    Fabricante() {
        System.out.println("Digite o nome do fabricante:");
        nome = inserir.nextLine();
        System.out.println("Digite o telefone do fabricante:");
        telefone = inserir.nextLine();
        System.out.println("Digite o endereço de e-mail do fabricante:");
        email = inserir.nextLine();
    }

    public void showFabricante() {
        System.out.println("");
        System.out.println("==== INFORMAÇÕES DO FABRICANTE ====");
        System.out.println("Nome: " + this.nome);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("E-mail: " + this.email);
    }

    public String getNome() {
        return this.nome;
    }
}