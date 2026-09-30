package Classes;

import java.util.ArrayList;

public class Veiculo {
    private String placa;
    private String modelo;
    private ArrayList<OrdemServico>recebe;

    public Veiculo(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
        this.recebe = new ArrayList<>();
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public ArrayList<OrdemServico> getServicos() {
        return recebe;
    }

    public void setServicos(ArrayList<OrdemServico> servicos) {
        this.recebe = servicos;
    }
    public String getDetalhes(){
        return "placa:"+placa+"modelo:"+modelo;
    }
}
