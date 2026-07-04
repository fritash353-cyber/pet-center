package classes;

import java.time.LocalDate;
import interfaces.Autenticavel;

/**
 * Representa um Funcionário.
 * Herda de Pessoa e implementa a interface Autenticavel.
 */
public class Funcionario extends Pessoa implements Autenticavel{

    private LocalDate dataAdmissao;
    private double salario;

    /**
     * Cria um novo funcionário com os dados informados.
     * @param id Identificador do funcionário.
     * @param nome Nome do funcionário.
     * @param telefone Telefone de contato.
     * @param email E-mail do funcionário.
     * @param endereco Endereço do funcionário.
     * @param dataAdmissao Data de admissão na empresa.
     * @param salario Salário do funcionário.
     * @throws IllegalArgumentException Caso o salário seja negativo.
     */

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

     /**
     * Define a data de admissão do funcionário.
     * @param dataAdmissao Nova data de admissão.
     */
    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    /**
    * Define o salário do funcionário.
    * @param salario Novo salário.
    * @throws IllegalArgumentException Caso o salário seja negativo.
    */
    public void setSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException("O salário não pode ser negativo.");
        }
        this.salario = salario;
    }


    /**
     * Calcula e retorna o salário do funcionário.
     * @return Salário do funcionário.
     */
    public double calcularSalario(){
        return salario;
    }
    
    /**
    * Realiza o login do funcionário.
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

    /**
     * Encerra a sessão do funcionário no sistema.
     */
    @Override
    public void logout(){
          System.out.println("Logout realizado com sucesso.");
    }

}
