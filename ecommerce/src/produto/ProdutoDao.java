package produto;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ProdutoDao {
    //Não precisa de ordem
    static Set<Produto> produtos = new HashSet<>(
        Arrays.asList(
            new Produto(
                "Notebook", 
                BigDecimal.valueOf(2000d), 
                new HashSet<>(Arrays.asList(CategoriaDeProduto.INFORMATICA))
            ),
            new Produto(
                "Orquídia", 
                BigDecimal.valueOf(30d), 
                new HashSet<>(Arrays.asList(CategoriaDeProduto.JARDIM))
            ),
            new Produto(
                "Pneu", 
                BigDecimal.valueOf(250d), 
                new HashSet<>(Arrays.asList(CategoriaDeProduto.AUTOMOTIVOS))
            )
        )
            
    );

    public static Set<Produto> getProdutos() {
        return Collections.unmodifiableSet(produtos);
    }

    public static Produto getProduto(String nome){
        Set<Produto> p = produtos.stream().filter(s -> nome.equals(s.getNome())).collect(Collectors.toSet());
        return p.iterator().next();
    }

}

