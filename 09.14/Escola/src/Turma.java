import java.util.ArrayList;
import java.util.Scanner;

public class Turma {

    private int codigo;
    private String nome;
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private Scanner inserir;

    Turma() {
        inserir = new Scanner(System.in);
        System.out.print("Código: ");
        codigo = inserir.nextInt();
        inserir.nextLine();
        System.out.print("Nome da turma: ");
        nome = inserir.nextLine();
    }

    Turma(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;

    }

    public void cadastrarAluno() {
        alunos.add(new Aluno());
    }

    public void exibir() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome da turma: " + nome);
        System.out.println("Quantidade de alunos: " + alunos.size());
    }

    public void exibirAlunos() {

        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

}
