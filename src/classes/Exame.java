package classes;

public class Exame{
    private int id;
    private String descricao;
    private String resultado;

    public Exame(int id, String descricao, String resultado){
        if (descricao == null || descricao.isBlank()) {
       throw new IllegalArgumentException("Descrição inválida.");
    }
        this.id = id;
        this.descricao = descricao;
        this.resultado = resultado;
    }
     public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getResultado() {
        return resultado;
    }

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