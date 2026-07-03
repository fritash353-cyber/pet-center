package classes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Veterinario extends Funcionario {
    private String crm;
    private String especialidade;
    private List<Consulta> consultas;

    public Veterinario(int id, String nome, String telefone, String email, String endereco,
         LocalDate dataAdmissao, double salario, String crm, String especialidade){
        super(id, nome, telefone, email, endereco, dataAdmissao, salario);

        if (crm == null || crm.isBlank()) {
            throw new IllegalArgumentException("CRM inválido.");
        }
        if (especialidade == null || especialidade.isBlank()) {
        throw new IllegalArgumentException("Especialidade inválida.");
        }

        this.crm = crm;
        this.especialidade = especialidade;
        this.consultas = new ArrayList<>();
    }


    public String getCrm() {
        return crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        if (especialidade == null || especialidade.isBlank()) {
    throw new IllegalArgumentException("Especialidade inválida.");
    }

    this.especialidade = especialidade;
    }

    public List<Consulta> getConsultas() {
    return consultas;
    }
     
    /**
     * Veterinário realiza 1 ou mais consultas */
    public void adicionarConsulta(Consulta consulta) {

    if (consulta == null) {
        throw new IllegalArgumentException("Consulta inválida.");
    }
    consulta.setVeterinario(this);
    consultas.add(consulta);
}

    public void setCrm(String crm) {

        if (crm == null || crm.isBlank()) {
            throw new IllegalArgumentException("CRM inválido.");
        }

        this.crm = crm;
    }

    /**
     * Simula o atendimento realizado pelo veterinário.
     *
     * @return Mensagem informando que o atendimento foi realizado.
     */
    public String atender(){
        return "O veterinário " + getNome()
                + " realizou o atendimento.";
    }

    /**
     * Emite um relatório do veterinário.
     *
     * @return Dados do veterinário.
     */
    public String emitirRelatorio(){
        return "Relatório do veterinário: " + getNome()
                + "\nCRM: " + crm
                + "\nEspecialidade: " + especialidade
                + "\nSalário: R$ " + calcularSalario();
    }


}
