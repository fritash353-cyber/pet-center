package classes;

/**
 * Classe abstrata que representa uma Pessoa no sistema.
 * Serve como base para Cliente, Funcionario e Veterinario.
 */
public abstract class Pessoa {
    private int id;
    private String nome;
    private String telefone;
    private String email;
    private String endereco;

    
    /**
     * Cria uma nova pessoa com os dados informados.
     * @param id Identificador da pessoa.
     * @param nome Nome da pessoa.
     * @param telefone Telefone de contato.
     * @param email E-mail da pessoa.
     * @param endereco Endereço da pessoa.
     */
    public Pessoa(int id, String nome, String telefone, String email, String endereco){
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public int getId(){
        return id;
    }
    
    public String getNome(){
        return nome;
    }

    public String getTelefone(){
        return telefone;
    }

    public String getEmail(){
        return email;
    }

    public String getEndereco(){
        return endereco;
    }
}

