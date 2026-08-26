
public class Main {
    public static void main(String[] args) {
        ContBancaria contaBancaria = new ContBancaria("4524", "Luis",1500);

        contaBancaria.depositar(5);
        contaBancaria.sacar(1354);
        contaBancaria.mostrarSaldo();
    }
}
