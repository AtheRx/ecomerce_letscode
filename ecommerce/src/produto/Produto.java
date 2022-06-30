package produto;

import java.math.BigDecimal;
import java.util.Set;

public class Produto {
    private String nome;
    private BigDecimal preco;
    private Set<CategoriaDeProduto> categoria; //Várias categorias. Não precisa de ordem.
    
    public Produto(String nome, BigDecimal preco, Set<CategoriaDeProduto> categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Produto [categoria=" + categoria + ", nome=" + nome + ", preco=" + preco + "]";
    }

    
    
}
