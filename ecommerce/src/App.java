import java.util.Set;

import caixa.CarrinhoDeCompra;
import caixa.Checkout;
import cliente.Cliente;
import cliente.Sessao;
import pagamento.BBPay;
import pagamento.FormaDePagamento;
import produto.Produto;
import produto.ProdutoDao;

public class App {
    public static void main(String[] args) throws Exception {

        Cliente cliente = new Cliente("Fulano de Tal");
        Sessao sessao = new Sessao(cliente);
        FormaDePagamento formaDePagamento = new BBPay();
        Set<Produto> setProdutos = new ProdutoDao().getProdutos();

        CarrinhoDeCompra carrinho = new CarrinhoDeCompra();

        System.out.println(carrinho.getProdutos());

        Checkout checkout = new Checkout();
        checkout.fecharCompra(cliente, formaDePagamento, carrinho);

    }
}
