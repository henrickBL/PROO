public class Empregado extends Pessoa {
    private String nome;
    private String cpf;
    private double salario;
    private String cargo;

    Empregado(String cargo, double salario, String cpf, String nome) {
        super(nome, cpf);
    }
}
