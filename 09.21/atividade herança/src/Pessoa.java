import java.util.Scanner;

public class Pessoa {
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
     
    
    public Pessoa(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe nome e cpf: ");
        nome = entrada.nextLine();
        cpf = entrada.next();
    }
    
    public String getNome(){
        return nome;
    }
    
    public void exibir(){
        System.out.println("Pessoa: "+nome+" "+cpf);
    }
}