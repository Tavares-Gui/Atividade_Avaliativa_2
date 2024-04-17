public class Laticinios extends Produto{

    private String tipoLaticinios;
    private String origemQueijo;
    
//constructors
    public String getOrigemQueijo() {
        return origemQueijo;
    }

    public Laticinios(String nome, float preco, int quantidadeEstoque, String dataValidade, int codigo,
            String tipoLaticinios, String origemQueijo) {
        super(nome, preco, quantidadeEstoque, dataValidade, codigo);
        this.tipoLaticinios = tipoLaticinios;
        this.origemQueijo = origemQueijo;
    }

    public Laticinios(String tipoLaticinios, String origemQueijo) {
        this.tipoLaticinios = tipoLaticinios;
        this.origemQueijo = origemQueijo;
    }

//getters - setters
    public void setOrigemQueijo(String origemQueijo) {
        this.origemQueijo = origemQueijo;
    }

    public String getTipoLaticinios() {
        return tipoLaticinios;
    }

    public void setTipoLaticinios(String tipoLaticinios) {
        this.tipoLaticinios = tipoLaticinios;
    }

    
    @Override
    public String toString() {
        return super.toString() + "\nOrigem do queijo" + origemQueijo + "\nTipo do laticínio" + tipoLaticinios;
    } 
    
    
}
