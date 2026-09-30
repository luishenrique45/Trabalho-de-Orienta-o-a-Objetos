package Classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoTest {
    @Test
    public void testCriacaoVeiculo() {
        Veiculo veiculo = new Veiculo("XYZ-9876", "Toyota Corolla");
        assertEquals("XYZ-9876", veiculo.getPlaca());
        assertEquals("Toyota Corolla", veiculo.getModelo());
    }
}