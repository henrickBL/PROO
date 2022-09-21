public class Principal {

   
    public static void main(String[] args) {
        String nome="teste 123";
        Estudante est1 = new Estudante(1456, "ifal", nome, "1234");
        est1.exibir();
        
        Pessoa p = new Pessoa();
        p.exibir();
    }
    
}