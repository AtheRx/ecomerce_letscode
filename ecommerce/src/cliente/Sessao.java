package cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import caixa.Checkout;
import caixa.Recibo;
import pagamento.FormaDePagamento;
import pagamento.PagamentoDao;
import produto.Produto;
import produto.ProdutoDao;

public class Sessao {

    List<Produto> carrinho;
    Cliente cliente;
    ProdutoDao estoque;
    PagamentoDao pagamentoDao;

    public Sessao(Cliente cliente) {
        this.cliente = cliente;
        this.carrinho = new ArrayList<>();
    }

    public Set<Produto> getProdutos() {
        return this.estoque.getProdutos();
    }

    public void adicionaProdutoNoCarrinho(Produto produto) {
        this.carrinho.add(produto);
    }

    public void removerProdutoDoCarrinho(Produto produto) {
        this.carrinho.remove(produto);
    }

    public Set<FormaDePagamento> getFormaDePagamento() {
        return this.pagamentoDao.getFormasDePagamento();
    }


    // Aqui precido da implementação de Checkout e Recibo funcionando.
    // public Recibo realizaCheckout(FormaDePagamento formaDePagamento){

    //     Checkout checkout = new Checkout(formaDePagamento, this.carrinho, this.cliente);
	// 	return checkout.getRecibo();
        
    // }

}
