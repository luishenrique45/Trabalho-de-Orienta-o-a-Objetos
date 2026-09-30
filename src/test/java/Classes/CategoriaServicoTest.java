package Classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoriaServicoTest {
    @Test
    public void deveListarCategoria() {
        CategoriaServico categoriaServico = new CategoriaServico("troca de peneu");
        assertEquals("troca de peneu",categoriaServico.getNome());
    }

}