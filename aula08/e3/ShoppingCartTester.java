package aula08.e3;

public class ShoppingCartTester {
    public static void main(String[] args) {
        Produto p1 = new ProdutoGenerico("Camisolas", 10, 3);
        Produto p2 = new ProdutoGenerico("Calças", 30, 1);
        Produto p3 = new ProdutoComDesconto("Sapatilhas", 50, 2, 50);
        Produto p4 = new ProdutoComDesconto("Casacos", 100, 1, 10);
        
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarProduto(p1, 1);
        carrinho.adicionarProduto(p2, 5);
        carrinho.adicionarProduto(p3, 2);
        carrinho.adicionarProduto(p4, 1);

        System.out.println("--------------------Carrinho----------------------");
        carrinho.listarProdutos(); // lista os produtos do carrinho
        System.out.println("--------------------Total------------------------");
        carrinho.calcularTotal(); // calcula o total da compra do produto Generico
        System.out.println("--------------------Desconto---------------------");
        carrinho.calcularTotalDesconto(); // calcula o total da compra do produto com desconto
        System.out.println("--------------------Fim--------------------------");

        
        
    }
}
