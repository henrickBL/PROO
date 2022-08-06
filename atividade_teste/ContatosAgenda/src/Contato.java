import java.util.Scanner;

public class Contato {
    Scanner inserir = new Scanner(System.in);
    private String nome;
    private String apelido;
    private double telefone;
    private String email;
    private Endereco endereco;

    Contato(){
        // Limpando a tela
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("========== Cadastrar contato ==========");
        System.out.println("----------- Insira os dados -----------");
        System.out.println("Nome:");
        nome = inserir.nextLine();
        System.out.println(" ");
        System.out.println("Apelido:");
        apelido = inserir.nextLine();
        System.out.println(" ");
        System.out.println("Telefone:");
        telefone = inserir.nextInt();
        System.out.println(" ");
        System.out.println("E-mail:");
        email = inserir.nextLine();
        endereco = new Endereco();
    }

    public String getNome() {
        return nome;
    }

    public String getApelido() {
        return apelido;
    }

    public double getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public void getContato() {
        System.out.println("========== Dados do contato ==========");
        System.out.println("Nome: " + getNome());
        System.out.println("Apelido: " + getApelido());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("E-mail: " + getEmail());
        endereco.getEndereco();
    }
}