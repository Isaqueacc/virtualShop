import org.example.classes.Cliente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TesteClass {

    @Nested
    class ClienteTest {

        private Cliente cliente;

        @BeforeEach
        void setUp() {
            cliente = new Cliente("João Silva", "joao.silva@example.com", "Rua das Flores, 123");
        }

        @Test
        void testGetNome() {
            assertEquals("João Silva", cliente.getNome());
        }

        @Test
        void testGetEmail() {
            assertEquals("joao.silva@example.com", cliente.getEmail());
        }

        @Test
        void testGetEndereco() {
            assertEquals("Rua das Flores, 123", cliente.getEndereço());
        }
    }

}
