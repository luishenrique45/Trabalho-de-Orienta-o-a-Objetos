package Classes;

public class Pagamento {
    private float valor;
    private OrdemServico servico;
    public Pagamento(float valor, OrdemServico servico) {
        this.valor = valor;
        this.servico = servico;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    public String processarPagamento() {
        if (valor <=0) {
         throw new IllegalArgumentException("valor invalido");
        }
        return "Pagamento"+valor+" processado com sucesso!";
    }
}
