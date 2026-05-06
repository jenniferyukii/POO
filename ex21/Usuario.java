package ex21;

public class Usuario {
    public int cpf;
    public String nome;

    public Usuario(String nome, String cpf) {
    }

    public String getDados() {
        return nome + " - " + cpf;
    }
}
