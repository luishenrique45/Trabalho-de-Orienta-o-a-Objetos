package Classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    @Test
    public void testAdicionarVeiculo() {
        Cliente cliente = new Cliente("Maria", "987654321", "maria@email.com");
        Veiculo carro = new Veiculo("ABC-1234", "Honda Civic");

        cliente.adicionarVeiculo(carro);
        assertEquals(1, cliente.getVeiculos().size());
    }

    @Test
    public void testRemoverVeiculo() {
        Cliente cliente = new Cliente("Carlos", "123456789", "carlos@email.com");
        Veiculo carro = new Veiculo("DEF-5678", "Ford Fiesta");

        cliente.adicionarVeiculo(carro);
        cliente.removerVeiculo(carro);

        assertEquals(0, cliente.getVeiculos().size());
    }
    @Test
    void naoDeveRemoverVeiculoNaoExistente() {
        Cliente cliente = new Cliente("Ana", "11999999999", "ana@email.com");
        Veiculo veiculo = new Veiculo("XYZ-9999", "Fiat Uno");

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            cliente.removerVeiculo(veiculo);
        });
        assertEquals("Veículo não encontrado na lista do cliente.", exception.getMessage());
    }
}