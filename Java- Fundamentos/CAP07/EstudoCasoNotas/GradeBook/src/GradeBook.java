public class GradeBook {
    private String nomeCurso;
    private int[] notas;

    public GradeBook(String nomeCurso, int[] notas) {
        this.nomeCurso = nomeCurso;
        this.notas = notas;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int[] getNotas() {
        return notas;
    }
    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public double calcularMedia(){
        double total = 0;
        double media = 0;
        for(int nota:notas){
           total+=nota;
        }
        media = total/notas.length;
        return media;
    }

    public void mostrarNotas(){
        for(int i=0;i<notas.length;i++){
            System.out.printf("\nAluno %d:%d\n",i+1,notas[i]);
        }
        System.out.printf("\nMedia:%.2f",calcularMedia());
        System.out.println();
    }

    public void exibirMensagem(){
        System.out.printf("Seja bem vindo ao Curso %s\n\n",getNomeCurso());
    }
}
