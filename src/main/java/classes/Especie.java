package classes;

/**
 * Representa a espécie de um animal.
 */
public class Especie {
    private String nome_esp;

    /**
     * Cria uma nova espécie com o nome informado.
     * @param nomeEsp Nome da espécie, não pode ser nulo nem conter apenas espaços.
     * @throws IllegalArgumentException Caso o nome seja nulo ou contenha apenas espaços.
     */
    public Especie(String nomeEsp){
        if (nomeEsp == null || nomeEsp.isBlank()) {
            throw new IllegalArgumentException("Espécie inválida.");
        }
        this.nome_esp = nomeEsp;
    }

    public String getNome_esp(){
        return nome_esp;
    }

    /**
     * Define o nome da espécie.
     * @param nomeEsp Novo nome da espécie.
     */
    public void setNome_esp(String nomeEsp){
        this.nome_esp = nomeEsp;
    }
}