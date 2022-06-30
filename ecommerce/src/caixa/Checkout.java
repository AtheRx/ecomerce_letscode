package caixa;


import cliente.Cliente;
import pagamento.FormaDePagamento;


public class Checkout {

    public void fecharCompra(Cliente cliente, FormaDePagamento formaDePagamento, CarrinhoDeCompra produtosComprados) {
        Recibo recibo = new Recibo(produtosComprados, formaDePagamento, cliente);
        recibo.imprimeRecibo();

    }
}

