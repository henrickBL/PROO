import java.util.ArrayList;
import java.util.Scanner;

public class Loja {
    private ArrayList<Livro> livros = new ArrayList<>();

    public void addLivro() {
        livros.add(new Livro());
    }

    public void removerLivro() {
        inserir = new Scanner(System.in);
        System.out.print("Digite o título do livro a ser removido:");
        String titulo = inserir.next();

        System.out.println();
        boolean encontrado = false;
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getTitulo() == titulo) {
                livros.remove(i);
                encontrado = true;
            }
        }

        if (encontrado) {
            System.out.println("Livro removido com sucesso!");
        }else{
            System.out.println("Livro não encontrado!");
        }
        
    }
}
