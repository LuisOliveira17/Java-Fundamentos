import java.util.Scanner;

public class ComissoesVenda {
    public static void main(String[] args) {
        int[] faixasSalariais = new int[9];
        double vendaBruta =0;
        int salario = 0;

        Scanner sc = new Scanner(System.in);

        while(true){
            if(vendaBruta==-1){
                break;
            }
            System.out.println("Digite o valor de venda bruta:");
            vendaBruta=Double.parseDouble(sc.nextLine());
            salario = (int)(200+(vendaBruta*0.09));

            System.out.println("Salario: "+salario+"\n");

            if(salario>=200&&salario<=399){
                faixasSalariais[0]+=1;
            }
            else if(salario>=300&&salario<=399){
                faixasSalariais[1]+=1;
            }else if(salario>=400&&salario<=499){
                faixasSalariais[2]+=1;
            }
            else if(salario>=500&&salario<=599){
                faixasSalariais[3]+=1;
            }
            else if(salario>=600&&salario<=699){
                faixasSalariais[4]+=1;
            }
            else if(salario>=700&&salario<=799){
                faixasSalariais[5]+=1;
            }else if(salario>=800&&salario<=899){
                faixasSalariais[6]+=1;
            }else if(salario>=900&&salario<=999){
                faixasSalariais[7]+=1;
            }else{
                faixasSalariais[8]+=1;
            }
        }
        System.out.println("$200-299\t$300-399\t$400-499\t$500-599\t$600-699\t$700-799\t$800-899\t$900-999\t1000>");
        for(int i=0;i<faixasSalariais.length;i++){
            System.out.print(faixasSalariais[i]+"\t");
        }
    }
}
