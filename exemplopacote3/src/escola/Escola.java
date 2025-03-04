package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        felipe.setNome("Felipe Jr");
        felipe.setIdade(15);
        felipe.setSexo("M");

        System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos.");

        Aluno hender = new Aluno();
        hender.setNome("Hender Berigo");
        hender.setIdade(49);
        hender.setSexo("M");
        System.out.println("O aluno " + hender.getNome() + " tem " + hender.getIdade() + " anos.");

    }
}
