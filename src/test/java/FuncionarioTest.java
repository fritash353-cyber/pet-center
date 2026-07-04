import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import classes.*;
import java.time.LocalDate;

public class FuncionarioTest {

    @Test
    public void deveRetornarFalseQuandoEmailForNulo() {
        Funcionario funcionario = new Funcionario(
            1, null, "88999999999",
            null, "Rua A",
            LocalDate.now(), 5000
        );
        boolean resultado = funcionario.login();
        assertFalse(resultado);
    }

    @Test
    public void deveRetornarFalseQuandoEmailForVazio() {
        Funcionario funcionario = new Funcionario(
            1, "Carlos", "88999999999",
            "   ", "Rua A",
            LocalDate.now(), 5000
        );

        boolean resultado = funcionario.login();

        assertFalse(resultado);
    }
}
