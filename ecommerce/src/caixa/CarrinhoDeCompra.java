package caixa;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import produto.Produto;
import produto.ProdutoDao;

public class CarrinhoDeCompra {
    private Set<Produto> carrinhoComProdutos = new LinkedHashSet<>(); //Mantém a ordem em que foi adicionado
    

    public void adicionarProdutos(Produto produto){
        carrinhoComProdutos.add(produto);
    }

    public void adicionarProdutoDoProdutoDao(String nome){
        carrinhoComProdutos.add(ProdutoDao.getProduto(nome));
    }

    public void removerProdutos(Produto produto){
        carrinhoComProdutos.remove(produto);
    }

    public Set<Produto> getProdutos(){
        return Collections.unmodifiableSet(carrinhoComProdutos);
    }



    public BigDecimal getValorTotal(){
        BigDecimal valorTotal = BigDecimal.ZERO;

        for (Produto produto: this.carrinhoComProdutos){
            valorTotal =  valorTotal.add(produto.getPreco());
        }

        return valorTotal;
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompra [carrinhoComProdutos=" + carrinhoComProdutos + "]";
    }



    
}
