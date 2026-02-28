import java.util.Scanner;

public class DoisMaiores {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int cont=1,maior1=0,maior2=0,resp=0,temporaria=0;

        System.out.println("Digite o "+cont+"th numero:");
        resp= input.nextInt();
        maior1=resp;

        System.out.println("maior1 = " + maior1);
        System.out.println("maior2 = " + maior2);;

        for(cont=2;cont<=10;cont++){
            System.out.println("Digite o "+cont+"th numero:");
            resp= input.nextInt();

            if(resp>maior1){
                maior2=maior1;
                maior1=resp;
            }
            else if(resp>maior2){
                maior2=resp;
            }
            System.out.println("maior1= " + maior1);
            System.out.println("maior2= " + maior2);
        }
    }
}
