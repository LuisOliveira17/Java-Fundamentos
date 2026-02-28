import java.util.Scanner;
public class MaiorNumero {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int number=0, largest=0;
        int counter=1;

        System.out.printf("Digite um numero %d:", counter);
        number=input.nextInt();
        largest=number;
        System.out.println("Maior numero:"+largest);

        for(counter=2;counter<=9;counter++){
            System.out.printf("Digite o numero %d:", counter);
            number=input.nextInt();
            if(largest<number){
                largest=number;
            }
            System.out.println("Maior numero:"+largest);
        }
        System.out.println("O maior numero de 10 foi:"+largest);
    }
}
