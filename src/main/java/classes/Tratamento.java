package classes;

import java.time.LocalDate;

public class Tratamento {

    private int id;
    private LocalDate dataInicial;
    private String descricao;

    /**
     * @param dataInicial data inicial.
     * @throw IllegalArgumentException caso a data do construtor for nula.
     * @param descricao descrição.
     * @throw IllegalArgumentException caso a descrição do construtor for nula.
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
    public void setDescricao(String descricao) {
    if (descricao == null || descricao.isBlank()) {
        throw new IllegalArgumentException("Descrição inválida.");
    }
    this.descricao = descricao;
    }
    

    public String visTratamento(){
        return "Tratamento: "
            + descricao
            + "\nData: "
            + dataInicial;
    }

    public String conTratamento(){
        return visTratamento();
    }

    public void regTratamento(){
        System.out.println("Tratamento registrado.");
    }
}
