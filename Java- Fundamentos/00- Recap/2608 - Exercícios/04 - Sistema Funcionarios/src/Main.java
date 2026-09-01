public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Luis", "Analista de sistemas", 1600);

        funcionario.imprimir();
        funcionario.aumentarSalario(30);
        
    }
}