package classes;

import java.time.LocalDate;
import interfaces.Autenticavel;

public class Funcionario extends Pessoa implements Autenticavel{

    private LocalDate dataAdmissao;
    private double salario;

    public Funcionario(int id, String nome, String telefone, String email,
                  String endereco, LocalDate dataAdmissao, double salario){
        super(id, nome, telefone, email, endereco);
       
        if(salario < 0){
            throw new IllegalArgumentException("O salário não pode ser negativo.");
        }

        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    // GETTERS: //
    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }
    public double getSalario() {
        return salario;
    }

    // SETTERS: //
    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    /**
    * Define o salário do funcionário.
    *
    * @param salario Novo salário.
    * @throws IllegalArgumentException Caso o salário seja negativo.
    */
    public void setSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException("O salário não pode ser negativo.");
        }
        this.salario = salario;
    }


     
    public double calcularSalario(){
        
        return salario;
    }
    
    /**
    * Realiza o login do funcionário.
    *
    * @return true caso o login seja realizado com sucesso,
    *         false caso contrário.
    */
    @Override
    public boolean login(){
        try {

            if (getEmail() == null || getEmail().isBlank()) {
                throw new IllegalArgumentException("Email inválido.");
            }

            System.out.println("Funcionário " + getNome() + " autenticado com sucesso.");
            return true;

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());
            return false;

        }
    }

    @Override
    public void logout(){
          System.out.println("Logout realizado com sucesso.");
    }

}
