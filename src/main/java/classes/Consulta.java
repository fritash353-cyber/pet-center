package classes;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Consulta {
    private int id;
    private LocalDate dataConsulta;
    private String historico;

    private Veterinario veterinario;

    private List<Exame> exames;

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

    //Lista todos os exames da consulta.
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

    //Exibe os dados da consulta.
    public String verCons(){
        return "Consulta nº " + id
                + "\nVeterinário: " + veterinario.getNome()
                + "\nData: " + dataConsulta
                + "\nHistórico: " + historico;
    }
    // Registra uma consulta.
    public void regCons(){
        System.out.println("Consulta registrada.");
    }
}
