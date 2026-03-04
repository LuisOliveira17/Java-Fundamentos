public class GerenciarEstacionamento {
    //Definir um cliente com dois carros
    public static void main(String[] args) {
        Cliente cliente= new Cliente();

        cliente.idCLiente=1;
        cliente.nome= "Luis";
        cliente.email="luis@gmail.com";

        Carro carro1 = new Carro();

        carro1.marca="Fiat";
        carro1.modelo="Palio";
        carro1.anoFab=2011;
        carro1.placa="GGG-1111"; //Ele existe independente de pertencer a alguem

        Carro carro2 = new Carro();

        carro2.marca="Honda";
        carro2.modelo="Civic";
        carro2.anoFab=2019;
        carro1.placa="GGG-1111";

        //Associacao:
        cliente.adicionarCarro(carro1);
        cliente.adicionarCarro(carro2);
        cliente.imprimir();

    }
}
