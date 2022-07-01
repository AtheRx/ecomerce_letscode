package produto;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ProdutoDao {   
    
    private final static Map<Integer, Produto> produtosMap = carregaProdutos();

    
    // public ProdutoDao() {
    //     produtosMap = carregaProdutos();
    // }


    private static Map<Integer, Produto> carregaProdutos(){
        Map<Integer, Produto> produtosMap = new HashMap<>();
        produtosMap.put(
            1111,  
            new Produto(
                "Notebook", 
                BigDecimal.valueOf(2000d), 
                new HashSet<>(Arrays.asList(CategoriaDeProduto.INFORMATICA))
            )
        );

        produtosMap.put(
            2222,  
            new Produto(
                "Orquídia", 
                BigDecimal.valueOf(30d), 
                new HashSet<>(Arrays.asList(CategoriaDeProduto.JARDIM))
            )
        );

        produtosMap.put(
            3333,  
            new Produto(
                "Pneu", 
                BigDecimal.valueOf(250d), 
                new HashSet<>(Arrays.asList(CategoriaDeProduto.AUTOMOTIVOS))
            )
        );

        return produtosMap;
    }
    
    
    // //Não precisa de ordem
    // static Set<Produto> produtos = new HashSet<>(
    //     Arrays.asList(
    //         new Produto(
    //             "Notebook", 
    //             BigDecimal.valueOf(2000d), 
    //             new HashSet<>(Arrays.asList(CategoriaDeProduto.INFORMATICA))
    //         ),
    //         new Produto(
    //             "Orquídia", 
    //             BigDecimal.valueOf(30d), 
    //             new HashSet<>(Arrays.asList(CategoriaDeProduto.JARDIM))
    //         ),
    //         new Produto(
    //             "Pneu", 
    //             BigDecimal.valueOf(250d), 
    //             new HashSet<>(Arrays.asList(CategoriaDeProduto.AUTOMOTIVOS))
    //         )
    //     )
            
    // );

    // public static Set<Produto> getProdutos() {
    //     return Collections.unmodifiableSet(produtos);
    // }

    // public static Produto getProduto(String nome){
    //     Set<Produto> p = produtos.stream().filter(s -> nome.equals(s.getNome())).collect(Collectors.toSet());
    //     return p.iterator().next();
    // }


    public static Map<Integer, Produto> getProdutos() {
        return produtosMap;
    }

    // public static Produto getProduto(String nome){
    //     Set<Produto> p = produtos.stream().filter(s -> nome.equals(s.getNome())).collect(Collectors.toSet());
    //     return p.iterator().next();
    // }

    

}

