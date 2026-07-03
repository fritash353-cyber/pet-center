import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import classes.*;
import exceptions.AnimalSemDonoException;
import java.time.LocalDate;

public class AnimalTest {

    @Test
    public void deveLancarExcecaoQuandoAnimalNaoTiverDono() {
        
        Especie gato = new Especie("Gato");

        
        assertThrows(AnimalSemDonoException.class, () -> {
            new Animal(1, "Mingau", 3, Sexo.MACHO, 4.2, LocalDate.now(), null, gato);
        });
    }
}