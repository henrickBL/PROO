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
            System.out.println("7 - Alterar notas de um aluno (informe o número de matrícula do aluno");
            System.out.println("8 - Exibir média dos alunos de uma turma (informe o código da turma)");
            System.out.println("9 - Sair");

            System.out.print("Qual sua opção? ");
            int op = inserir.nextInt();
            inserir.nextLine();

            switch (op) {
                case 1:
                    addTurma();
                    System.out.println();
                    break;
                case 2:
                    cadastrarAluno();
                    System.out.println();
                    break;
                case 3:
                    listarTurmas();
                    System.out.println();
                    break;
                case 4:
                    removerTurma();
                    System.out.println();
                    break;
                case 5:
                    listarAlunos();
                    System.out.println();
                    break;
                case 6:
                    consultarMedia();
                    System.out.println();
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    System.out.println("Saindo...");
                    x = false;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente. ");
                    break;
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
