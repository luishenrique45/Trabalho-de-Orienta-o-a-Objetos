package Classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {
    @Test
    public void nomeObrigatorio(){
    try {
        Usuario usuario = new Usuario("", "12121212", "hajbjkdnsdk@gmail.com");
    }
    catch (Exception e){
    assertEquals( "Nome obrigatorio", e.getMessage() );
    }
    }
    @Test
    public void telefoneObrigatorio(){
        try {
            Usuario usuario = new Usuario("joao", "", "hajbjkdnsdk@gmail.com");
        }
        catch (Exception e){
            assertEquals( "Telefone obrigatorio", e.getMessage() );
        }
    }
    @Test
    public void emailObrigatorio() {
        try {
            Usuario usuario = new Usuario("joao", "12121212", "");
        } catch (Exception e) {
            assertEquals("Email obrigatorio", e.getMessage());
        }
    }
    @Test
    public void usuarioNome(){
            Usuario usuario = new Usuario("joao", "12121212", "Joao12345@gmail.com");
            assertEquals("joao", usuario.getNome());
        }
    @Test
    public void usuarioTelefone(){
        Usuario usuario = new Usuario("joao", "12121212", "Joao12345@gmail.com");
        assertEquals("12121212", usuario.getTelefone());
    }
    @Test
    public void usuarioEmail(){
        Usuario usuario = new Usuario("joao", "12121212", "Joao12345@gmail.com");
        assertEquals("Joao12345@gmail.com", usuario.getEmail());
    }
        @Test
        public void testCriacaoUsuario() {
            Cliente cliente = new Cliente("João", "123456789", "joao@email.com");
            assertEquals("João", cliente.getNome());
            assertEquals("123456789", cliente.getTelefone());
            assertEquals("joao@email.com", cliente.getEmail());
        }


    }


