package produto;

public enum CategoriaDeProduto {
    INFORMATICA("Informatica"),
    CASA("Casa"),
    JARDIM("Jarim"),
    AUTOMOTIVOS("Automotivos");

    String categoria;

    private CategoriaDeProduto(String categoria){
        this.categoria = categoria;
    }

    public String getCategoria(){
        return this.categoria;
    }

}
