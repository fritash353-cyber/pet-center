package classes;

import java.time.LocalDate;


/**
 * Representa um Tratamento prescrito durante uma consulta veterinária.
 */
public class Tratamento {

    private int id;
    private LocalDate dataInicial;
    private String descricao;

    /**
     * Cria um novo tratamento com os dados informados.
     * @param id Identificador do tratamento.
     * @param dataInicial Data de início do tratamento, não pode ser nula.
     * @param descricao Descrição do tratamento, não pode ser nula ou conter apenas espaços.
     * @throws IllegalArgumentException Caso a data ou a descrição sejam inválidas.
     */
    public Tratamento(int id, LocalDate dataInicial, String descricao){
        if (dataInicial == null) {
    throw new IllegalArgumentException("Data inválida.");
        }
        if (descricao == null || descricao.isBlank()) {
    throw new IllegalArgumentException("Descrição inválida.");
        }
        
        this.id = id;
        this.dataInicial = dataInicial;
        this.descricao = descricao;
    }

    // GETTERS: //
    public int getId(){
        return id;
    }
    public LocalDate getDataInicial(){
        return dataInicial;
    }
    public String getDescricao(){
        return descricao;
    }

    // SETTERS: //

    /**
     * Define a descrição do tratamento.
     * @param descricao Nova descrição, não pode ser nula ou conter apenas espaços.
     * @throws IllegalArgumentException Se a descrição for nula ou conter apenas espaços.
     */
    public void setDescricao(String descricao) {
    if (descricao == null || descricao.isBlank()) {
        throw new IllegalArgumentException("Descrição inválida.");
    }
    this.descricao = descricao;
    }
    
    /**
     * Exibe os dados do tratamento formatados.
     * @return String com a descrição e a data de início do tratamento.
     */
    public String visTratamento(){
        return "Tratamento: "
            + descricao
            + "\nData: "
            + dataInicial;
    }

    /**
     * Retorna os dados do tratamento em string.
     * @return String formatada contendo os dados do tratamento.
     */
    public String conTratamento(){
        return visTratamento();
    }

    /**
     * Registra o tratamento no sistema.
     */
    public void regTratamento(){
        System.out.println("Tratamento registrado.");
    }
}
