package Classes;

public class CategoriaServico {
    private String nome;

    public CategoriaServico(String nome) {
        this.nome = nome;

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String listarOrdensServico() {
    return "listar ordens servico para a categoria"+nome;
    }
}
