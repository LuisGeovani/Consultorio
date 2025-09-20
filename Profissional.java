import java.util.Date;

// Aula criar Classe
// Curso Webacademy - Prof. Rodrigo - Aluno Lucir Vaz

// Criando classe //
public class Profissional {
    public long id;
    public String nome;
    public String registroConselho;
    public String telefone;
    public String email;
    
    public long getId (){
        return this.id;
    }
    public void setId (long id){
        if (id == 0 || id < 0){
            this.id = 0;
        } else {
            this.id = id;
        }
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        nome = nome.replaceAll("[^a-zA-Z ]", "");
        this.nome = nome;
    }
    public String getRegistroConselho() {
        return registroConselho;
    }
    public void setRegistroConselho(String registroConselho) {
        registroConselho = registroConselho.replaceAll("[^a-zA-Z0-9]", "");
        this.registroConselho = registroConselho;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        telefone = telefone.replaceAll("[^0-9]", "");
        if (telefone.length() == 10) {
            telefone = telefone.replaceFirst("(\\d{2})(\\d{4})(\\d{4})", "($1) $2-$3");
        } else if (telefone.length() == 11) {
            telefone = telefone.replaceFirst("(\\d{2})(\\d{5})(\\d{4})", "($1) $2-$3");
        }
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        email = email.replaceAll("[^a-zA-Z0-9@.]", "");
        this.email = email;
    }

}