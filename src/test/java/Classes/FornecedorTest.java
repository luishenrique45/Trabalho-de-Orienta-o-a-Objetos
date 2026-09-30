package Classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FornecedorTest {
@Test
    public void fornecedorDeveTerNome(){
    try{
        Fornecedor fornecedor = new Fornecedor("");
    }catch(Exception e){
        assertEquals("fornecedor deve ter nome", e.getMessage());
    }
}
    @Test
    public void testAdicionarPeca() {
        Fornecedor fornecedor = new Fornecedor("AutoPeças");
        Peca peca = new Peca();
        peca.setNome("Pastilha de freio");

        fornecedor.getPecasDisponiveis().add(peca);
        assertEquals(1, fornecedor.getPecasDisponiveis().size());
    }
}