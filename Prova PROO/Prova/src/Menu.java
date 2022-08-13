import java.util.Scanner;

public class Menu {
    Scanner inserir = new Scanner(System.in);
    boolean x = true;
    boolean b = true;
    int menu = 0;
    int a;
    int i;
    int j;
    int equipesCadastradas = 0;
    int quantEquipes;
    int quantAtletas;
    int num;
    int num1;
    String comparar;
    int comparar1;
    double pontos;
    private Equipe[] equipe;

    Menu() {

        System.out.println("Digite a quantidade de equipes que participarão dos jogos:");
        quantEquipes = inserir.nextInt();
        for (i = 0; i <= quantEquipes; i++) {
            equipe = new Equipe[i];
        }

        System.out.print("\033[H\033[2J");
        System.out.flush();

        while (x) {
            System.out.println("-------=======[ JOGOS INTERNOS ]=======-------");
            System.out.println(" ");
            System.out.println("1 --------------------------- Adicionar equipe");
            System.out.println("2 ----------------------------- Remover equipe");
            System.out.println("3 --------------------------- Adicionar atleta");
            System.out.println("4 ----------------------------- Remover atleta");
            System.out.println("5 ------------------------ Adicionar pontuação");
            System.out.println("6 ---------------------------- Mudar treinador");
            System.out.println("7 ------------------------------ Exibir equipe");
            System.out.println("8 ------- Finalizar jogos (mostrar resultados)");
            System.out.println(" ");
            menu = inserir.nextInt();

            // estrutura para prevenir erros
            while (menu != 1 && menu != 2 && menu != 3 && menu != 4 && menu != 5 && menu != 6 && menu != 7
                    && menu != 8) {
                System.out.println(" ");
                System.out.println("Opção inexistente, digite novamente:");
                menu = inserir.nextInt();
            }

            if (menu == 1) {
                // adicionar equipe
                if (equipesCadastradas < quantEquipes) {
                    adicionarEquipe();
                    equipesCadastradas++;
                } else {
                    System.out.println("O número máximo de equipes foi atingido!");
                }
            }

            if (menu == 2) {
                // remover equipe
                if (equipesCadastradas > 0) {
                    removerEquipe();
                    equipesCadastradas--;
                } else {
                    System.out.println("Nenhuma equipe cadastrada!");
                }
            }

            if (menu == 3) {
                // adicionar atleta
                if (equipesCadastradas > 0) {
                    adicionarAtleta();
                } else {
                    System.out.println("Nenhuma equipe cadastrada!");
                }
            }

            if (menu == 4) {
                // remover atleta
                if (equipesCadastradas > 0) {
                    removerAtleta();
                } else {
                    System.out.println("Nenhum atleta cadastrado!");
                }
            }

            if (menu == 5) {
                // adicionar pontuação
                if (equipesCadastradas > 0) {
                    adicionarPontuacao();
                } else {
                    System.out.println("Nenhuma equipe cadastrada!");
                }
            }

            if (menu == 6) {
                // mudar treinador
                if (equipesCadastradas > 0) {
                    mudarTreinador();
                } else {
                    System.out.println("Nenhuma equipe cadastrada!");
                }
            }

            if (menu == 7) {
                // exibir equipe (insira o nome)
                if (equipesCadastradas > 0) {
                    exibirEquipe();
                } else {
                    System.out.println("Nenhuma equipe cadastrada!");
                }
            }

            if (menu == 8) {
                // finalizar jogos (mostrar resultados de todos os esportes) / sair
                finalizarJogos();
            }
        }
    }

    // 1 - Adicionar equipe
    public void adicionarEquipe() {
        b = true;
        for (i = 0; i <= quantEquipes; i++) {
            if (equipe[i] == null) {
                equipe[i] = new Equipe();
                b = false;
                break;
            }
        }

        if (b) {
            System.out.println("Número máximo de equipes alcançado!");
        }
    }

