import java.util.HashSet;
import java.util.Set;

public class Teste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(1,"Larinha");
        Pessoa p2 = new Pessoa(2,"Maria");
        Pessoa p3 = new Pessoa(3,"Zé Lelé");
        Pessoa p4 = new Pessoa(1,"Larinha");

        Set<Pessoa> conjunto = new HashSet<>();

        conjunto.add(p1);
        conjunto.add(p2);
        conjunto.add(p3);
        conjunto.add(p4);


        System.out.println("Tamanho do conjunto: " + conjunto.size()+"\n");

        for(Pessoa p : conjunto) {
            System.out.println(p);
        }

    }
}
