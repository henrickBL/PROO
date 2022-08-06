import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner inserir = new Scanner(System.in);
        boolean x = true;
        int menu = 0;
        Contato contato = new Contato();

        while (x) {
            System.out.println("============== AGENDA - MENU ==============");
            System.out.println(" ");
            System.out.println("1 ----------------- Cadastrar contato");
            System.out.println("2 ------------------- Exibir contatos");
            System.out.println("3 --------- Procurar contato por nome");
            System.out.println("4 ------------------- Remover contato");
            System.out.println("5 ------------------------------ Sair");
            menu = inserir.nextInt();
            while (menu != 1 && menu != 2 && menu != 3 && menu != 4 && menu != 5) {
                System.out.println(" ");
                System.out.println("Opção inexistente, digite novamente:");
                menu = inserir.nextInt();
            }

            if (menu == 1) {
                // Cadastrar contato
            }

            if (menu == 2) {
                // Exibir contatos
            }

            if (menu == 3) {
                // Procurar contatos por nome
            }

            if (menu == 4) {
                // Remove contato
            }

            if (menu == 5) {
                // Sair
                // Limpando a tela
                System.out.print("\033[H\033[2J");
                System.out.flush();
                x = false;
            }
        }
    }
}