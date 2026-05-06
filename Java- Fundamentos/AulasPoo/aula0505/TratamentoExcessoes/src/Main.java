import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true){
        try{

                int a, b, result;
                Scanner sc = new Scanner(System.in);

                System.out.println("Digite um valor para a:");
                a = Integer.parseInt(sc.nextLine());

                System.out.println("Digite um valor para b:");
                b=sc.nextInt();

                result = a/b;

                System.out.println(result);
                break;
        }catch(NumberFormatException  |InputMismatchException ex){
            System.out.println("Erro na entrada. Valor deve ser inteiro");
        }catch(ArithmeticException ex){
            System.out.println("Erro de divisão por ZERO AAAAAAAAAAAAAAAAAA!!!!!!!!");
        }
        }



    }
}
