package entities;

public class Cliente {


    private String nome;

    private Cliente() {}

    private Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
