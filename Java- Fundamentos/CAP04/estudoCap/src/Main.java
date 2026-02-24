//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int idade= 19;
        int n=0,cont=0;

        if(idade>=19){
            System.out.println("Bem Grandinho já!!");
        }else System.out.println("CRIANCA DETECTADA\n");

        while(n<=100){
            n+=3;
            cont++;
        }
        System.out.printf("Foram necessárias: %d multiplicacoes\n", cont);
        System.out.printf("N:%d",n);
    }
}