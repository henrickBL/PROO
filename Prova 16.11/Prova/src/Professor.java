import java.util.Scanner;

public class Professor extends Pessoa{
    Scanner inserir = new Scanner(System.in);
    private int area;
    
    Professor(){
        System.out.println("Informe a área de atuação:");
        System.out.println("1 - Informática");
        System.out.println("2 - Eletroeletrônica");
        System.out.println("3 - Formação Geral");
        area = inserir.nextInt();
        while (area != 1 && area != 2 && area != 3){
            System.out.println("Opção inválida / inexistente. Por favor, digite novamente:");
            area = inserir.nextInt();
        }
    }

    public int getArea() {
        return area;
    }
}
