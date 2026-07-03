package classes;

public class Exame{
    private int id;
    private String descricao;
    private String resultado;

    /**
     * @param resultado novo resultado.
     * @throws IllegalArgumentException caso a descrição do construtor for nula ou somente com espaços.
     */
    public Exame(int id, String descricao, String resultado){
        if (descricao == null || descricao.isBlank()) {
       throw new IllegalArgumentException("Descrição inválida.");
    }
        this.id = id;
        this.descricao = descricao;
        this.resultado = resultado;
    }

    // GETTERS: //
     public int getId() {
        return id;
    }
    public String getDescricao() {
        return descricao;
    }
    public String getResultado() {
        return resultado;
    }

    // SETTERS: //
    /**
     * Caso a descrição modificada for nula ou com espaços.
     * @param descricao nova descrição.
     * @throws IllegalArgumentException se a descrição for nula ou conter apenas espaços.
     */
    public void setDescricao(String descricao) {
        if (descricao == null || descricao.isBlank()) {
      throw new IllegalArgumentException("Descrição inválida.");
    }
        this.descricao = descricao;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }


}