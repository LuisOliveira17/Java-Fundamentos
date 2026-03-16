public class Maior {
    public void defineMaior(float n1, float n2, float n3){
        float maior=0;
        float medio,menor;
        maior=n1;

        if(n2>maior){
            medio=maior;
            maior=n2;
        }else{
            medio=n2;
        }

        if(n3>maior){
            menor=medio;
            medio=maior;
            maior=n3;
        }

        else if(n3>medio){
            menor=medio;
            medio=n3;
        }else{
            menor=n3;
        }

        System.out.printf("%.2f %.2f %.2f ",maior,medio,menor);
    }

}
