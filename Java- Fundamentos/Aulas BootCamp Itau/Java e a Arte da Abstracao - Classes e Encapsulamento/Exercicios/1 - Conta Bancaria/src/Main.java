import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int resp= 0;
        
        do{
            System.out.println("-----------");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4-  Sacar dinheiro;");
            System.out.println("5 - Pagar um boleto");
            System.out.println("6 - Verificar se a conta está usando cheque especial");
            System.out.println("7 - Sair ");
            System.out.println("-----------");
            System.out.println("Resp: ");
            resp = (Integer.parseInt(input.nextLine()));

        }while(resp!=7);
    }
}
