package cliente;

import java.util.Map;
import java.util.Set;
import caixa.CarrinhoDeCompra;
import caixa.Checkout;
import caixa.Recibo;
import pagamento.FormaDePagamento;
import pagamento.PagamentoDao;
import produto.Produto;
import produto.ProdutoDao;

public class Sessao {

    CarrinhoDeCompra carrinhoDeCompra;
    Cliente cliente;
    ProdutoDao estoqueDao;
    PagamentoDao pagamentoDao;

    public Sessao(Cliente cliente) {
        this.cliente = cliente;
        this.carrinhoDeCompra = new CarrinhoDeCompra();
        this.estoqueDao = new ProdutoDao();
        this.pagamentoDao = new PagamentoDao();
    }

    public Map<Integer, Produto> getProdutos() {
        return this.estoqueDao.getProdutos();
    }

    public void adicionaProdutoNoCarrinho(Produto produto) {
        this.carrinhoDeCompra.adicionarProdutos(produto);
    }

    public void removerProdutoDoCarrinho(Produto produto) {
        this.carrinhoDeCompra.removerProdutos(produto);
    }

    public Set<FormaDePagamento> getFormaDePagamento() {
        return this.pagamentoDao.getFormasDePagamento();
    }

    public void realizaCheckout(FormaDePagamento formaDePagamento){

        Checkout checkout = new Checkout(formaDePagamento, this.carrinhoDeCompra, this.cliente);
		checkout.getRecibo().imprimir();
    }

}
