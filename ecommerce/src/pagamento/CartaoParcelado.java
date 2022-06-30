package pagamento;

public class CartaoParcelado extends FormaDePagamento{
    
    private int parcelas;

    public CartaoParcelado(int parcelas){
        super("Cartão parcelado");
        this.setParcelas(parcelas);
    }

    private void setParcelas(int parcelas){

        if(parcelas <= 0 || parcelas > 3){
            throw new RuntimeException ("Parcelas devem ser entre 1 e 3");
        }
        this.parcelas = parcelas;
    }




}
