import java.util.Scanner;
public class Elevador {
    Scanner inserir = new Scanner(System.in);
    String nome;
    int andar_atual; //térreo == 0
    int total_andares; //desconsiderando o térreo
    int capacidade;
    int ocupantes;

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
        if((ocupantes + 1) <= capacidade){
            ocupantes++;
        }
    }

    void Sair(){
        if(ocupantes > 0){
            ocupantes = ocupantes - 1;
        }
    }

    void Subir(){
        if(andar_atual < total_andares){
            andar_atual++;
        }
    }

    void Descer(){
        if(andar_atual > 0){
            andar_atual = andar_atual - 1;
        }
    }
    inserir.close();
}