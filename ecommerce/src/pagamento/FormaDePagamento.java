package pagamento;

public abstract class FormaDePagamento {
    
    private String nome;

    public FormaDePagamento(String nome){
        this.nome  = nome;
    }

    public String getNome() {
        return nome;
    }

}
