import java.util.ArrayList;
import java.util.Scanner;

public class Pessoa {
    Scanner inserir = new Scanner(System.in);
    private String nome;
    private double CPF;
    int ocupacao;
    
    Pessoa(){
        System.out.println("Informe o seu nome:");
        nome = inserir.next();
        System.out.println("Informe o seu CPF (somente os números, ignore pontos ou espaços):");
        CPF = inserir.nextDouble();
    }

    public double getCPF() {
        return CPF;
    }

    public String getNome() {
        return nome;
    }
}