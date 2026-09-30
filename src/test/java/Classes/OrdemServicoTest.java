package Classes;

import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

class OrdemServicoTest {

    @Test
    void deveCriarOrdemServicoComDescricaoEData() {
        OrdemServico ordem = new OrdemServico(new Date(), "Troca de pneus");

        assertEquals("Troca de pneus", ordem.getDescricao());
        assertNotNull(ordem.getData());
    }

    @Test
    void naoDeveCriarOrdemServicoSemCategoria() {
        OrdemServico ordem = new OrdemServico(new Date(), "Revisão completa");

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ordem.setCategoriaServico(null);
        });
        assertEquals("deve ter uma categoria", exception.getMessage());
    }
}