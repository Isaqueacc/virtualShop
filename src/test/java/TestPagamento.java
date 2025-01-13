import org.example.classes.Pagamento;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPagamento {
    @Nested
    class Pagamento{
        private org.example.classes.Pagamento pagamento;

        @BeforeEach
        void setUp(){
            pagamento = new org.example.classes.Pagamento(39.00);
        }
        @Test
        void testGetValor(){
            assertEquals(39.00 , pagamento.getValor());
        }
    }
}
