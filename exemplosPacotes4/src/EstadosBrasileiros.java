public enum EstadosBrasileiros {
    SAO_PAULO("SP", "São Paulo"),
    RIO_JANEIRO("RJ", "Rio DE Janeiro"),
    MINAS_GERAIS("MG", "Minas Gerais"),
    PIAUI("PI", "Piauí");

    private String nome;
    private String sigla;

    private EstadosBrasileiros(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }

}
