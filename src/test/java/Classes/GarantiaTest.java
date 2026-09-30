package Classes;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class GarantiaTest {
    @Test
    public void testSetDataExpiracao() {
        Garantia garantia = new Garantia();
        Date data = new Date();

        garantia.setDataExpiracao(data);
        assertEquals(data, garantia.getDataExpiracao());
    }
}