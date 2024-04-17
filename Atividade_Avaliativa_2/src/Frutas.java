public class Frutas extends Produto {
    private String tipoFruta;

    
//constructors
    public Frutas(String nome, float preco, int quantidadeEstoque, String dataValidade, int codigo) {
        super(nome, preco, quantidadeEstoque, dataValidade, codigo);
    }

    public Frutas() {
    }


//getters - setters
    public String getTipoFruta() {
        return tipoFruta;
    }

    public void setTipoFruta(String tipoFruta) {
        this.tipoFruta = tipoFruta;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo de fruta" + tipoFruta;
    }
}
