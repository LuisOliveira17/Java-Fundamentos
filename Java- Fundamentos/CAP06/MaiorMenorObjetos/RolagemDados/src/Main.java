import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random random = new Random();
        int face;
        int freq1=0,freq2=0,freq3=0,freq4=0,freq5=0,freq6=0;

        //Simulação de uma rolagem de 6,000,000 de vezes

        for(int i=0; i<=6000000;i++){
            face= 1+random.nextInt(6);
            switch (face){
                case 1->freq1++;
                case 2->freq2++;
                case 3->freq3++;
                case 4->freq4++;
                case 5->freq5++;
                case 6->freq6++;
            };

        }
        System.out.println("freq1 = " + freq1);
        System.out.println("freq2 = " + freq2);
        System.out.println("freq3 = " + freq3);
        System.out.println("freq4 = " + freq4);
        System.out.println("freq5 = " + freq5);
        System.out.println("freq6 = " + freq6);
    }
}
