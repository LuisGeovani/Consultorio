import java.util.ArrayList;
import java.util.List;

public class SistemaAgendamento {

    // Simula o "banco de dados" de objetos criados
    private List<Paciente> pacientes;
    private List<Profissional> profissionais;
    private List<Unidade> unidades;
    private List<Convenio> convenios;

    public SistemaAgendamento() {
        this.pacientes = new ArrayList<>();
        this.profissionais = new ArrayList<>();
        this.unidades = new ArrayList<>();
        this.convenios = new ArrayList<>();
    }

    // Método principal para iniciar a aplicação
    public static void main(String[] args) {
        SistemaAgendamento sistema = new SistemaAgendamento();
        sistema.executarSistema();
    }

    public void executarSistema() {
        // 1. Cadastrar dados iniciais
        cadastrarDadosIniciais();

        // 2. Simular um fluxo de agendamento
        // Encontrar um paciente (simulação)
        Paciente paciente = pacientes.get(0);
        
        // Encontrar um profissional para o agendamento
        // (por exemplo, buscando por especialidade)
        Especialidade especialidadeDesejada = new Especialidade("Cardiologia");
        Profissional profissionalDisponivel = buscarProfissionalPorEspecialidade(especialidadeDesejada);
        
        // Encontrar uma unidade onde o profissional atende
        Unidade unidadeDisponivel = buscarUnidadePorProfissional(profissionalDisponivel);

        if (paciente != null && profissionalDisponivel != null && unidadeDisponivel != null) {
            // 3. Criar um atendimento
            Atendimento novoAtendimento = new Atendimento();
            novoAtendimento.setPaciente(paciente);
            novoAtendimento.setProfissional(profissionalDisponivel);
            novoAtendimento.setUnidade(unidadeDisponivel);
            novoAtendimento.setEspecialidade(especialidadeDesejada);
            
            // Aqui, a lógica de agendamento pode ser mais complexa
            // (por exemplo, verificar a disponibilidade do profissional)
            
            System.out.println("Agendamento criado com sucesso!");
            System.out.println("Paciente: " + novoAtendimento.getPaciente().getNome());
            System.out.println("Profissional: " + novoAtendimento.getProfissional().getNome());
            System.out.println("Unidade: " + novoAtendimento.getUnidade().getIdentificacao());

            // 4. Exibir informações do usuário (cliente)
            // Lógica para encontrar o usuário associado ao paciente
            Usuarios usuario = buscarUsuarioPorPaciente(paciente);
            if (usuario != null) {
                System.out.println("Usuário associado ao paciente: " + usuario.getNome());
            }

        } else {
            System.out.println("Não foi possível realizar o agendamento. Verifique os dados.");
        }
    }

    // --- Rotinas Auxiliares ---

    private void cadastrarDadosIniciais() {
        // Exemplo de criação de objetos para a simulação
        Unidade u1 = new Unidade("Unidade Centro");
        Profissional p1 = new Profissional("Dr. João", "Cardiologia");
        Paciente pac1 = new Paciente("Maria Silva", "123.456.789-00");
        
        this.unidades.add(u1);
        this.profissionais.add(p1);
        this.pacientes.add(pac1);
    }
    
    private Profissional buscarProfissionalPorEspecialidade(Especialidade especialidade) {
        // Lógica de busca. Aqui, é apenas um exemplo
        return profissionais.get(0); 
    }
    
    private Unidade buscarUnidadePorProfissional(Profissional profissional) {
        // Lógica de busca. 
        return unidades.get(0);
    }

    private Usuarios buscarUsuarioPorPaciente(Paciente paciente) {
        // Simulação de busca
        return new Usuarios("Maria Silva", "Convenio XYZ");
    }
}