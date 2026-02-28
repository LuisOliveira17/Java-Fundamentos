import java.util.Scanner;

public class MontarTabela {
    public static void main(String[] args){
        System.out.println("N\t10*N\t100*N\t1000*N");
        for (int n=1;n<=5;n++){
            System.out.printf("\n%d\t%d\t%d\t%d\t",n,10*n,100*n,1000*n);
        }

    }
}

//A tabulação buga. Não tem o que fazer =(
