import java.util.Scanner;

public class Treinador {
    Scanner inserir = new Scanner(System.in);
    private String nome;
    private String curso;
    private double telefone;

    public Treinador(){
        System.out.println("Digite o nome do treinador:");
        nome = inserir.next();
        System.out.println("Digite o curso do treinador:");
        curso = inserir.next();
        System.out.println("Digite o telefone do treinador:");
        telefone = inserir.nextDouble();
    }

    public void setTreinador(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("-------=======[ ALTERAR TREINADOR ]=======-------");
        System.out.println("DIgite o nome do novo treinador:");
        this.nome = inserir.next();
        System.out.println("Digite o curso do novo treinador:");
        this.curso = inserir.next();
        System.out.println("Digite o telefone do novo treinador:");
        this.telefone = inserir.nextDouble();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Treinador alterado com sucesso!");
    }

    public String getNome() {
        return nome;
    }
}