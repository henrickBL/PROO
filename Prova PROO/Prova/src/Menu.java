import java.util.Scanner;

public class Menu {
    Scanner inserir = new Scanner(System.in);
    boolean x = true;
    boolean b = true;
    int menu = 0;
    int i;
    int j;
    int quantEquipes;
    String comparar;
    double pontos;
    private Equipe[] equipe;

    Menu() {

        System.out.println("Digite a quantidade de equipes:");
        quantEquipes = inserir.nextInt();
        for (i = 0; i < quantEquipes; i++) {
            equipe = new Equipe[i];
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();

        while (x) {
            System.out.println(" ");
            System.out.println("-------=======[ JOGOS INTERNOS ]=======-------");
            System.out.println(" ");
            System.out.println("1 --------------------------- Adicionar equipe");
            System.out.println("2 ----------------------------- Remover equipe");
            System.out.println("3 --------------------------- Adicionar atleta");
            System.out.println("4 ----------------------------- Remover atleta");
            System.out.println("5 ------------------------ Adicionar pontuação");
            System.out.println("6 ---------------------------- Mudar treinador");
            System.out.println("7 ------- Finalizar jogos (mostrar resultados)");
            System.out.println(" ");
            menu = inserir.nextInt();
            while (menu != 1 && menu != 2 && menu != 3 && menu != 4 && menu != 5 && menu != 6 && menu != 7) {
                System.out.println(" ");
                System.out.println("Opção inexistente, digite novamente:");
                menu = inserir.nextInt();
            }

            if (menu == 1) {
                // adicionar equipe
                adicionarEquipe();
            }

            if (menu == 2) {
                // remover equipe
                removerEquipe();
            }

            if (menu == 3) {
                // adicionar atleta
                adicionarAtleta();
            }

            if (menu == 4) {
                // remover atleta
                removerAtleta();
            }

            if (menu == 5) {
                // adicionar pontuação
                adicionarPontuacao();
            }

            if (menu == 6) {
                // mudar treinador
                mudarTreinador();
            }

            if (menu == 7) {
                // finalizar jogos (mostrar resultados de todos os esportes) / sair
                finalizarJogos();
            }
        }
    }

    public void adicionarPontuacao() {
        System.out.println("Digite o nome da equipe que deseja adicionar pontos:");
        comparar = inserir.next();
        for (i = 0; i < quantEquipes; i++) {
            if (equipe[i] != null) {
                if (equipe[i].getNome().equalsIgnoreCase(comparar)) {
                    System.out.println("Digite quantos pontos quer adicionar:");
                    pontos = inserir.nextDouble();
                    equipe[i].setPontuacao(pontos);
                    break;
                }
            }
        }
    }

    public void mudarTreinador() {
        System.out.println("Digite o nome da equipe que deseja substituir o treinador:");
        comparar = inserir.next();
        for (i = 0; i < quantEquipes; i++) {
            b = true;
            if (equipe[i] != null) {
                if (equipe[i].treinador.getNome().equalsIgnoreCase(comparar)) {
                    equipe[i].treinador.setTreinador();
                    b = false;
                    break;
                }
            }
        }

        if (b) {
            System.out.println("Treinador não encontrado!");
        }
    }

    public void adicionarAtleta() {
        System.out.println("Digite o nome da equipe que deseja adicionar atleta:");
        comparar = inserir.next();
        for (i = 0; i < quantEquipes; i++) {
            b = true;
            if (equipe[i] != null) {
                if (equipe[i].getNome().equalsIgnoreCase(comparar)) {
                    equipe[i].adicionarAtleta();
                    b = false;
                    break;
                }
            }
        }

        if (b) {
            System.out.println("Equipe não encontrada!");
        }
    }

    public void removerAtleta() {
        System.out.println("Digite o nome da equipe que o atleta pertence:");
        comparar = inserir.next();
        for (i = 0; i < quantEquipes; i++) {
            b = true;
            if (equipe[i] != null) {
                if (equipe[i].getNome().equalsIgnoreCase(comparar)) {
                    int quantAtletas = equipe[i].getQuantAtletas();
                    System.out.println("Digite o nome do atleta:");
                    comparar = inserir.next();
                    for (j = 0; j < quantAtletas; j++) {
                        boolean p = true;
                        if (equipe[i].atleta[j] != null) {
                            if (equipe[i].atleta[j].getNome().equalsIgnoreCase(comparar)) {
                                equipe[i].atleta[j] = null;
                                System.out.println(" ");
                                System.out.println("Atleta removido com sucesso!");
                                System.out.println(" ");
                                p = false;
                                break;
                            }
                        }
                        if (p) {
                            System.out.println("Atleta não encontrada!");
                        }
                    }
                    b = false;
                    break;
                }
            }
        }

        if (b) {
            System.out.println("Equipe não encontrada!");
        }
    }

    public void adicionarEquipe() {
        b = true;
        for (i = 0; i < quantEquipes; i++) {
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

    public void removerEquipe() {
        System.out.println("Digite o nome da equipe que deseja remover:");
        comparar = inserir.next();
        for (i = 0; i < quantEquipes; i++) {
            b = true;
            if (equipe[i] != null) {
                if (equipe[i].getNome().equalsIgnoreCase(comparar)) {
                    equipe[i] = null;
                    System.out.println("Equipe removida com sucesso!");
                    b = false;
                    break;
                }
            }
        }

        if (b) {
            System.out.println("Equipe não encontrada!");
        }
    }

    public void finalizarJogos() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("-------=======[ RESULTADOS ]=======-------");

        for (i = 0; i < quantEquipes; i++) {
            if (equipe[i] != null) {
                System.out.println(" ");
                System.out.println("Equipe: " + equipe[i].getNome());
                System.out.println("Esporte: " + equipe[i].getEsporte());
                System.out.println("Pontuação: " + equipe[i].getPontuacao());
                System.out.println(" ");
            }
        }
        x = false;
    }
}