import java.util.Scanner;

public class Calculadora{
    public static void main( String args[]){
        float n1,n2;
        float resultado;
        String oper;
        Scanner input= new Scanner(System.in);
        Operacoes operacoes = new Operacoes();

        System.out.print("Digite n1:\n");
        n1= input.nextFloat();
        operacoes.setN1(n1);

        System.out.println("Digite n2:");
        n2= input.nextFloat();
        operacoes.setN2(n2);

        input.nextLine();

        System.out.print("Agora digite a operacao:");
        oper=input.nextLine();

        if(oper.equals("-")){
            resultado= operacoes.subtracao();
            System.out.printf("\nResultado: %.2f",resultado);
        }

        if(oper.equals("+")){
            resultado= operacoes.soma();
            System.out.printf("\nResultado: %.2f",resultado);
        }

        if(oper.equals("*")){
            resultado= operacoes.mult();
            System.out.printf("\nResultado: %.2f",resultado);
        }

        if(oper.equals("/")){
            resultado= operacoes.divisao();
            System.out.printf("\nResultado: %.2f",resultado);
        }
    }
}