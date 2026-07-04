package classes;

/**
 * Representa um Exame realizado durante uma consulta veterinária.
 */
public class Exame{
    private int id;
    private String descricao;
    private String resultado;

    /**
     * Cria um novo exame com os dados informados.
     * @param id Identificador do exame.
     * @param descricao Descrição do exame, não pode ser nula ou conter apenas espaços.
     * @param resultado Resultado obtido no exame.
     * @throws IllegalArgumentException Caso a descrição for nula ou conter apenas espaços.
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
     * Define a descrição do exame.
     * @param descricao nova descrição.
     * @throws IllegalArgumentException se a descrição for nula ou conter apenas espaços.
     */
    public void setDescricao(String descricao) {
        if (descricao == null || descricao.isBlank()) {
      throw new IllegalArgumentException("Descrição inválida.");
    }
        this.descricao = descricao;
    }

    /**
     * Define o resultado do exame.
     * @param resultado Novo resultado do exame.
     */
    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}