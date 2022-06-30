import cliente.Cliente;
import cliente.Sessao;

public class App {
    public static void main(String[] args) throws Exception {

        Cliente cliente = new Cliente("Fulano de Tal");
        Sessao sessao = new Sessao(cliente);

    }
}
