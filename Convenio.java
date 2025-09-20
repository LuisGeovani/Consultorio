import java.io.Console;

public class Convenio {
    // Atributos
    private Long id;
    private String nome;
    private String razaoSocial;
    private String cnpj;
    private String representante;
    private String email;
    private String telefone;
    private boolean ativo;

    // Métodos acessores
    public Long getId() {
        return this.id;
    } 
    public String getNome() {
        return this.nome;
    } 
    public String getRazaoSocial() {
        return this.razaoSocial;
    } 
    public String getCnpj() {
        return this.cnpj;
    } 
    public String getRepresentante() {
        return this.representante;
    } 
    public String getEmail() {
        return this.email;
    } 
    public String getTelefone() {
        return this.telefone;
    } 
    public boolean isAtivo() {
        return this.ativo;
    }

    // Métodos modificadores
    public void setId(long id) {
        this.id = id;
    } 
    public void setNome(String nome) {
        this.nome = nome;
    } 
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    } 
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    } 
    public void setRepresentante(String representante) {
        this.representante = representante;
    } 
    public void setEmail(String email) {
        this.email = email;
    } 
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    } 
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    // Métodos da classe 
    public void toggleAtivo() {
        this.setAtivo(!this.isAtivo());
    }
    public void info() {
        String info = "" +
        "Id:"            + this.getId()            + "\n" +
        "Nome:"          + this.getNome()          + "\n" +
        "Razão Social:"  + this.getRazaoSocial()   + "\n" +
        "CNPJ:"          + this.getCnpj()          + "\n" +
        "Representante:" + this.getRepresentante() + "\n" +
        "Email:"         + this.getEmail()         + "\n" +
        "Telefone:"      + this.getTelefone()      + "\n" +
        "Ativo:"         + isAtivo()               + "\n";

        System.out.println(info);
    }
}