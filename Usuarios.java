import java.util.Scanner;

public class Usuarios {
    private Long id;
    private String nomeCompleto;
    private String nomeUsuario;
    private String senha;
    private Boolean ativo;
    private String papel;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
        
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public String getNomeUsuario() {
        return nomeUsuario;
    }
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public Boolean getAtivo() {
        return ativo;
    }
    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
    public String getPapel() {
        return papel;
    }
    public void setPapel(String papel) {
        this.papel = papel;
    }
    
    public static Usuarios cadastrar_usuario() {
        Usuarios cadastro = new Usuarios();
        Scanner  scam = new Scanner(System.in);
        System.out.println("Insira seu nome completo: ");
        cadastro.setNomeCompleto(scam.nextLine());
        System.out.println("Crie seu nome de usuário: ");
        cadastro.setNomeUsuario(scam.nextLine());
        System.out.println("Crie sua senha: ");
        cadastro.setSenha(scam.nextLine());
        return cadastro;
    }

    @Override
    public String toString(){
        return 
            "Nome Completo: " + nomeCompleto + "\n" +
            "Nome Usuario: " + nomeUsuario + "\n";
    }

    public static void main(String[] args) {
        Usuarios user = cadastrar_usuario();
        System.out.println(user);
    }
}


