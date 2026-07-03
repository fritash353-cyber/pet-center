

import classes.Funcionario;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioTest {

    @Test
    public void testCalcularSalario() {

        Funcionario funcionario =
                new Funcionario(
                        1,
                        "Carlos",
                        "88999999999",
                        "carlos@email.com",
                        "Rua A",
                        LocalDate.now(),
                        5000
                );

        assertEquals(
                5000,
                funcionario.calcularSalario()
        );
    }

    @Test
    public void testSalarioNegativo() {

        assertThrows(
                IllegalArgumentException.class,
                () -> new Funcionario(
                        1,
                        "Carlos",
                        "88999999999",
                        "carlos@email.com",
                        "Rua A",
                        LocalDate.now(),
                        -100
                )
        );
    }
}
