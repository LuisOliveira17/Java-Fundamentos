public class GerenciarGradeBook {
    public static void main(String[] args) {
        int[] notasAlunos={10, 5, 6, 7, 9, 9, 10, 6, 4, 2,2,10};
        GradeBook gradeBook = new GradeBook("POO",notasAlunos);

        gradeBook.exibirMensagem();
        gradeBook.mostrarNotas();
    }
}
