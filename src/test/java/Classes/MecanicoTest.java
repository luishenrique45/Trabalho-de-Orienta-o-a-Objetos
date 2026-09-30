package Classes;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MecanicoTest {
    @Test
    void deveAdicionarOrdemServico() {
        Mecanico mecanico = new Mecanico("Carlos", "11999999999", "carlos@email.com");
        OrdemServico ordemServico = new OrdemServico(new Date(), "Troca de óleo");

        mecanico.adicionarOrdemServico(ordemServico);

        assertEquals(1, mecanico.getOrdemServicos().size());
        assertEquals("Troca de óleo", mecanico.getOrdemServicos().get(0).getDescricao());
    }
    @Test
    void deveListarOrdemServicos() {
        Mecanico mecanico = new Mecanico("Carlos", "11999999999", "carlos@email.com");
        OrdemServico ordemServico1 = new OrdemServico(new Date(), "Troca de óleo");
        OrdemServico ordemServico2 = new OrdemServico(new Date(), "Alinhamento");

        mecanico.adicionarOrdemServico(ordemServico1);
        mecanico.adicionarOrdemServico(ordemServico2);

        String resultado = mecanico.listarOrdemServicos();

        assertTrue(resultado.contains("Troca de óleo"));
        assertTrue(resultado.contains("Alinhamento"));
    }
    @Test
    void deveRetornarVerdadeiroSeExistiremOrdensPendentes() {
        Mecanico mecanico = new Mecanico("Carlos", "11999999999", "carlos@email.com");
        OrdemServico ordemServico = new OrdemServico(new Date(), "Troca de óleo");
        CategoriaServico categoria = new CategoriaServico("Manutenção");

        ordemServico.setCategoriaServico(categoria);
        mecanico.adicionarOrdemServico(ordemServico);

        assertTrue(mecanico.temOrdensServicoPendentes());
    }

    @Test
    void deveRetornarFalsoSeNaoHouverOrdensPendentes() {
        Mecanico mecanico = new Mecanico("Carlos", "11999999999", "carlos@email.com");
        OrdemServico ordemServico = new OrdemServico(new Date(), "Troca de óleo");

        mecanico.adicionarOrdemServico(ordemServico);

        assertFalse(mecanico.temOrdensServicoPendentes());
    }

}