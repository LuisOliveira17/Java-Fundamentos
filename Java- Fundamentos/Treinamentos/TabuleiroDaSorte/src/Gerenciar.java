import java.util.Scanner;

public class Gerenciar {
    public static void main(String[] args){
        Tabuleiro tabuleiro = new Tabuleiro();
        Scanner sc = new Scanner(System.in);
        int resp=0;

        do{
            System.out.println("TABULEIRO DA SORTE");
            System.out.println("---------------------");
            System.out.println("1.Jogar");
            System.out.println("2.Sair");
            System.out.println("---------------------");
            System.out.println("Escolha:");
            resp=Integer.parseInt(sc.nextLine());

            switch (resp){
                case 1:{
                    tabuleiro.montarTabuleiro();
                    tabuleiro.recebeJogada();
                    break;
                }
                case 2: System.out.println("FIM");
                break;
            }
        }while(resp!=2);
    }
}
