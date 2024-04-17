public class Utensilio extends Produto {
   
    private String tipoUtensilio;

//getters - setters
    public String getTipoUtensilio() {
        return tipoUtensilio;
    }

    public void setTipoUtensilio(String tipoUtensilio) {
        this.tipoUtensilio = tipoUtensilio;
    }

//constructors
    public Utensilio(String nome, float preco, int quantidadeEstoque, String dataValidade, int codigo,
            String tipoUtensilio) {
        super(nome, preco, quantidadeEstoque, dataValidade, codigo);
        this.tipoUtensilio = tipoUtensilio;
    }

    public Utensilio(String tipoUtensilio) {
        this.tipoUtensilio = tipoUtensilio;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nTipo do utensílio" + tipoUtensilio;
    }

}
