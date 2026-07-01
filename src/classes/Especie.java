package classes;

public class Especie {
    private String nome_esp;

    public Especie(String nomeEsp){
        if (nomeEsp == null || nomeEsp.isBlank()) {
    throw new IllegalArgumentException("Espécie inválida.");
        }
        
        this.nome_esp = nomeEsp;
    }

    public String getNome_esp(){
        return nome_esp;
    }

    public void setNome_esp(String nomeEsp) {

    this.nome_esp = nomeEsp;

    }
}
