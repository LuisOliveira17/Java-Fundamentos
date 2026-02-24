import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        Conta conta1= new Conta();
        Conta conta2= new Conta();

        conta1.conta(50);
        conta2.conta(100);

        System.out.printf("Valor da conta 1:%.2f",conta1.getBalanco());
        System.out.printf("\nValor da conta 2:%.2f",conta2.getBalanco());

        System.out.println("\nDepositar na conta 1:");
        double quantia= input.nextDouble();
        conta1.credito(quantia);
        System.out.printf("Valor da conta 1:%.2f",conta1.getBalanco());
        System.out.printf("\nValor da conta 2:%.2f",conta2.getBalanco());

        System.out.println("\nDepositar na conta 2:");
        double quantia2= input.nextDouble();
        conta2.credito(quantia2);
        System.out.printf("Valor da conta 1:%.2f",conta1.getBalanco());
        System.out.printf("\nValor da conta 2:%.2f",conta2.getBalanco());





    }
}