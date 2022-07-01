package pagamento;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PagamentoDao {
    //Não precisa de ordem

    private static Map<Integer, FormaDePagamento> formasDePagamento = carregaDados();

    private static Map<Integer, FormaDePagamento> carregaDados(){
        Map<Integer, FormaDePagamento> formasDePagamento = new HashMap<>();
        
        formasDePagamento.put(1111, new Boleto());
        formasDePagamento.put(2222, new CartaoAVista());
        formasDePagamento.put(3333, new BBPay());
        formasDePagamento.put(4444, new CartaoParcelado(1));
        formasDePagamento.put(4444, new CartaoParcelado(2));
        formasDePagamento.put(4444, new CartaoParcelado(3));

        
        return formasDePagamento;
    }

    // private Set<FormaDePagamento> formasDePagamento = new HashSet<>(
    //     Arrays.asList(
    //          new Boleto(),
    //          new CartaoAVista(),
    //          new CartaoAVista(),
    //          new CartaoParcelado(1),
    //          new CartaoParcelado(2),
    //          new CartaoParcelado(3)
    //     )
    // );

    public Map<Integer, FormaDePagamento> getFormasDePagamento() {
        return Collections.unmodifiableMap(formasDePagamento);
    }
}
