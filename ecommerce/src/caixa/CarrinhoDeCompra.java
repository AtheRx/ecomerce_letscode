package caixa;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

import produto.Produto;

public class CarrinhoDeCompra {
    private Set<Produto> carrinhoComProdutos = new LinkedHashSet<>(); //Mantém a ordem em que foi adicionado
    
    public void adicionarProdutos(Produto produto){
        carrinhoComProdutos.add(produto);
    }

    public void removerProdutos(Produto produto){
        carrinhoComProdutos.remove(produto);
    }

    public Set<Produto> getProdutos(){
        return Collections.unmodifiableSet(carrinhoComProdutos);
    }
}
