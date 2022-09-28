import java.util.ArrayList;
import java.util.Scanner;

public class Livraria {
    Scanner inserir = new Scanner(System.in);
    private ArrayList<Livro> livros = new ArrayList<>();
    private ArrayList<Cd> cds = new ArrayList<>();
    private ArrayList<Dvd> dvds = new ArrayList<>();

    public void addLivro() {
        System.out.println("Qual tipo de objeto deseja adicionar?");
        System.out.println("1 - Livro");
        System.out.println("2 - CD");
        System.out.println("3 - DVD");
        int x = inserir.nextInt();

        while (x != 1 && x != 2 && x != 3) {
            System.out.println("Opção inválida, digite novamente:");
            x = inserir.nextInt();
        }

        if (x = 1) {
            livros.add(new Livro());
        }

        if (x = 2) {
            cds.add(new Cd());
        }

        if (x = 3) {
            dvds.add(new Dvd());
        }
    }
}
