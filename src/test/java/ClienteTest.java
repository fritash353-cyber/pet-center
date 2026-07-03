import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import classes.*;
import exceptions.ClienteComAnimaisException;
import java.time.LocalDate;

public class ClienteTest {

    @Test
    public void deveLancarExcecaoAoExcluirClienteComAnimaisVinculados() {
        Cliente cliente = new Cliente(1, "Maria", "9999", "maria@email.com", "Rua X", "111", "62000");
        Animal animal = new Animal(1, "Pipoca", 2, Sexo.FEMEA, 5.0, LocalDate.now(), cliente, new Especie("Cão"));
        cliente.adicionarAnimal(animal);


        assertThrows(ClienteComAnimaisException.class, () -> {
            cliente.excluir();
        });
    }
}
