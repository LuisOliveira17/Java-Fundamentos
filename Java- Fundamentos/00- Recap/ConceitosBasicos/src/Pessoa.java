import java.time.LocalDate;
import java.time.Year;
import java.util.Date;

public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;
    private LocalDate dataNascimento;

    public Pessoa(){

    }

    public Pessoa(String nome, int idade, char sexo, LocalDate dataNascimento) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void provarExistencia(){
        System.out.println(getNome());
        System.out.println(getIdade());
        System.out.println(getSexo());
        System.out.println(getDataNascimento());
    }
}
