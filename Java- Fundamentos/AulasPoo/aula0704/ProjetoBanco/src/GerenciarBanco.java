import model.Conta;
import model.Corrente;
import model.Poupanca;

import java.util.ArrayList;
import java.util.List;

public  class GerenciarBanco {
    static List<Conta>  listConta = new ArrayList<>();

    public static void main(String[] args) throws IllegalAccessException {
        Corrente corrente = new Corrente(1,"Mogi Mirim","Luisinho di Larinha",2000);
        listConta.add(corrente);
        corrente.depositar(5000);
        corrente.sacar(1200);

        System.out.println(corrente);
        System.out.println("Patrimonio do banco:"+patrimonioBanco());
    }

    public static double patrimonioBanco(){
        double total = 0;
        for(Conta c : listConta){
            total += c.getSaldo();
        }
        return total;
    }
}
