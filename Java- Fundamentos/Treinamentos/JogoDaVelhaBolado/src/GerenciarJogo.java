public class GerenciarJogo {
    public static void main(String[] args) {
        RegrasEInterface gerenciar = new RegrasEInterface();

        gerenciar.geraInterface();
        gerenciar.imprimirInterface();
        gerenciar.recebeJogadas();
    }
}
