public class Unidade {
    // Atributos
    private long id;
    private String nome;
    private String endereco;

    // Métodos acessores
    public long getId() {
        return this.id;
    }
    public String getNome() {
        return this.nome;
    }
    public String getEndereco() {
        return this.endereco;
    }

    // Métodos modificadores
    public void setId(long id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}