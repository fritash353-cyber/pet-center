import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import classes.*;
import exceptions.ConsultaSemVeterinarioException;
import java.time.LocalDate;

public class ConsultaTest {

    @Test
    public void deveLancarExcecaoAoCriarConsultaSemVeterinario() {
        assertThrows(ConsultaSemVeterinarioException.class, () -> {
            new Consulta(1, LocalDate.now(), "Rotina", null);
        });
    }
}