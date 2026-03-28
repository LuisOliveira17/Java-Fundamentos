package controle;

import model.Cliente;
import model.Registro;
import model.Veiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarEstacionamento {
    private List<Cliente> mensalistas = new ArrayList<>(); //Lista de mensalistas (Clientes Cadastrados)
    private List <Registro> ocupados = new ArrayList<>();
    private static double valorHora=10.0;

    public static void main(String[] args) {
        int resp=0;
        Scanner sc = new Scanner(System.in);
        GerenciarEstacionamento funcs = new GerenciarEstacionamento(); // Acessar metodos publicos pq to com preguiça de jogar tudo para static

        //Cliente Teste
        Veiculo v1 = new Veiculo("1234","RolsRoice");
        Cliente c1 = new Cliente("Luis","46789877625",true);
        funcs.mensalistas.add(c1);
        c1.adicionarVeiculo(v1);

        do{
            System.out.println("Menu");
            System.out.println("------------");
            System.out.println("1.Entrada");
            System.out.println("2.Saida");
            System.out.println("3.Status");
            System.out.println("0.Sair");
            System.out.println("---------------");
            System.out.println("Escolha:");
            resp=Integer.parseInt(sc.nextLine());

            switch (resp){
                case 1->funcs.execRegistarEntrada();
                case 2->funcs.execRegistarSaida();
                case 3->funcs.listarVagas();
            }
        }while(resp!=0) ;

    }

    public void  execRegistarEntrada(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a placa:");
        String placa = sc.nextLine();
        Cliente clienteAchado = null;
        Veiculo veiculoAchado = null;

        for(Cliente cliente:mensalistas){ // Em cada cliente, percorre sua lista de carros e tenta encontrar um carro com a mesma placa
            for(Veiculo veiculo: cliente.veiculoCliente){
                if(veiculo.getPlaca().equalsIgnoreCase(placa)){
                    clienteAchado=cliente;
                    veiculoAchado =veiculo;
                    break;
                }
            }

        }if(clienteAchado==null){
            System.out.println("CLIENTE NÃO ECONTRADO");
        }else if(clienteAchado!=null){
            Registro registro = new Registro(veiculoAchado); //Cria um registro com a placa achada em mensalistas
            ocupados.add(registro);
        }

    }

    public void execRegistarSaida(){

    }

    public void listarVagas(){
        for(Registro registro:ocupados){ //Percorro todo o registro de vagas
            Veiculo v = registro.getVeiculo(); //Para cada item, Um item veiculo recebe seu respectivo veiculo
            Cliente dono=null;

            for(Cliente cliente:mensalistas){ //Percorre a lista de mensalistas
                for(Veiculo veiculo :cliente.getVeiculoCliente()){
                    if(veiculo.getPlaca().equalsIgnoreCase(v.getPlaca())){ //Percorre cada carro do cliente
                        dono = cliente; //Se for igual ao veiculo do registro, achei o dono
                        break;
                    }
                    if (dono != null) break;
                }
            }

            System.out.println("Placa:"+ v.getPlaca());
            if (dono != null) {
                System.out.println("Dono: " + dono.getNome());
                System.out.println("Tipo: Mensalista");
            } else {
                System.out.println("Tipo: Avulso");
            }

            System.out.println("Entrada: " + registro.getEntrada());

        }
    }
}
