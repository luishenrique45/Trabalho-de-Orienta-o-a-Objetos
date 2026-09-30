package Classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PecaTest {
    @Test
    public void testNomePeca() {
        Peca peca = new Peca();
        peca.setNome("Filtro de óleo");

        assertEquals("Filtro de óleo", peca.getNome());
    }
}