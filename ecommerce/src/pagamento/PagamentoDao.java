package pagamento;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class PagamentoDao {
    //Não precisa de ordem
    private Set<FormaDePagamento> formasDePagamento = new HashSet<>(
        Arrays.asList(
             new Boleto(),
             new CartaoAVista(),
             new CartaoAVista(),
             new CartaoParcelado(1),
             new CartaoParcelado(2),
             new CartaoParcelado(3)
        )
    );

    public Set<FormaDePagamento> getFormasDePagamento() {
        return Collections.unmodifiableSet(formasDePagamento);
    }
}
