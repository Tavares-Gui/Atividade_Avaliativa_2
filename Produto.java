 public class Produto {

    private String nome;
    private float preco;
    private int quantidadeEstoque;
    private String dataValidade;
    private int codigo;

    
//constructors
    public Produto(String nome, float preco, int quantidadeEstoque, String dataValidade, int codigo) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
        this.dataValidade = dataValidade;
        this.codigo = codigo;
    }

    
    public Produto() {
    }


//getters - setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
    public String getDataValidade() {
        return dataValidade;
    }
    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "\nNome" + nome + "\nPreco" + preco + "\nQuantidade no estoque" + quantidadeEstoque + "Data de validade" + 
        dataValidade + "\nCodigo" + codigo; 
    }
    
 }