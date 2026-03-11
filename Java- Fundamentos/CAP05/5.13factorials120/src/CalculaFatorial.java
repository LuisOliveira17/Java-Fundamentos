public class CalculaFatorial {
    public static void main(String[] args){
        for(int i=1;i<=20;i++){
            double resultado=1;
            double multiplicador=i;

            while(multiplicador>=1){
                resultado*=multiplicador;
                multiplicador--;
            }
            System.out.println(i+"n"+"="+resultado);
        }
    }
}
