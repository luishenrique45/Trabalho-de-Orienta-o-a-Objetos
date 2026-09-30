package Classes;

import java.util.ArrayList;

public class Mecanico extends Usuario{
    private ArrayList<OrdemServico>ordemServicos;

    public Mecanico(String nome,String telefone,String email){
        super(nome,telefone,email);
        this.ordemServicos = new ArrayList<>();
    }
    public ArrayList<OrdemServico> getOrdemServicos() {
        return ordemServicos;
    }

    public void setOrdemServicos(ArrayList<OrdemServico> ordemServicos) {
        this.ordemServicos = ordemServicos;
    }
    public void adicionarOrdemServico(OrdemServico tarefa){
        this.ordemServicos.add(tarefa);
    }
    public String listarOrdemServicos(){
        ArrayList<String>  listaServicos = new ArrayList<String>();
        for(OrdemServico ordemServico : this.ordemServicos){
            listaServicos.add(ordemServico.detalhesdoServico());
        }
        return listaServicos.toString();
        }
    public boolean temOrdensServicoPendentes() {
        for (OrdemServico os : ordemServicos) {
            if (os.getCategoriaServico() != null) {
                return true;
            }
        }
        return false;
    }
    public ArrayList<String> listarPecasUsadas() {
        ArrayList<String> pecasUsadas = new ArrayList<>();
        for (OrdemServico os : ordemServicos) {
            for (Peca peca : os.getPecas()) {
                pecasUsadas.add(peca.getNome());
            }
        }
        return pecasUsadas;
    }


}
