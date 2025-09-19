import java.util.Date;

public class Paciente{
    public long id;
    public String nome;
    public String email;
    public String telefone;
    public Date dataNascimento;
    public String grupoSanguineo;
    public String sexo;
    public String cep;
    public String endereco;
    public String cidade;
    public String estado;

    public void setId(long id){
        this.id = id;
    }
    public long getId(){
        return id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
}