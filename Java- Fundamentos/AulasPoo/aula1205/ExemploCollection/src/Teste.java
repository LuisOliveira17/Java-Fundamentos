import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Teste {
    public static void main(String[] args){
        List lista = new LinkedList();
        //Simular tempo

        long inicio, fim;
        double tempo;

        inicio = System.currentTimeMillis();
        for(int i = 0; i < 2600000; i++){
            lista.add(i);
        }
        fim = System.currentTimeMillis();
        tempo = (fim - inicio) / 1000.0;
        System.out.println("Tempo para inserção em segundos: " + tempo);

        inicio = System.currentTimeMillis();
        for(Object i : lista){
            int x = (int) i;
        }

        fim = System.currentTimeMillis();
        tempo = (fim - inicio) / 1000.0;
        System.out.println("Tempo para varredura em  segundos: " + tempo);

    }
}
