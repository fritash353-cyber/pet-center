package classes;
import java.time.LocalDate;

public class Funcionario extends Pessoa{
    private LocalDate dataAdmissao;
    private double salario;

    public Funcionario(int id, String nome, String telefone, String email, String endereco, LocalDate dataAdmissao, double salario){
        super(id, nome, telefone, email, endereco);
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    public double calcularSalario(){
        
        return salario;
    }
}
