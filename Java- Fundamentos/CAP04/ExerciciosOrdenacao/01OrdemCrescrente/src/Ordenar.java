import java.util.Scanner;

public class Ordenar {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int maior=0,meio=0,menor=0,temp;

        int n1=Integer.parseInt(input.nextLine());
        maior=n1;
        int n2= Integer.parseInt(input.nextLine());
        if(n2>maior){
            meio=maior;
            maior=n2;
        }else{
            meio=n2;
        }
        int n3= Integer.parseInt(input.nextLine());
        if(n3>maior) {
            menor=meio;
            meio=maior;
            maior=n3;
        }
        else if(n3>meio){
            menor=meio;
            meio=n3;
        }else{
            menor=n3;
        }
        System.out.printf("%d\n%d\n%d", maior,meio,menor);
}}
