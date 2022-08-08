import java.util.Scanner;
public class Principal {
    public static void main(String[] args){
    Scanner inserir = new Scanner(System.in);
    String cor;

        System.out.println("Qual a cor da camisa?");
        cor = inserir.next();
    

    if (cor.equalsIgnoreCase("branca")){
        System.out.println("funcionou");
    }
    inserir.close();
    }
}