package Vetores_e_Encapsulamento;
import java.util.Scanner;

public class Autor {
    Scanner inserir = new Scanner(System.in);

    private String nome;
    private String e_mail;
    private String CEP;
    private String estado;
    private String cidade;

    Autor(){
        System.out.println("Digite o nome do autor do livro:");
        nome = inserir.nextLine();
        System.out.println("Digite o endereço de e-mail do autor do livro:");
        e_mail = inserir.nextLine();
        System.out.println("Digite o CEP do endereço autor do livro:");
        CEP = inserir.nextLine();
        System.out.println("Digite o estado que o autor do livro reside:");
        estado = inserir.nextLine();
        System.out.println("Digite a cidade que o autor do livro reside:");
        cidade = inserir.nextLine();
    }

    public String getNome() {
        return this.nome;
    }

    public String getE_mail() {
        return this.e_mail;
    }

    public String getCEP() {
        return this.CEP;
    }

    public String getEstado() {
        return this.estado;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void changeAutor(){
        
    }
}