import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Maior maior = new Maior();

        float n1,n2,n3;
        System.out.println("Digite o n1:");
        n1=Float.parseFloat(sc.nextLine());

        System.out.println("Digite o n2:");
        n2=Float.parseFloat(sc.nextLine());

        System.out.println("Digite o n3:");
        n3=Float.parseFloat(sc.nextLine());

        maior.defineMaior(n1,n2,n3);

    }

}
