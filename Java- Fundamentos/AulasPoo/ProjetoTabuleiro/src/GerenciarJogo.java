import model.Tabuleiro;

import java.util.Scanner;

public class GerenciarJogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Tabuleiro tabu = new Tabuleiro();

        System.out.println("Digite o palpite 1:");
        int p1 = Integer.parseInt(sc.nextLine());

        System.out.println("Digite o palpite 2:");
        int p2 = Integer.parseInt(sc.nextLine());

        double premio = tabu.jogar(p1,p2);



    }
}
