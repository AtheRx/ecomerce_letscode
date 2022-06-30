package caixa;

import cliente.Cliente;
import pagamento.FormaDePagamento;

public class Checkout {

    Recibo recibo;

	public Checkout(FormaDePagamento formaDePagamento, CarrinhoDeCompra produtosComprados , Cliente cliente){
		this.recibo = new Recibo(produtosComprados, formaDePagamento, cliente);
	}
	
    public Recibo getRecibo(){
        return this.recibo;
    }

}

