package caixa;

import cliente.Cliente;
import pagamento.FormaDePagamento;

public class Recibo {
    /*@Dúvida
     * O recibo precisa mesmo ter essas informações ou só strings?
     * Pela perspectiva da engenharia de software o que é mais adequado?
     */

    CarrinhoDeCompra produtosComprados; //Ainda não sei qual é a melhor collection
    FormaDePagamento formaDePagamento;
    Cliente cliente;


    public Recibo(CarrinhoDeCompra produtosComprados, FormaDePagamento formaDePagamento, Cliente cliente) {
        this.produtosComprados = produtosComprados;
        this.formaDePagamento = formaDePagamento;
        this.cliente = cliente;
    }


    public void imprimeRecibo(){
        produtosComprados.getProdutos().forEach(
            (produto) -> System.out.println(produto)
        );
    }
    
}
