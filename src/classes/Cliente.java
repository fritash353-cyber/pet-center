package classes;

import interfaces.Cadastravel;

public class Cliente extends Pessoa implements Cadastravel{
    
    private String cpf;
    private String cep;

    public Cliente(int id, String nome, String telefone, String email, String endereco, String cpfm String cep){
        super(id, nome, telefone, email, endereco);
        this.cpf = cpf;
        this.cep = cep;
    }

    public void regCliente(){

    }

    public String conCliente(){
        return null;
    }

    public List<Animal> listarAnimais(){

        return null;
    }

    @Override
    public void cadastrar(){

    }

    @Override
    public void excluir(){

    }

    @Override
    public Object consultar(int id){


        return null;
    }



}
