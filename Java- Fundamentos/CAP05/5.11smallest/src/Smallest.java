import java.util.Scanner;
public class Smallest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero,menor=0;
        do{
            System.out.printf("Menor:%d\n",menor);
            System.out.println("Digite um numero (inteiro):");
            numero = Integer.parseInt(sc.nextLine());

            if(menor==0&&numero>0){
                menor=numero;
            }
           else if(numero<menor&&numero>0){
                menor=numero;
            }
        }while(numero>=0);
        System.out.printf("Menor definitivo:%d",menor);
    }
}
