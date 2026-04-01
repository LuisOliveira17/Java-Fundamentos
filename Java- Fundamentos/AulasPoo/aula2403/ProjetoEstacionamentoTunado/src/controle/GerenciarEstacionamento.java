package controle;

import model.Cliente;
import model.Registro;
import model.Veiculo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarEstacionamento {
    private List<Cliente> mensalistas = new ArrayList<>();
    private List<Registro> ocupados = new ArrayList<>();
    private static double valorHora = 10.0;

    public static void main(String[] args) {

        int resp = 0;
        Scanner sc = new Scanner(System.in);
        GerenciarEstacionamento funcs = new GerenciarEstacionamento();

        // Cliente Teste
        Veiculo v1 = new Veiculo("1234", "RolsRoice");
        Cliente c1 = new Cliente("Luis", "46789877625", true);


        funcs.mensalistas.add(c1);
        c1.adicionarVeiculo(v1);

        do {

            System.out.println("\nMenu:");
            System.out.println("1.Entrada");
            System.out.println("2.Saida");
            System.out.println("3.Status");
            System.out.println("0.Sair");
            System.out.println("---------------");
            System.out.println("Escolha:");

            resp = Integer.parseInt(sc.nextLine());

            switch (resp) {
                case 1 -> funcs.execRegistarEntrada();
                case 2 -> funcs.execRegistarSaida();
                case 3 -> funcs.listarVagas();
            }

        } while (resp != 0);
    }

    public void execRegistarEntrada() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a placa:");
        String placa = sc.nextLine();

        Cliente clienteAchado = null;
        Veiculo veiculoAchado = null;

        for (Cliente cliente : mensalistas) {

            for (Veiculo veiculo : cliente.veiculoCliente) {

                if (veiculo.getPlaca().equalsIgnoreCase(placa)) {

                    clienteAchado = cliente;
                    veiculoAchado = veiculo;
                    break;
                }
            }
        }
        if(clienteAchado!=null) {

            Registro registro = new Registro(veiculoAchado);
            ocupados.add(registro);
        }
        else{ //Cliente não está na lista de mensalistas
            System.out.println("ENTRADA DE CLIENTE AVULSO GERADA");
            Veiculo veiculoAvulso= new Veiculo(placa,"Desconhecido");
            Registro registro = new Registro(veiculoAvulso);
            ocupados.add(registro);
        }

    }

    public void execRegistarSaida() {

        Scanner sc = new Scanner(System.in);

        Cliente dono = null;
        Registro registroAchado = null;

        System.out.println("Digite a placa para saida:");
        String placa = sc.nextLine();

        // Procurar registro na lista
        for (Registro registro : ocupados) {

            if (registro.getVeiculo().getPlaca().equalsIgnoreCase(placa)) {

                registroAchado = registro;
                break;
            }
        }

        if (registroAchado == null) {

            System.out.println("Veiculo nao encontrado no estacionamento");
            return;
        }

        Veiculo veiculoAchado = registroAchado.getVeiculo();

        // Descobrir se é mensalista
        for (Cliente cliente : mensalistas) {

            if (cliente.getVeiculoCliente().contains(veiculoAchado)) {

                dono = cliente;
            }
        }

        if (dono != null) {

            registroAchado.setSaida(LocalDateTime.now());

            System.out.println("Placa:" + veiculoAchado.getPlaca());
            System.out.println("Nome:" + dono.getNome());
            System.out.println("OBRIGADO PELA PREFERÊNCIA!!!!");
            System.out.println("SEM VALOR PAGO (mensalista)");

            ocupados.remove(registroAchado);

        } else {

            registroAchado.setSaida(LocalDateTime.now());

            Duration tempoAvulso = registroAchado.calcularTempo();
            double horas = tempoAvulso.toMinutes() / 60.0;

            double valor = horas * valorHora;

            System.out.println("Placa:" + veiculoAchado.getPlaca());
            System.out.println("Valor a ser pago:" + valor);

            ocupados.remove(registroAchado);
        }
    }

    public void listarVagas() {

        for (Registro registro : ocupados) {

            Veiculo v = registro.getVeiculo();
            Cliente dono = null;

            for (Cliente cliente : mensalistas) {

                for (Veiculo veiculo : cliente.getVeiculoCliente()) {

                    if (veiculo.getPlaca().equalsIgnoreCase(v.getPlaca())) {

                        dono = cliente;
                        break;
                    }

                    if (dono != null) break;
                }
            }
            System.out.println("");
            System.out.println("Placa:" + v.getPlaca());

            if (dono != null) {

                System.out.println("Dono: " + dono.getNome());
                System.out.println("Tipo: Mensalista");
                System.out.println("");

            } else {
                System.out.println("");
                System.out.println("Tipo: Avulso");
            }

            System.out.println("Entrada: " + registro.getEntrada());
        }
    }
}