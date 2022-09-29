import java.util.ArrayList;
import java.util.Scanner;

public class Livraria {
    Scanner inserir = new Scanner(System.in);
    private ArrayList<Livro> livros = new ArrayList<>();
    private ArrayList<Cd> cds = new ArrayList<>();
    private ArrayList<Dvd> dvds = new ArrayList<>();

    Livraria() {
        System.out.println("Livraria ok!");
    }

    public void addProduto() {
        System.out.println("Qual tipo de objeto deseja adicionar?");
        System.out.println("1 - Livro");
        System.out.println("2 - CD");
        System.out.println("3 - DVD");
        int x = inserir.nextInt();

        while (x != 1 && x != 2 && x != 3) {
            System.out.println("Opção inválida, digite novamente:");
            x = inserir.nextInt();
        }

        if (x == 1) {
            livros.add(new Livro());
        }

        if (x == 2) {
            cds.add(new Cd());
        }

        if (x == 3) {
            dvds.add(new Dvd());
        }
    }

    public void consultarProduto() {
        System.out.print("Qual o título/autor do produto? ");
        String codigo = inserir.next();
        boolean naoEncontrado = true;

        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getTitulo().equalsIgnoreCase(codigo) || livros.get(i).getAutor().equalsIgnoreCase(codigo)) {
                livros.get(i).Exibir();
                naoEncontrado = false;
            }
        }

        for (int i = 0; i < cds.size(); i++) {
            if (cds.get(i).getTitulo().equalsIgnoreCase(codigo)) {
                cds.get(i).Exibir();
                naoEncontrado = false;
            }
        }

        for (int i = 0; i < dvds.size(); i++) {
            if (dvds.get(i).getTitulo().equalsIgnoreCase(codigo)) {
                dvds.get(i).Exibir();
                naoEncontrado = false;
            }
        }

        if (naoEncontrado) {
            System.out.println("Produto não encontrado/inexistente!");
            System.out.println("Verifique a ortografia e tente novamente.");
        }
    }

    public void exibirProdutos() {
        System.out.println(" ");
        System.out.println("Livros: ");
        for (int i = 0; i < livros.size(); i++) {
            livros.get(i).Exibir();
        }

        System.out.println(" ");
        System.out.println("CD's: ");
        for (int i = 0; i < cds.size(); i++) {
            cds.get(i).Exibir();
        }

        System.out.println(" ");
        System.out.println("DVD's: ");
        for (int i = 0; i < dvds.size(); i++) {
            dvds.get(i).Exibir();
        }
    }
}
