import java.util.Scanner;

public class Paciente{
    private long id;
    private String nome;
    private String email;
    private String telefone;
    private String dataNascimento;
    private String grupoSanguineo;
    private String sexo;
    private String cep;
    private String endereco;
    private String cidade;
    private String estado;

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

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String getTelefone(){
        return telefone;
    }

    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    public String getDataNascimento(){
        return dataNascimento;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }
    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public static Paciente AdicionarPaciente() {
        Paciente paciente = new Paciente();
        Scanner scanner = new Scanner(System.in);
        System.out.println("-- Criando um novo paciente --");

        System.out.println("Digite o Id do paciente:");
        paciente.setId(scanner.nextLong());

        scanner.nextLine();

        System.out.println("Digite o Nome do paciente:");
        paciente.setNome(scanner.nextLine());

        System.out.println("Digite o Email do paciente:");
        paciente.setEmail(scanner.nextLine());

        System.out.println("Digite o Telefone do paciente:");
        paciente.setTelefone(scanner.nextLine());

        System.out.println("Digite a Data de Nascimento do paciente:");
        paciente.setDataNascimento(scanner.nextLine());

        System.out.println("Digite o Grupo Sanguíneo do paciente:");
        paciente.setGrupoSanguineo(scanner.nextLine());

        System.out.println("Digite o Sexo do paciente:");
        paciente.setSexo(scanner.nextLine());

        System.out.println("Digite o CEP do paciente:");
        paciente.setCep(scanner.nextLine());

        System.out.println("Digite o Endereço do paciente:");
        paciente.setEndereco(scanner.nextLine());

        System.out.println("Digite a Cidade do paciente:");
        paciente.setCidade(scanner.nextLine());

        System.out.println("Digite o Estado do paciente:");
        paciente.setEstado(scanner.nextLine());

        return paciente;
    }

    @Override
    public String toString(){
        return
                "ID: " + id + "\n" +
                "Nome: " + nome + "\n" +
                "Email: " + email + "\n" +
                "Telefone: " + telefone + "\n" +
                "Data de Nascimento: " + dataNascimento + "\n" +
                "Grupo Sanguíneo: " + grupoSanguineo + "\n" +
                "Sexo: " + sexo + "\n" +
                "CEP: " + cep + "\n" +
                "Endereço: " + endereco + "\n" +
                "Cidade: " + cidade + "\n" +
                "Estado: " + estado + "\n";
    }

    public static void main(String[] args) {
        Paciente novoPaciente = AdicionarPaciente();
        System.out.println("Paciente " + novoPaciente.getNome() + " adicionado");
        System.out.println("\n" + novoPaciente);
    }

}