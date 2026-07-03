package classes;

import java.util.List;
import interfaces.Cadastravel;
import java.util.ArrayList;


public class Cliente extends Pessoa implements Cadastravel{
    
    private String cpf;
    private String cep;

    private List<Animal> animais;

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

    public void regCliente(){
        System.out.println("Cliente cadastrado com sucesso!");
    }

    public String conCliente(){
        return "ID: " + getId() +
               "\nNome: " + getNome() +
               "\nTelefone: " + getTelefone() +
               "\nEmail: " + getEmail() +
               "\nEndereço: " + getEndereco() +
               "\nCPF: " + cpf +
               "\nCEP: " + cep;
    }

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
 

    @Override
    public void cadastrar(){
         if(cpf == null || cpf.isBlank()){
        throw new IllegalArgumentException("CPF inválido.");
         }

         regCliente();
        
         System.out.println("Cliente cadastrado");

    }

    @Override 
    public void  alterar(){
         System.out.println("Dados do cliente alterados.");
    }

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
