package escola;

public class Aluno {
    private String nome;
    private int idade;
    private String sexo;

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    // JAVA BEANS
    public void setNome(String newNome) {
        this.nome = newNome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int newIdade) {
        this.idade = newIdade;
    }

    public int getIdade() {
        return idade;
    }
}
