import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import caixa.Recibo;
import cliente.Cliente;
import cliente.Sessao;
import pagamento.FormaDePagamento;
import produto.Produto;

public class App {
    public static void main(String[] args) throws Exception {

        Cliente cliente = new Cliente("Fulano de Tal");
        Sessao sessao = new Sessao(cliente);

        //Set<Produto> estoque = sessao.getProdutos();
        Map<Integer, Produto> estoque = sessao.getProdutos();
        // List<Produto> estoqueDisponivel = new ArrayList<>();
        // estoque.forEach(e -> estoqueDisponivel.add(e));


        // sessao.adicionaProdutoNoCarrinho(estoqueDisponivel.get(0));
        // sessao.adicionaProdutoNoCarrinho(estoqueDisponivel.get(1));
        sessao.adicionaProdutoNoCarrinho(estoque.get(1111));
        sessao.adicionaProdutoNoCarrinho(estoque.get(2222));

        
        Set<FormaDePagamento> formas = sessao.getFormaDePagamento();
        List<FormaDePagamento> formasp = new ArrayList<>();
        formas.forEach(p -> formasp.add(p));

        
        Recibo recibo = sessao.realizaCheckout(formasp.get(0));
        recibo.imprimir();

    }
}
