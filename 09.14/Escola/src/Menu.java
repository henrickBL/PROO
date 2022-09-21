import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private Scanner inserir;
    private ArrayList<Turma> turmas = new ArrayList<>();
    private boolean x = true;

    Menu() {
        inserir = new Scanner(System.in);
    }

    public void iniciar() {

        while (x) {

            System.out.println("1 - Cadastrar turma");
            System.out.println("2 - Cadastrar aluno (informe a turma)");
            System.out.println("3 - Listar turmas (exibe todas as turmas)");
            System.out.println("4 - Remover turma (informe a turma)");
            System.out.println("5 - Listar alunos por turma (informe a turma)");
            System.out.println("6 - Consultar média de um aluno (informe o número de matrícula do aluno)");
            System.out.println("7 - Sair");

            System.out.print("Escolha a opção:");
            int op = inserir.nextInt();
            while (op < 1 || op > 7) {
                System.out.println("Opção inválida! Digite novamente:");
                op = inserir.nextInt();
            }
            inserir.nextLine();

            if (op == 1) {
                addTurma();
                System.out.println();
            }

            if (op == 2) {
                cadastrarAluno();
                System.out.println();
            }

            if (op == 3) {
                listarTurmas();
                System.out.println();
            }

            if (op == 4) {
                removerTurma();
                System.out.println();
            }
            if (op == 5) {
                listarAlunos();
                System.out.println();
            }

            if (op == 6) {
                consultarMedia();
                System.out.println(" ");
            }

            if (op == 7) {
                System.out.println("Encerrando programa...");
                x = false;
            }
        }
    }

    public void addTurma() {

        turmas.add(new Turma());
    }

    public void cadastrarAluno() {

        inserir = new Scanner(System.in);
        System.out.print("Em qual turma o aluno será cadastrado? ");
        int codigo = inserir.nextInt();

        for (int i = 0; i < turmas.size(); i++) {
            if (turmas.get(i).getCodigo() == codigo) {
                turmas.get(i).cadastrarAluno();
                System.out.println();
                break;
            }
        }

    }

    public void listarTurmas() {
        for (Turma t : turmas) {
            t.exibir();
            System.out.println();
        }

    }

    public void removerTurma() {
        inserir = new Scanner(System.in);
        System.out.print("Qual turma será removida? ");
        int codigo = inserir.nextInt();

        System.out.println();
        for (int i = 0; i < turmas.size(); i++) {
            if (turmas.get(i).getCodigo() == codigo) {
                turmas.remove(i);
            }
        }
    }

    public void listarAlunos() {

        inserir = new Scanner(System.in);
        System.out.print("Listar alunos de qual turma? (informar o código) ");
        int codigo = inserir.nextInt();

        for (int i = 0; i < turmas.size(); i++) {
            if (turmas.get(i).getCodigo() == codigo) {
                turmas.get(i).exibirAlunos();
            }
        }

    }

    public void consultarMedia() {

        inserir = new Scanner(System.in);
        System.out.print("Consultar média de qual aluno? (informar o matricula) ");
        int matricula = inserir.nextInt();

        for (int i = 0; i < turmas.size(); i++) {
            for (int j = 0; j < turmas.get(i).getAlunos().size(); j++) {
                if (turmas.get(i).getAlunos().get(i).getMatricula() == matricula) {
                    System.out.println("Média: " + turmas.get(i).getAlunos().get(i).mostrarMedia());
                }
            }
        }

    }

}
