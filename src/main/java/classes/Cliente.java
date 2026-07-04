package classes;

import java.util.List;
import interfaces.Cadastravel;
import java.util.ArrayList;

/**
 * Representa um Cliente no sistema.
 * Implementa a interface Cadastravel.
 */
public class Cliente extends Pessoa implements Cadastravel{
    
    private String cpf;
    private String cep;

    private List<Animal> animais;

     /**
     * Cria um novo cliente com os dados informados.
     * @param id Identificador do cliente.
     * @param nome Nome do cliente.
     * @param telefone Telefone de contato.
     * @param email E-mail do cliente.
     * @param endereco Endereço do cliente.
     * @param cpf CPF do cliente.
     * @param cep CEP do cliente.
     */
    public Cliente(int id, String nome, String telefone, String email,
                   String endereco, String cpf, String cep){
        super(id, nome, telefone, email, endereco);
        this.cpf = cpf;
        this.cep = cep;
        this.animais = new ArrayList<>();
    }

    // GETTERS: //

    public String getCpf() {
        return cpf;
    }
    public String getCep() {
        return cep;
    }
    public List<Animal> getAnimais() {
        return animais;
    }

    /**
     * @param cpf cpf não pode ser nulo ou preenchido só com espaços.
     * @throws IllegalArgumentException caso o cpf for nulo ou for preenchido só com espaços.
    */
    public void setCpf(String cpf) {
        if (cpf == null || cpf.isBlank()) {
    throw new IllegalArgumentException("CPF inválido.");
     }
     
     this.cpf = cpf;
    }

    /**
     * @param cep não pode ser nulo ou preenchido só com espaços.
     * @throws IllegalArgumentException caso o cep for nulo ou for preenchido só com espaços.
    */
    public void setCep(String cep) {
        if (cep == null || cep.isBlank()) {
    throw new IllegalArgumentException("CEP inválido.");
        }

      this.cep = cep;
    }

    /**
     * Registra o cliente no sistema.
     */
    public void regCliente(){
        System.out.println("Cliente cadastrado com sucesso!");
    }

    /**
     * Retorna os dados do cliente formatados.
     * @return String com id, nome, telefone, email, endereço, CPF e CEP.
     */
    public String conCliente(){
        return "ID: " + getId() +
               "\nNome: " + getNome() +
               "\nTelefone: " + getTelefone() +
               "\nEmail: " + getEmail() +
               "\nEndereço: " + getEndereco() +
               "\nCPF: " + cpf +
               "\nCEP: " + cep;
    }

    /**
     * Lista todos os animais vinculados ao cliente.
     * @return Lista de animais do cliente.
     */
    public List<Animal> listarAnimais() {
        return animais;
    }

    /**
    * Adiciona um animal à lista do cliente.
    *
    * @param animal Animal a ser adicionado.
    * @throws IllegalArgumentException Se o animal for nulo.
    */
    public void adicionarAnimal(Animal animal) {
        if (animal == null) {
    throw new IllegalArgumentException("Animal inválido.");
    }
     animais.add(animal);
    }

    /**
    * Remove um animal da lista do cliente.
    * @param animal Animal a ser removido.
    * @throws IllegalArgumentException Se o animal for nulo.
    */
    public void removerAnimal(Animal animal) {
        if (animal == null) {
        throw new IllegalArgumentException("tem que ter pelo menos 1 animal.");
        }

      animais.remove(animal);
    }
 
     /**
     * Cadastra o cliente no sistema.
     * @throws IllegalArgumentException Se o CPF for nulo ou vazio.
     */
    @Override
    public void cadastrar(){
         if(cpf == null || cpf.isBlank()){
        throw new IllegalArgumentException("CPF inválido.");
         }

         regCliente();
        
         System.out.println("Cliente cadastrado");

    }

    /**
     * Altera os dados do cliente no sistema.
     */
    @Override 
    public void  alterar(){
         System.out.println("Dados do cliente alterados.");
    }

    /**
     * Remove o cliente do sistema.
     * @throws exceptions.ClienteComAnimaisException Se o cliente possuir animais vinculados.
     */
    @Override
    public void excluir(){
        if (this.animais != null && !this.animais.isEmpty()) {
         throw new exceptions.ClienteComAnimaisException("Não é possível excluir cliente com animais vinculados.");
    }
         System.out.println("Cliente excluído.");
    }

    /**
    * Retorna os dados do cliente formatados.
    * @return String com id, nome, telefone, email, endereço, CPF e CEP.
    */
    @Override
    public Object consultar(int id){   
         if (getId() == id) {
            return this;
        }
        return null;
    }
}
