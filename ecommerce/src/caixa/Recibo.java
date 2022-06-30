package caixa;

import java.time.LocalDateTime;

import cliente.Cliente;
import pagamento.FormaDePagamento;

public class Recibo {
    /*
     * @Dúvida
     * O recibo precisa mesmo ter essas informações ou só strings?
     * Pela perspectiva da engenharia de software o que é mais adequado?
     */

    CarrinhoDeCompra produtosComprados; // Ainda não sei qual é a melhor collection
    FormaDePagamento formaDePagamento;
    Cliente cliente;

    public Recibo(CarrinhoDeCompra produtosComprados, FormaDePagamento formaDePagamento, Cliente cliente) {
        this.produtosComprados = produtosComprados;
        this.formaDePagamento = formaDePagamento;
        this.cliente = cliente;
    }
    public void imprimir() {
        System.out.println("************CLIENTE*************");
        System.out.println(cliente.getNome().toUpperCase());
        System.out.println("\n");      

        System.out.println("********ITENS ADQUIRIDOS********\n");
        produtosComprados.getProdutos().forEach(
                (produto) -> System.out.println(String.format("%-15s", produto.getCategoria()) 
                                                + String.format("%-10s",produto.getNome()) 
                                                + String.format("%5s", produto.getPreco())));


        System.out.println("\n\n");
        System.out.println(String.format("%-15s","VALOR TOTAL:" + String.format("%18s", produtosComprados.getValorTotal().toString())));
        
        System.out.println("******FORMA DE PAGAMENTO********");
        System.out.println(formaDePagamento.getNome().toUpperCase() + "\n");
        System.out.println(LocalDateTime.now().toString());
        System.out.println("********************************");
        
    }

}
