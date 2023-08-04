package aula08.e3;

public class ProdutoGenerico implements Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public ProdutoGenerico(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void adicionarQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerQuantidade(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.err.println("Erro: quantidade insuficiente em estoque.");
        }
    }


}
