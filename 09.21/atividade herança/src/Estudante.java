import java.util.Scanner;


public class Estudante extends Pessoa{
    private int matricula;
    private String escola;
    
    public Estudante(int matricula, String escola, String nome, String cpf){
       super(nome, cpf);         
       this.matricula = matricula;
       this.escola = escola;
        
    }
    
    /*public Estudante(){        
        Scanner tec = new Scanner(System.in);
        System.out.println("Informe a escola: ");
        escola = tec.nextLine();
        System.out.println("Informe a matricula: ");
        matricula = tec.nextInt();
    }*/
    
    public void exibir(){
        super.exibir();
        System.out.println("Estudante: "+getNome()+" "+escola+" "+matricula);
    }
}