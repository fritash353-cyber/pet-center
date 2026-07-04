package classes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa um Veterinário no sistema.
 * Herda de Funcionario e possui CRM e especialidade.
 */
public class Veterinario extends Funcionario {
    private String crm;
    private String especialidade;
    private List<Consulta> consultas;

    /**
     * Cria um novo veterinário com os dados informados.
     * @param id Identificador do veterinário.
     * @param nome Nome do veterinário.
     * @param telefone Telefone de contato.
     * @param email E-mail do veterinário.
     * @param endereco Endereço do veterinário.
     * @param dataAdmissao Data de admissão na clínica.
     * @param salario Salário do veterinário.
     * @param crm CRM do veterinário, não pode ser nulo ou vazio.
     * @param especialidade Especialidade do veterinário, não pode ser nula ou vazia.
     * @throws IllegalArgumentException Caso o CRM ou a especialidade sejam inválidos.
     */
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

    // GETTERS //
    public String getCrm() {
        return crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    /**
     * Define a especialidade do veterinário.
     * @param especialidade Nova especialidade, não pode ser nula ou vazia.
     * @throws IllegalArgumentException Caso a especialidade seja nula ou vazia.
     */
    public void setEspecialidade(String especialidade) {
        if (especialidade == null || especialidade.isBlank()) {
        throw new IllegalArgumentException("Especialidade inválida.");
    }
        this.especialidade = especialidade;
    }

     
    /**
     * Adiciona uma consulta ao histórico do veterinário.
     * @param consulta Consulta a ser adicionada.
     * @throws IllegalArgumentException Se a consulta for nula.
     */
    public void adicionarConsulta(Consulta consulta) {
    if (consulta == null) {
        throw new IllegalArgumentException("Consulta inválida.");
    }
    consulta.setVeterinario(this);
    consultas.add(consulta);
    }

    /**
     * Define o CRM do veterinário.
     * @param crm Novo CRM, não pode ser nulo ou vazio.
     * @throws IllegalArgumentException Caso o CRM seja nulo ou vazio.
     */
    public void setCrm(String crm) {
        if (crm == null || crm.isBlank()) {
            throw new IllegalArgumentException("CRM inválido.");
        }
        this.crm = crm;
    }

    /**
     * Simula o atendimento realizado pelo veterinário.
     * @return Mensagem informando que o atendimento foi realizado.
     */
    public String atender(){
        return "O veterinário " + getNome()
                + " realizou o atendimento.";
    }

    /**
     * Emite um relatório do veterinário.
     * @return Dados do veterinário.
     */
    public String emitirRelatorio(){
        return "Relatório do veterinário: " + getNome()
                + "\nCRM: " + crm
                + "\nEspecialidade: " + especialidade
                + "\nSalário: R$ " + calcularSalario();
    }

}
