package model;

import java.util.Random;

public class Tabuleiro {
    private int[][] matriz = new int[10][10];
    private int[] palpite = new int[2];

    public Tabuleiro(){
        Random aleatorio = new Random();

        for(int i=0;i<10;i++){
            for(int j=0; j<10;j++){
                matriz[i][j]=aleatorio.nextInt(1,101);
            }
        }
    }

    public double jogar(int palpite1, int palpite2){
        this.palpite[0]=palpite1;
        this.palpite[1]=palpite2;
        int acertos= verificarAcertos();

        double premio=0.0;
        if(acertos>=3){
            premio=acertos*1000;
        }
        return premio;
    }

    private int verificarAcertos() {
        int contador=0;
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(palpite[0]==matriz[i][j]||palpite[1]==matriz[i][j]);
                contador++;

                if(palpite[0]==matriz[i][j]||palpite[1]==matriz[i][j]){
                    System.out.printf("[%3d*] ",matriz[i][j]);
                }else{
                    System.out.printf("[%3d] ",matriz[i][j]);
                }
            }
        }
        return contador;
    }


}
