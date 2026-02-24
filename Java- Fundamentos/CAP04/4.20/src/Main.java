import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float horasPassadas = 0;
        float salarioHora = 0;
        float salarioBruto = 0;
        float horaExtra = 0, adicionais=0;

        for (int x = 1; x <= 3; x++) {
            System.out.printf("\nHoras da semana passada do func. %d:", x);
            horasPassadas = input.nextFloat();

            System.out.printf("Salario-hora do func.%d:", x);
            salarioHora = input.nextFloat();


            if (horasPassadas > 40) {
                horaExtra = horasPassadas - 40;
                adicionais=horaExtra * (salarioHora * 1.50f);
                salarioBruto=40*salarioHora;
                salarioBruto+=adicionais;
            }else {
                salarioBruto=horasPassadas*salarioHora;
            }

            System.out.printf("\nHoras Extras func.%d:%.2f\n",x,horaExtra);
            System.out.printf("Adicionais:%.2f\n",horaExtra * (salarioHora * 1.50f));
            System.out.printf("Salario Bruto func.%d:%.2fR$\n",x,salarioBruto);
        }
    }
}
