import java.util.Scanner;

public class RegrasEInterface {
    boolean jogador1=false;//Jogador 1 vai ser o X
    boolean jogador2=false;//Jogador 2 vai ser o O
    boolean houveGanhador=false;
    int rodada=0;

    //Tudo publico porque fiquei com preguica de gerar os getters e setters

    String[][] tabuleiro = new String[3][3];
    Scanner sc= new Scanner(System.in);

    public void geraInterface(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                tabuleiro[i][j] = "['']";
            }
            System.out.println();
        }

    }

    public void imprimirInterface(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(tabuleiro[i][j]);
            }
            System.out.println();

        }
    }

    public void verificaGanhador(){

        // Linhas
        if(tabuleiro[0][0].equals("[X]") && tabuleiro[0][1].equals("[X]") && tabuleiro[0][2].equals("[X]")) {
            System.out.println("X venceu!");
            houveGanhador=true;
        }
        if(tabuleiro[1][0].equals("[X]") && tabuleiro[1][1].equals("[X]") && tabuleiro[1][2].equals("[X]")) {
            System.out.println("X venceu!");
            houveGanhador=true;

        }
        if(tabuleiro[2][0].equals("[X]") && tabuleiro[2][1].equals("[X]") && tabuleiro[2][2].equals("[X]")) {
            System.out.println("X venceu!");
            houveGanhador=true;
        }

        // Colunas
        if(tabuleiro[0][0].equals("[X]") && tabuleiro[1][0].equals("[X]") && tabuleiro[2][0].equals("[X]")) {
            System.out.println("X venceu!");
            houveGanhador=true;
        }
        if(tabuleiro[0][1].equals("[X]") && tabuleiro[1][1].equals("[X]") && tabuleiro[2][1].equals("[X]")) {
            System.out.println("X venceu!");
            houveGanhador=true;
        }
        if(tabuleiro[0][2].equals("[X]") && tabuleiro[1][2].equals("[X]") && tabuleiro[2][2].equals("[X]")) {
            System.out.println("X venceu!");
            houveGanhador=true;
        }

        // Diagonais
        if(tabuleiro[0][0].equals("[X]") && tabuleiro[1][1].equals("[X]") && tabuleiro[2][2].equals("[X]")) {
            System.out.println("X venceu!");
            houveGanhador=true;
        }
        if(tabuleiro[0][2].equals("[X]") && tabuleiro[1][1].equals("[X]") && tabuleiro[2][0].equals("[X]")) {
            System.out.println("X venceu!");
            houveGanhador=true;
        }


        // MESMA LÓGICA PARA O
        if(tabuleiro[0][0].equals("[O]") && tabuleiro[0][1].equals("[O]") && tabuleiro[0][2].equals("[O]")) {
            System.out.println("O venceu!");
            houveGanhador=true;
        }
        if(tabuleiro[1][0].equals("[O]") && tabuleiro[1][1].equals("[O]") && tabuleiro[1][2].equals("[O]")) {
            System.out.println("O venceu!");
            houveGanhador=true;
        }
        if(tabuleiro[2][0].equals("[O]") && tabuleiro[2][1].equals("[O]") && tabuleiro[2][2].equals("[O]")) {
            System.out.println("O venceu!");
            houveGanhador=true;
        }

        if(tabuleiro[0][0].equals("[O]") && tabuleiro[1][0].equals("[O]") && tabuleiro[2][0].equals("[O]")) {
            System.out.println("O venceu!");
            houveGanhador=true;
        }
        if(tabuleiro[0][1].equals("[O]") && tabuleiro[1][1].equals("[O]") && tabuleiro[2][1].equals("[O]")) {
            System.out.println("O venceu!");
            houveGanhador=true;
        }
        if(tabuleiro[0][2].equals("[O]") && tabuleiro[1][2].equals("[O]") && tabuleiro[2][2].equals("[O]")) {
            System.out.println("O venceu!");
            houveGanhador=true;
        }

        if(tabuleiro[0][0].equals("[O]") && tabuleiro[1][1].equals("[O]") && tabuleiro[2][2].equals("[O]")) {
            System.out.println("O venceu!");
            houveGanhador=true;

        }
        if(tabuleiro[0][2].equals("[O]") && tabuleiro[1][1].equals("[O]") && tabuleiro[2][0].equals("[O]")) {
            System.out.println("O venceu!");
            houveGanhador=true;
        }
    }

    public void recebeJogadas(){
        while(rodada<9){
            if(rodada%2==0){
                jogador1=true; //Define a vez do jogador
                jogador2=false;

            }else{
                jogador1=false;
                jogador2=true;
            }
            System.out.println("-------------------------");
            System.out.println("Jogador 1: "+jogador1); //Apenas para ficar mais fácil vizulaizar de quem é a vez
            System.out.println("Jogador 2: "+jogador2);
            System.out.println("Rodada: "+rodada);
            System.out.println("-------------------------");
            System.out.println("Digite a linha:");
            int linha =Integer.parseInt(sc.nextLine());

            System.out.println("Digite a coluna:");
            int coluna = Integer.parseInt(sc.nextLine());

            if (jogador1) {
                tabuleiro[linha][coluna]="[X]";
                rodada++;
                imprimirInterface();
                verificaGanhador();

                if (houveGanhador) {
                    break;
                }
            }else if (jogador2) {
                tabuleiro[linha][coluna]="[O]";
                rodada++;
                imprimirInterface();
                verificaGanhador();

                if(houveGanhador){
                    break;
                }
            }else{
                imprimirInterface();
                System.out.println("EMPATE");
            }

        }
    }

}
