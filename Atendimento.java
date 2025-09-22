import java.util.Date;

// Criando classe //

public class Atendimento {
    private long id;
    private Date date;
    private Date hora;
    private Double valor;
    private String status;
    private String observacao;

    // -------------------------------------------------------------------------
    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    // ------------------------------------------------------------------------
    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    // -------------------------------------------------------------------------
    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Date getHora() {
        return hora;
    }

    // -------------------------------------------------------------------------
    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    // -------------------------------------------------------------------------
    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    // -------------------------------------------------------------------------
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getObservacao() {
        return observacao;
    }
    // CRIANDO MÉTODO PARA ATUALIZAR O STATUS-----------------------------------

    public void atualizarStatus(String novoStatus) {
        if (novoStatus != null && !novoStatus.isEmpty()) {
            this.status = novoStatus;
        }
    }

    // -----------------------------------------------------------------------------
    public static void main(String[] args) {
        // Criando uma instância de Atendimento
        Atendimento atendimento = new Atendimento();

        // Atualizando o status através do método da instância
        atendimento.atualizarStatus("Em andamento");

        // Exibindo o status atualizado
        System.out.println("Status: " + atendimento.getStatus());
    }
}
