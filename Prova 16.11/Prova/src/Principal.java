
import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        Scanner inserir = new Scanner(System.in);
        boolean b = true;
        int x;
        Double a;
        ArrayList<Pessoa> pessoas = new ArrayList();
        Estudante estudante;
        Professor professor;
        Tecnico tecnico;
        int ocupacao;

        while (b) {
            Menu();
            x = inserir.nextInt();
            while (x != 1 && x != 2 && x != 3 && x != 4) {
                System.out.println("Opção inválida / inexistente. Por favor, digite novamente:");
                x = inserir.nextInt();
            }

            if (x == 1) {
                System.out.println("Olá, você escolheu a opção 1 (Cadastrar usuário), informe os dados solicitados para prosseguir com a solicitação.");
                System.out.println("Informe a sua ocupação:");
                System.out.println("1 - Estudante");
                System.out.println("2 - Professor");
                System.out.println("3 - Técnico");
                ocupacao = inserir.nextInt();
                while (ocupacao != 1 && ocupacao != 2 && ocupacao != 3) {
                    System.out.println("Opção inválida / inexistente. Por favor, digite novamente:");
                    ocupacao = inserir.nextInt();
                }
                
                if (ocupacao == 1) {
                    pessoas.add(estudante = new Estudante());
                }
                
                if (ocupacao == 2) {
                    pessoas.add(professor = new Professor());
                }
                
                if (ocupacao == 3) {
                    pessoas.add(tecnico = new Tecnico());
                }
            }

            if (x == 2) {
                System.out.println("Informe seu CPF para realizar a busca (somente os números, ignore pontos ou espaços):");
                a = inserir.nextDouble();
                boolean w = true; // Usuário encontrado ou não, True = não encontrado, False = encontrado
                for (int i = 0; i < pessoas.size(); i++){
                    double cpf = pessoas.get(i).getCPF();
                    if (cpf == a){
                        w = false;
                        System.out.println("Livro devolvido com sucesso!");
                        System.out.println("Quantos dias você ficou com o livro?");
                        x = inserir.nextInt();
                        
                        System.out.println("Informe a sua ocupação:");
                        System.out.println("1 - Estudante");
                        System.out.println("2 - Professor");
                        System.out.println("3 - Técnico");
                        ocupacao = inserir.nextInt();
                        if (ocupacao == 1){
                            int dias = x - 5;
                            if (dias > 0){
                                double multa = dias * 0.5;
                                System.out.println("O valor da multa a ser paga é de R$ "+multa);
                            }else{
                                System.out.println("Você devolveu o livro dentro do prazo, não haverá multa!");
                            }
                        }
                        
                        if (ocupacao == 2){
                            int dias = x - 10;
                            if (dias > 0){
                                double multa = dias * 0.5;
                                System.out.println("O valor da multa a ser paga é de R$ "+multa);
                            }else{
                                System.out.println("Você devolveu o livro dentro do prazo, não haverá multa!");
                            }
                        }
                        
                        if (ocupacao == 3){
                            int dias = x - 8;
                            if (dias > 0){
                                double multa = dias * 0.5;
                                System.out.println("O valor da multa a ser paga é de R$ "+multa);
                            }else{
                                System.out.println("Você devolveu o livro dentro do prazo, não haverá multa!");
                            }
                        }
                    }
                    if (w){
                        System.out.println("Usuário não encontrado!");
                    }
                }
            }

            if (x == 3) {
                System.out.println("Informe seu CPF para realizar a busca (somente os números, ignore pontos ou espaços):");
                a = inserir.nextDouble();
                boolean w = true; // Usuário encontrado ou não, True = não encontrado, False = encontrado
                for (int i = 0; i < pessoas.size(); i++){
                    double cpf = pessoas.get(i).getCPF();
                    if (cpf == a){
                        pessoas.remove(i);
                        System.out.println("Usuário removido com sucesso!");
                    }
                    if (w){ //mensagem de erro
                        System.out.println("Usuário não encontrado!");
                    }
                }
            }

            if (x == 4) {
                b = false;
            }
        }
    }

    public static void Menu() {
        System.out.println("BEM VINDO(A) À BIBLIOTECA DO IFAL");
        System.out.println("");
        System.out.println("1 - Cadastrar usuário");
        System.out.println("2 - Devolução do livro");
        System.out.println("3 - Remover usuário");
        System.out.println("4 - Sair");
    }
}
