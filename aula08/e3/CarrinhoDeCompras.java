package aula08.e3;

import java.util.ArrayList;

public class CarrinhoDeCompras implements Compra {
    private ArrayList<Produto> produtos;

    public CarrinhoDeCompras() {
        produtos = new ArrayList<Produto>();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        if (produtos.contains(produto)) {
            produto.adicionarQuantidade(quantidade);
        } else {
            produto.adicionarQuantidade(quantidade);
            produtos.add(produto);
        }
    }

    public void listarProdutos() {
        System.out.println("Produtos no carrinho de compras:");
        for (Produto produto : produtos) {
            System.out.printf("- %s: %.2f euros (Quantidade: %d)\n", produto.getNome(), produto.getPreco(), produto.getQuantidade());
        }
    }
    public void calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco() * produto.getQuantidade();
        }
        System.out.println("Total: " + total);
    }

    public void calcularTotalDesconto() {
        double total = 0;
        for (Produto produto : produtos) {
            if (produto instanceof ProdutoComDesconto) {
                ProdutoComDesconto produtoComDesconto = (ProdutoComDesconto) produto;
                total += (produtoComDesconto.getPreco() - produtoComDesconto.getDesconto()) * produtoComDesconto.getQuantidade();
            } else {
                total += produto.getPreco() * produto.getQuantidade();
            }
        }
        System.out.println("Total com desconto: " + total);
    }
    
}
