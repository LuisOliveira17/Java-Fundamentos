import java.util.Random;
import java.util.Scanner;

public class Tabuleiro {
    int[][] tabuleiro = new int[10][10];
    int[] jogadas = new int[2];
    Random random = new Random();

    int acertos=0;
    int premio=0;

    public void montarTabuleiro(){
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
              int numero = 1+random.nextInt(100);
              tabuleiro[i][j]=numero;
            }
        }
    }

    public int verificarPontos(){
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(jogadas[0]==tabuleiro[i][j]||jogadas[1]==tabuleiro[i][j]){
                    acertos++;
                }else{
                    continue;
                }
            }
        }
        if(acertos<3){
            System.out.println("NAO FOI DESTA VEZ =(");
        }else if(acertos>=3){
            System.out.println("\nFELIZ GANHADOR!!!");
            premio+=1000*acertos;
        }

        return acertos;
    }

    public void imprimeAcertos(){
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(jogadas[0]==tabuleiro[i][j]||jogadas[1]==tabuleiro[i][j]){
                    System.out.printf("[%3d]* ",tabuleiro[i][j]);
                }else{
                    System.out.printf("[%3d] ",tabuleiro[i][j]);
                }

            }
            System.out.println("");
        }
    }
    public void recebeJogada(){
        Scanner sc = new Scanner(System.in);
        int palpite=0;
        System.out.println("Digite num 1:");
        palpite=Integer.parseInt(sc.nextLine());
        jogadas[0]=palpite;

        System.out.println("Digite num 2:");
        palpite=Integer.parseInt(sc.nextLine());
        jogadas[1]=palpite;
        int acertos=verificarPontos();
        System.out.println("Acertos:"+acertos);
        System.out.println("Premio:"+premio+"\n");
        imprimeAcertos();
        System.out.println("");
    }


}
