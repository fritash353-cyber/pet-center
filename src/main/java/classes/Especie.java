package classes;

public class Especie {
    private String nome_esp;

    public String getNome_esp(){
        return nome_esp;
    }

    public void setNome_esp(String nomeEsp){
         this.nome_esp = nomeEsp;
    }

    /**
     * Nome da espécie do animal não pode ser nulo nem conter apenas espaços.
     * @param nomeEsp Nome da especie.
     * @throws IllegalArgumentException caso seja nulo ou contenha apenas espaço.
     */
    public Especie(String nomeEsp){
        if (nomeEsp == null || nomeEsp.isBlank()) {
    throw new IllegalArgumentException("Espécie inválida.");
        }
        
        this.nome_esp = nomeEsp;
    }



}
