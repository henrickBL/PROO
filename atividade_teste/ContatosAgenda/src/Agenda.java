import java.util.Scanner;

public class Agenda {
    Scanner inserir = new Scanner(System.in);
    private int tamanho;
    private int i;
    private Contato[] contato;
    boolean y = true;

    public Agenda() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Defina o tamanho da agenda (quantidade de contatos):");
        tamanho = inserir.nextInt();
        for (i = 0; i < tamanho; i++) {
            contato = new Contato[i];
        }
    }

    public int getTamanho() {
        return tamanho;
    }

    public void cadastrarContato() {
        System.out.println("========= Dados dos contatos =========");
        for (int i = 0; i < getTamanho(); i++) {
            if (contato[i] == null) {
                contato[i] = new Contato();
                break;
            }
        }
    }

    public void exibirContatos() {
        for (int i = 0; i < getTamanho(); i++) {
            if (contato[i] != null) {
                contato[i].getContato();
            }
        }
    }

    public void procurarContato() {
        System.out.println(" ");
        System.out.println("Digite o nome do contato:");
        String busca = inserir.next();

        for (int i = 0; i < getTamanho(); i++) {
            if (contato[i] != null) {
                if (contato[i].getNome().equalsIgnoreCase(busca)) {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("---------- Dados do contato ----------");
                    contato[i].getContato();
                    y = false;
                    break;
                }
            }
        }

        if (y) {
            System.out.println(" ");
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Contato não encontrado! :/");
        }
        y = true;
    }

    public void excluirContato() {
        System.out.println(" ");
        System.out.println("Digite o nome do contato que deseja excluir:");
        String busca = inserir.nextLine();

        for (int i = 0; i < getTamanho(); i++) {
            if (busca == contato[i].getNome()) {
                contato[i] = null;
                System.out.println(" ");
                System.out.println("Contato excluído!");
                y = false;
                break;
            }
        }
        if (y) {
            System.out.println(" ");
            System.out.println("Contato não encontrado! :/");
        }
        y = true;
    }

    public void exibirLista() {
        System.out.println(" ");
        System.out.println(" ");
        System.out.print("\033[H\033[2J");
        System.out.flush();
        for (int i = 0; i < getTamanho(); i++) {
            if (contato[i] != null) {
                int num = i + 1;
                System.out.println(num + " - " + contato[i].getNome());
            } else {
                break;
            }
        }
    }
}