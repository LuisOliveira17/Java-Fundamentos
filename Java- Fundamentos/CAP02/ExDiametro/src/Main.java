import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        System.out.print("Escreva o raio:");

        int raio= input.nextInt();
        double p = Math.PI;

        System.out.printf("Diametro:%.2f\n",2.0*raio);
        System.out.printf("Circunferencia:%.2f\n",2.0*p*raio);
        System.out.printf("area:%.2f\n",(raio*raio)*p);


    }
}