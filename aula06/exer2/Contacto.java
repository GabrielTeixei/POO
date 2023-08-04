package aula06.exer2;

public class Contacto {
    private String nome;
    private int telefone;

    public Contacto(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "\nContacto{" + "nome=" + nome + ", telefone=" + telefone + '}';
    }

}
