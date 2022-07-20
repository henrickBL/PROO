import java.util.Scanner;
public class Elevador {
    Scanner inserir = new Scanner(System.in);
    String nome;
    int andar_atual; //térreo == 0
    int total_andares; //desconsiderando o térreo
    int capacidade;

    Elevador(){
        capacidade = 6;
        andar_atual = 0;
        total_andares = 5;
    }

    Elevador(capacidade, total_andares){
        capacidade = inserir.nextInt();
        total_andares = inserir.nextInt();

    }

    void Entrar(){
        
    }
    inserir.close();
}