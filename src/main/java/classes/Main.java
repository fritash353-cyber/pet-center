package classes;

import java.time.LocalDate;

import exceptions.AnimalSemDonoException;
import exceptions.ClienteComAnimaisException;
import exceptions.ConsultaSemVeterinarioException;
import exceptions.LoginInvalidoException;

public class Main {

    public static void main(String[] args) {

        try {

            // Espécie
            Especie cachorro = new Especie("Cachorro");

            // Cliente
            Cliente cliente = new Cliente(
                    1,
                    "João Silva",
                    "(88)99999-9999",
                    "joao@email.com",
                    "Rua A",
                    "123.456.789-00",
                    "62000-000"
            );


            // Animal
            Animal animal = new Animal(
            1,
            "Rex",
            5,
            Sexo.MACHO,
            18.5,
            LocalDate.of(2020, 5, 10),
            null,
            cachorro
             );

            cliente.adicionarAnimal(animal);

            // Funcionário/Veterinário
            Veterinario veterinario = new Veterinario(
                    1,
                    "Carlos Mendes",
                    "(88)98888-8888",
                    "vet@email.com",
                    "Rua B",
                    LocalDate.now(),
                    5500,
                    "CRMV-12345",
                    "Clínico geral"
            );

            // Login
            veterinario.login();

            // Consulta de cliente
            Consulta consulta = new Consulta(
                    1,
                    LocalDate.now(),
                    "Animal apresentou febre.",
                    veterinario
            );

            veterinario.adicionarConsulta(consulta);

            animal.adicionarConsulta(consulta);

            consulta.regCons();

            // Exames
            consulta.adicionarExame("Hemograma", "Normal");
            consulta.adicionarExame("Raio-X", "Sem alterações");

            // Tratamento
            Tratamento tratamento = new Tratamento(
                    1,
                    LocalDate.now(),
                    "Antibiótico por 7 dias"
            );

            animal.adicionarTratamento(tratamento);

            // Impressões

            System.out.println("\n===== CLIENTE =====");
            System.out.println(cliente.conCliente());

            System.out.println("\n===== ANIMAL =====");
            System.out.println(animal.visAnimal());

            System.out.println("\n===== VETERINÁRIO =====");
            System.out.println(veterinario.emitirRelatorio());

            System.out.println("\n===== CONSULTA =====");
            System.out.println(consulta.verCons());

            System.out.println("\n===== EXAMES =====");
            System.out.println(consulta.listCons());

            System.out.println("\n===== TRATAMENTO =====");
            System.out.println(tratamento.visTratamento());

            System.out.println("\n===== NOTIFICAÇÃO =====");
            animal.enviarNotificacao("Consulta marcada para amanhã às 14h.");

            veterinario.logout();
            System.out.printf("\n");



            
        }  catch (AnimalSemDonoException e) {
        System.out.println(e.getMessage());

    } catch (ClienteComAnimaisException e) {
        System.out.println(e.getMessage());

    } catch (ConsultaSemVeterinarioException e) {
        System.out.println(e.getMessage());

    } catch (LoginInvalidoException e) {
        System.out.println(e.getMessage());

    } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }
  }
} 

      // mvn compile
      // mvn exec:java "-Dexec.mainClass=classes.Main"
      // mvn test


 

