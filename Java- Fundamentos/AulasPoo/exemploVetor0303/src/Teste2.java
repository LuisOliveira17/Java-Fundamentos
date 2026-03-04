import java.util.Arrays;

public class Teste2 {
    public static void main(String[] args) {
        int[] vetor1={2,4,6,8,10,12,16,18,20}; // pos. 2 ate a 7 no vetor 1. Levar para o final do vetor 2
        int[] vetor2= new int[10];

        System.arraycopy(vetor1, 2, vetor2,4,6);
        for(int i=0;i< vetor1.length;i++){
            System.out.println(vetor2[i]);
        }
        int[] vetor3= {2312, 31, 7,8,1,4,7};
        Arrays.sort(vetor3);
        System.out.println("");
        for (int i=0;i<vetor3.length;i++){
            System.out.println(vetor3[i]);
        }
    }
}
