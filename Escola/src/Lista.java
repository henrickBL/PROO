import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();
        lista.add("a");
        lista.add("b");
        lista.add("c");
        lista.add("d");
        lista.add("e");
        lista.add("f");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        lista.add(2, "g");

        System.out.println(" ");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        lista.remove(5);

        for (String l : lista) {
            System.out.println(l);
        }
    }
}
