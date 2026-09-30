package Classes;

public class Peca {
    private String nome;
    private Fornecedor fornecedor;
    private Garantia garantia;

    public Garantia getGarantia() {
        return garantia;
    }

    public void setGarantia(Garantia garantia) {
        this.garantia = garantia;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        if (fornecedor == null){
            throw new IllegalArgumentException("fornecedor obrigatorio");
        }
        this.fornecedor = fornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
   public String nomedoFornecedor(){
        return fornecedor.getNome();
   }
   public String detalhesDaPeca(){
        return "Garantia da Peça:"+garantia.getDataExpiracao()+"nome:"+nome;
    }
}
