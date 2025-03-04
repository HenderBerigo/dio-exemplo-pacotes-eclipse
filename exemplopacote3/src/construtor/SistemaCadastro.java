package construtor;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("Marcos", "123456789");

        marcos.setEndereco("Rua João Crudo, 25");

        System.out.println(marcos.getNome() + " - " + marcos.getCpf());
    }
}
