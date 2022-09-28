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

    public void consultarProduto() {
        System.out.print("Qual o título/autor do produto? ");
        String codigo = inserir.next();

        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getTitulo() == codigo || livros.get(i).getAutor() == codigo) {
                livros.get(i).exibir();
            }
        }

        for (int i = 0; i < cds.size(); i++) {
            if (cds.get(i).getTitulo() == codigo) {
                cds.get(i).exibir();
            }
        }

        for (int i = 0; i < dvds.size(); i++) {
            if (dvds.get(i).getTitulo() == codigo) {
                dvds.get(i).exibir();
            }
        }
    }

    public void exibirProdutos() {
        System.out.println("Qual tipo de produto deseja exibir?");
        System.out.println("1 - Livro");
        System.out.println("2 - CD");
        System.out.println("3 - DVD");
        System.out.println("4 - Todos");
        int x = inserir.nextInt();

        while (x != 1 && x != 2 && x != 3 && x != 4) {
            System.out.println("Opção inválida, digite novamente:");
            x = inserir.nextInt();
        }

        if (x = 1) {
            for (int i = 0; i < livros.size(); i++) {
                livros(i).exibir();
            }
        }

        if (x = 2) {
            for (int i = 0; i < cds.size(); i++) {
                cds(i).exibir();
            }
        }

        if (x = 3) {
            for (int i = 0; i < dvds.size(); i++) {
                dvds(i).exibir();
            }
        }

        if (x = 4) {
            
        }
    }
}
