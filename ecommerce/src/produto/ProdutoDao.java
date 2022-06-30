package produto;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ProdutoDao {
    //Não precisa de ordem
    Set<Produto> produtos = new HashSet<>(
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

    public Set<Produto> getProdutos() {
        return Collections.unmodifiableSet(produtos);
    }
}

