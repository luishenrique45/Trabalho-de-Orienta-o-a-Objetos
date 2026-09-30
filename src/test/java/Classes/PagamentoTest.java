package Classes;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class PagamentoTest {
    @Test
    public void testPagamentoValido() {
        OrdemServico os = new OrdemServico(new Date(), "Troca de óleo");
        Pagamento pagamento = new Pagamento(100, os);

        assertEquals("Pagamento100.0 processado com sucesso!", pagamento.processarPagamento());
    }

    @Test
    public void testPagamentoInvalido() {
        OrdemServico os = new OrdemServico(new Date(), "Troca de freios");

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Pagamento(-50, os).processarPagamento();
        });

        assertEquals("valor invalido", exception.getMessage());
    }

    @Test
    void deveProcessarPagamentoComValorValido() {
        OrdemServico ordemServico = new OrdemServico(new Date(), "Alinhamento");
        Pagamento pagamento = new Pagamento(150.0f, ordemServico);

        assertEquals("Pagamento150.0 processado com sucesso!", pagamento.processarPagamento());
    }

    @Test
    void naoDevePermitirPagamentoComValorZero() {
        OrdemServico ordemServico = new OrdemServico(new Date(), "Balanceamento");

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Pagamento(0.0f, ordemServico).processarPagamento();
        });
        assertEquals("valor invalido", exception.getMessage());
    }
}