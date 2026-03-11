public class Product {
    public static void main(String[] args){
        int produto=1;
        for(int i=1;i<=15;i++){
            if(i%2!=0){
                System.out.println(i);
                produto*=i;
            }
        }
        System.out.println("Produto:"+produto);
    }
}
