package Classes;

import java.util.ArrayList;

public class Fornecedor {
    private String nome;
    private ArrayList<Peca>pecasDisponiveis;

    public Fornecedor(String nome){
        this.nome = nome;
        this.pecasDisponiveis = new ArrayList<>();
    }
    public String getNome() {
        return nome;
    }

    public ArrayList<Peca> getPecasDisponiveis() {
        return pecasDisponiveis;
    }

    public void setPecasDisponiveis(ArrayList<Peca> pecasDisponiveis) {
        this.pecasDisponiveis = pecasDisponiveis;
    }

    public void setNome(String nome) {
        if (nome==null){
            throw new IllegalArgumentException("fornecedor deve ter um nome");
        }
        this.nome = nome;
    }
    public ArrayList<String> listarPecasDisponiveis () {
        ArrayList<String> pecasDisponiveislist = new ArrayList<String>();
        for (Peca peca : this.pecasDisponiveis) {
            pecasDisponiveislist.add(peca.getNome());
        }
        return pecasDisponiveislist;
    }

}
