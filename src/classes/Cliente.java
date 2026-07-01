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

     public String getCpf() {
        return cpf;
    }

    public String getCep() {
        return cep;
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    public void setCpf(String cpf) {
        if (cpf == null || cpf.isBlank()) {
    throw new IllegalArgumentException("CPF inválido.");
     }
     
     this.cpf = cpf;
    }

    public void setCep(String cep) {
        if (cpf == null || cpf.isBlank()) {
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

    public void adicionarAnimal(Animal animal) {
        if (animal == null) {
    throw new IllegalArgumentException("Animal inválido.");
    }
     animais.add(animal);
    }

    public void removerAnimal(Animal animal) {
        if (animal == null) {
        throw new IllegalArgumentException("Animal inválido.");
        }

      animais.remove(animal);
    }
 

    @Override
    public void cadastrar(){
        // Testando tratamento de exceção: //
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
         System.out.println("Cliente excluído.");
    }

    @Override
    public Object consultar(int id){
        
         if (getId() == id) {
            return this;
        }

        return null;
    }

    

}
