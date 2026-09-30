package Classes;

import java.util.ArrayList;
import java.util.Date;

public class Cliente extends Usuario{

    private ArrayList<Veiculo>veiculos;
    private Pagamento pagamento;

    public Cliente(String nome,String telefone, String email) {
     super(nome,telefone,email);
     this.veiculos = new ArrayList<>();

    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public ArrayList<String>listarVeiculos() {
        ArrayList<String> listaVeiculos = new ArrayList<>();
        for (Veiculo veiculo : veiculos) {
            listaVeiculos.add(veiculo.getDetalhes());
        }
    return listaVeiculos;
    }
    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public  void realizarPagamento(Pagamento pagamento){
     pagamento.processarPagamento();
    }
    public void removerVeiculo(Veiculo veiculo) {
        if (!veiculos.contains(veiculo)) {
            throw new IllegalArgumentException("Veículo não encontrado na lista do cliente.");
        }
        veiculos.remove(veiculo);
    }
    public ArrayList<String> listarServicosPendentesCliente() {
        ArrayList<String> resultado = new ArrayList<>();
        for (Veiculo veiculo : veiculos) {
            for (OrdemServico os : veiculo.getServicos()) {
                resultado.add("Veículo: " + veiculo.getModelo() + " - Serviço: " + os.getDescricao());
            }
        }
        return resultado;
    }
    public ArrayList<String> buscarServicosPorPeriodo(Date inicio, Date fim) {
        ArrayList<String> resultado = new ArrayList<>();

        for (Veiculo veiculo : veiculos) {
            for (OrdemServico os : veiculo.getServicos()) {
                if (os.getData() != null && !os.getData().before(inicio) && !os.getData().after(fim)) {
                    resultado.add("Veículo: " + veiculo.getModelo() + " - Serviço: " + os.getDescricao() + " - Data: " + os.getData());
                }
            }
        }

        return resultado;
}
    public ArrayList<String> listarServicosConcluidos() {
        ArrayList<String> resultado = new ArrayList<>();
        for (Veiculo veiculo : veiculos) {
            for (OrdemServico os : veiculo.getServicos()) {
                if (os.getCategoriaServico() != null) {
                    resultado.add("Veículo: " + veiculo.getModelo() + " - Serviço Concluído: " + os.getDescricao());
                }
            }
        }
        return resultado;
    }
    public boolean temPagamentosPendentes() {
        return pagamento == null;
    }
    public ArrayList<String> buscarServicosVeiculoPorPeriodo(Veiculo veiculo, Date inicio, Date fim) {
        ArrayList<String> resultado = new ArrayList<>();
        for (OrdemServico os : veiculo.getServicos()) {
            if (os.getData() != null && !os.getData().before(inicio) && !os.getData().after(fim)) {
                resultado.add("Serviço: " + os.getDescricao() + " - Data: " + os.getData());
            }
        }
        return resultado;
    }

}