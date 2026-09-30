package Classes;

import java.util.ArrayList;
import java.util.Date;

public class OrdemServico {
    private Date data;
    private String descricao;
    private ArrayList<Peca> pecas;
    private CategoriaServico categoriaServico;

    public OrdemServico(Date data, String descricao) {
        this.data = data;
        this.descricao = descricao;

    }
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<Peca> getPecas() {
        return pecas;
    }

    public void setPecas(ArrayList<Peca> pecas) {
        this.pecas = pecas;
    }

    public CategoriaServico getCategoriaServico() {
        return categoriaServico;
    }

    public void setCategoriaServico(CategoriaServico categoriaServico) {
        if (categoriaServico == null) {
            throw new IllegalArgumentException("deve ter uma categoria");
        }
        this.categoriaServico = categoriaServico;
    }
    public void adicionarPeca(Peca peca) {
        this.pecas.add(peca);
    }
    public String detalhesdoServico() {
        return "data:"+data+"realizar:"+descricao+"Categoria do servico:"+categoriaServico;
    }
    public ArrayList<String> listarPecasUsadas(OrdemServico os) {
        ArrayList<String> resultado = new ArrayList<>();
        for (Peca peca : os.getPecas()) {
            resultado.add("Peça: " + peca.getNome() + " - Fornecedor: " + peca.getFornecedor().getNome());
        }
        return resultado;
    }
    public ArrayList<String> listarPecasPorServico(OrdemServico os) {
        ArrayList<String> resultado = new ArrayList<>();
        for (Peca peca : os.getPecas()) {
            resultado.add("Peça: " + peca.getNome() + " - Fornecedor: " + peca.getFornecedor().getNome());
        }
        return resultado;
    }

}
