import java.util.Scanner;

public class Teste3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[5];

        for(int i=0; i<v.length;i++){
            System.out.printf("Digite o item da pos.%d:",i);
            int num=Integer.parseInt(sc.nextLine());
            v[i]=num;
        }
        for(int i=0; i<v.length;i++){
            System.out.printf("%d ",v[i]);
        }
    }
}
