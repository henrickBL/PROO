import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner inserir = new Scanner(System.in);
        boolean x = true;
        int menu = 0;
        Agenda agenda1 = new Agenda();

        while (x) {
            System.out.println(" ");
            System.out.println("============== AGENDA - MENU ==============");
            System.out.println(" ");
            System.out.println("1 ----------------- Cadastrar contato");
            System.out.println("2 ------------------- Exibir contatos");
            System.out.println("3 --------- Procurar contato por nome");
            System.out.println("4 ------------------- Remover contato");
            System.out.println("5 ---------- Exibir lista de contatos");
            System.out.println("6 ------------------------------ Sair");
            menu = inserir.nextInt();
            while (menu != 1 && menu != 2 && menu != 3 && menu != 4 && menu != 5 && menu != 6) {
                System.out.println(" ");
                System.out.println("Opção inexistente, digite novamente:");
                menu = inserir.nextInt();
            }

            if (menu == 1) {
                // Cadastrar contato
                agenda1.cadastrarContato();
            }

            if (menu == 2) {
                // Exibir contatos
                agenda1.exibirContatos();
            }

            if (menu == 3) {
                // Procurar contatos por nome
                agenda1.procurarContato();
            }

            if (menu == 4) {
                // Remove contato
                agenda1.excluirContato();
            }

            if (menu == 5) {
                // Exibir lista de contatos
                agenda1.exibirLista();
            }

            if (menu == 6) {
                // Sair
                // Limpando a tela
                System.out.print("\033[H\033[2J");
                System.out.flush();
                x = false;
            }
        }
        inserir.close();
    }
}