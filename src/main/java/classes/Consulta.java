package classes;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

/**
    * Representa uma Consulta veterinária no sistema.
    */
public class Consulta {
    private int id;
    private LocalDate dataConsulta;
    private String historico;

    private Veterinario veterinario;

    private List<Exame> exames;

    /**
     * Cria uma nova consulta com os dados informados.
     * @param id Identificador da consulta.
     * @param dataConsulta Data em que a consulta foi realizada.
     * @param historico Histórico clínico do atendimento.
     * @param veterinario Veterinário responsável pela consulta.
     * @throws exceptions.ConsultaSemVeterinarioException Se o veterinário for nulo.
     */
    public Consulta(int id, LocalDate dataConsulta, String historico, Veterinario veterinario){
        if (veterinario == null) {
        throw new exceptions.ConsultaSemVeterinarioException("Consulta sem veterinário válida.");
    }
        this.id = id;
        this.dataConsulta = dataConsulta;
        this.historico = historico;
        this.exames = new ArrayList<>();
        this.veterinario = veterinario;
    }

    // GETTERS: //

    public int getId() {
        return id;
    }
    public LocalDate getDataConsulta() {
        return dataConsulta;
    }
    public String getHistorico() {
        return historico;
    }
    public Veterinario getVeterinario() {
        return veterinario;
    }
    public List<Exame> getExames() {
        return exames;
    }

    // SETTERS: //
    
    /**
     * Define o veterinário responsável pela consulta.
     * @param veterinario Novo veterinário da consulta.
     */
    public void setVeterinario(Veterinario veterinario) {
    this.veterinario = veterinario;
    }
 
    /**
     * Atualiza o histórico da consulta.
     * @param historico Novo histórico da consulta.
     * @throws IllegalArgumentException Se o histórico for nulo ou vazio.
     */
    public void setHistorico(String historico) {
        if (historico == null || historico.isBlank()) {
    throw new IllegalArgumentException("Histórico inválido.");
     }
      this.historico = historico;
    }

    /**
     * Adiciona um exame a consulta.
     * @param descricao Descrição do exame.
     * @param resultado Resultado obtido no exame.
     * @throws IllegalArgumentException Se a descrição for nula ou vazia.
     */
    public void adicionarExame(String descricao, String resultado){  
        if (descricao == null || descricao.isBlank()) {
       throw new IllegalArgumentException("Descrição do exame inválida.");
       }
       Exame exame = new Exame(exames.size() + 1, descricao, resultado);
       exames.add(exame);
    }

    /**
     * Lista todos os exames da consulta.
     * @return String com a descrição e resultado de cada exame, ou mensagem caso não haja exames.
     */
    public String listCons(){
        if (exames.isEmpty()) {
            return "Nenhum exame cadastrado.";
        }
        StringBuilder lista = new StringBuilder();
        for (Exame exame : exames) {
            lista.append(exame.getDescricao())
                 .append(" - ")
                 .append(exame.getResultado())
                 .append("\n");
        }
        return lista.toString();
    }

    /**
     * Exibe os dados da consulta formatados.
     * @return String com número, veterinário, data e histórico da consulta.
     */
    public String verCons(){
        return "Consulta nº " + id
                + "\nVeterinário: " + veterinario.getNome()
                + "\nData: " + dataConsulta
                + "\nHistórico: " + historico;
    }
    
    /**
     * Registra a consulta no sistema.
     */
    public void regCons(){
        System.out.println("Consulta registrada.");
    }
}