    // 2 - Remover equipe
    public void removerEquipe() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Escolha a equipe que deseja remover:");
        for (i = 0; i < equipesCadastradas; i++) {
            num = i + 1;
            System.out.println(num + " - " + equipe[i].getNome());
        }
        comparar1 = inserir.nextInt();
        while (comparar1 < 1 && comparar1 > equipesCadastradas) {
            System.out.println("Opção inválida, digite novamente!");
            comparar1 = inserir.nextInt();
        }
        num = comparar1 - 1;
        equipe[num] = null;
    }

    // 3 - Adicionar atleta
    public void adicionarAtleta() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Escolha a equipe que deseja adicionar o atleta:");
        for (i = 0; i < equipesCadastradas; i++) {
            num = i + 1;
            System.out.println(num + " - " + equipe[i].getNome());
        }
        comparar1 = inserir.nextInt();
        while (comparar1 < 1 && comparar1 > equipesCadastradas) {
            System.out.println("Opção inválida, digite novamente!");
            comparar1 = inserir.nextInt();
        }
        num = comparar1 - 1;
        if (equipe[num].getAtletasCadastrados() < equipe[num].getQuantAtletas()) {
            equipe[num].adicionarAtleta();
        } else {
            System.out.println("Número máximo de atletas atingido!");
        }
    }

    // 4 - Remover atleta
    public void removerAtleta() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Escolha a equipe que o atleta participa:");
        for (i = 0; i < equipesCadastradas; i++) {
            num = i + 1;
            System.out.println(num + " - " + equipe[i].getNome());
        }
        comparar1 = inserir.nextInt();
        while (comparar1 < 1 && comparar1 > equipesCadastradas) {
            System.out.println("Opção inválida, digite novamente!");
            comparar1 = inserir.nextInt();
        }
        num = comparar1 - 1;

        if (equipe[num].getAtletasCadastrados() > 0) {
            System.out.println("Selecione o atleta que deseja remover:");
            for (i = 0; i < equipe[num].getAtletasCadastrados(); i++) {
                if (equipe[num].atleta[i] != null) {
                    num1 = i + 1;
                    System.out.println(num1 + " - " + equipe[num].atleta[i].getNome());
                }
            }
            comparar1 = inserir.nextInt();
            while (comparar1 < 1 && comparar1 > equipe[i].getAtletasCadastrados()) {
                System.out.println("Opção inválida, digite novamente!");
                comparar1 = inserir.nextInt();
            }
            num1 = comparar1 - 1;
            equipe[num].atleta[num1] = null;
            int num2 = num1 + 1;
            for (i = num2; i < equipe[num].getAtletasCadastrados(); i++) {
                if (equipe[num].atleta[i] != null) {
                    equipe[num].atleta[i - 1] = equipe[num].atleta[i];
                }
            }
            a = equipe[num].getAtletasCadastrados() - 1;
            equipe[num].atleta[a] = null;
            System.out.println("Atleta removido com sucesso!");
            equipe[num].setAtletasCadastrados();
        } else {
            System.out.println("Nenhum atleta cadastrado!");
        }
    }

    // 5 - Adicionar pontuação
    public void adicionarPontuacao() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Escolha a equipe a adicionar pontos:");
        for (i = 0; i < equipesCadastradas; i++) {
            num = i + 1;
            System.out.println(num + " - " + equipe[i].getNome());
        }
        comparar1 = inserir.nextInt();
        while (comparar1 < 1 && comparar1 > equipesCadastradas) {
            System.out.println("Opção inválida, digite novamente!");
            comparar1 = inserir.nextInt();
        }
        num = comparar1 - 1;

        System.out.println("Digite a quantidade de pontos a ser adicionados na equipe:");
        pontos = inserir.nextDouble();
        equipe[num].setPontuacao(pontos);
        System.out.println("Pontos adicionados com sucesso!");
    }

    // 6 - Mudar treinador
    public void mudarTreinador() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Escolha a equipe que deseja mudar o treinador:");
        for (i = 0; i < equipesCadastradas; i++) {
            num = i + 1;
            System.out.println(num + " - " + equipe[i].getNome());
        }
        comparar1 = inserir.nextInt();
        while (comparar1 < 1 && comparar1 > equipesCadastradas) {
            System.out.println("Opção inválida, digite novamente!");
            comparar1 = inserir.nextInt();
        }
        num = comparar1 - 1;
        equipe[num].treinador.setTreinador();
    }

    // 7 - Mudar treinador
    public void exibirEquipe() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Escolha a equipe que deseja exibir:");
        for (i = 0; i < equipesCadastradas; i++) {
            num = i + 1;
            System.out.println(num + " - " + equipe[i].getNome());
        }
        comparar1 = inserir.nextInt();
        while (comparar1 < 1 && comparar1 > equipesCadastradas) {
            System.out.println("Opção inválida, digite novamente!");
            comparar1 = inserir.nextInt();
        }
        num = comparar1 - 1;
        equipe[num].exibirEquipe();
    }

    // 8 - Finalizar jogos
    public void finalizarJogos() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("--------========[ RESULTADOS ]========--------");

        for (i = 0; i < quantEquipes; i++) {
            if (equipe[i] == null) {
                break;
            } else {
                System.out.println(" ");
                System.out.println("Equipe: " + equipe[i].getNome());
                System.out.println("Esporte: " + equipe[i].getEsporte());
                System.out.println("Pontuação: " + equipe[i].getPontuacao());
                System.out.println(" ");
            }
        }
        System.out.println(" ");
        x = false;
    }
}