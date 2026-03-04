import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public int idCLiente;
    public String nome;
    public String email;

    public List<Carro> carros= new ArrayList<>();

    public void imprimir(){
        System.out.println("Dados da pessoa e seus automóveis:");
        System.out.println("===================================");
        System.out.println("idCLiente = " + idCLiente);
        System.out.println("nome = " + nome);
        System.out.println("email = " + email);
        System.out.println("\nLista de seus carros:");
        for(Carro carro: carros){ // Para cada item em carro
            carro.imprimir();
        }
        System.out.println("Total de Carros: "+carros.size());
        System.out.println("=================================");
    }

    public void adicionarCarro(Carro carro){
        carros.add(carro);
    }
}
