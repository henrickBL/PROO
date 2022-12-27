import java.util.Scanner;

public class Tecnico extends Pessoa{
    Scanner inserir = new Scanner(System.in);
    private String setor;
    
    Tecnico(){
        System.out.println("Informe o setor de trabalho:");
        setor = inserir.next();
    }

    public String getSetor() {
        return setor;
    }
}