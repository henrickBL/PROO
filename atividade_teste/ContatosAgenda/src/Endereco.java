import java.util.Scanner;

public class Endereco {
    Scanner inserir = new Scanner (System.in);
    private String rua;
    private String bairro;
    private String cidade;

    public Endereco(){
        System.out.println(" ");
        System.out.println("============== Endereço ==============");
        System.out.println("Rua:");
        rua = inserir.nextLine();
        System.out.println(" ");
        System.out.println("Bairro:");
        bairro = inserir.nextLine();
        System.out.println(" ");
        System.out.println("Cidade:");
        cidade = inserir.nextLine();
        System.out.println(" ");
    }

    public String getRua() {
        return this.rua;
    }
    public String getBairro() {
        return this.bairro;
    }
    public String getCidade() {
        return this.cidade;
    }

    public void getEndereco(){
        System.out.println("Rua: " + getRua());
        System.out.println("Bairro: " + getBairro());
        System.out.println("Cidade: " + getCidade());
    }
}