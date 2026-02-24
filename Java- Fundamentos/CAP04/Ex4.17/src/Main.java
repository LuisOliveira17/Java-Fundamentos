import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        String resp= "s";
        int quantKm,quantLitro,contTanques=1;
        int totalKm=0,totalLitros=0;
        float mediaTanque;

    while(resp.equals("s")){
        System.out.printf("Digite a quant. de km rodados com o tanque %d:\n",contTanques);
        quantKm= input.nextInt();

        System.out.printf("Digite os litros utilizados do tanque %d:\n",contTanques);
        quantLitro=input.nextInt();

        mediaTanque=quantKm/quantLitro;
        totalKm+=quantKm;
        totalLitros+=quantLitro;

        System.out.printf("Media do tanque %d: %.2f km/l\n",contTanques,mediaTanque);
        System.out.printf("Total de km acumulados: %d km's\n",totalKm);
        System.out.printf("Total de litros acumulados: %d litros \n",totalLitros);

        System.out.print("\nDeseja adicionar mais um tanque?(s/n):\n");
        input.nextLine();//Limpa o buffer

        resp=input.nextLine();
            if(resp.equals("s")){
                contTanques++;
            }
        }

        System.out.printf("Total de tanques:%d\n",contTanques);
        System.out.printf("Total de km rodados:%d\n",totalKm);
        System.out.printf("Total de litros:%d\n",totalLitros);
    }

}