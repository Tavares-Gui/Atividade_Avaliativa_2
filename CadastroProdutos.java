import java.util.ArrayList;
import java.util.List;

public class CadastroProdutos {
    
    //criando a lista
    private static List<Produto> produtosLista = new ArrayList<>();

    //p cadastrar o produto na arraylist
    public static void cadastrar(Produto func){
        produtosLista.add(func);
    }

    public static List<Produto> getlistaProdutos(){
        return produtosLista;
    }

    //cadastrar frutas
    public static List<Produto> getFrutas() {
        List<Produto> tempList = new ArrayList<>();

        for(Produto tempFunc: produtosLista) {
            if (tempFunc instanceof Frutas) {
                tempList.add(tempFunc);
            }
        }

        return tempList;
    }

    //cadastrar laticinios
    public static List<Produto> getLaticinios() {
        List<Produto> tempList = new ArrayList<>();

        for(Produto tempFunc: produtosLista) {
            if (tempFunc instanceof Laticinios) {
                tempList.add(tempFunc);
            }
        }

        return tempList;
    }


    //p excluir o produto da lista 
    public static boolean excluir(int codigo) {

        for (Produto tempProduto : produtosLista){
            if (tempProduto.getCodigo() == codigo) {
                produtosLista.remove(tempProduto);
                return true;
            }
        }

        return false;

    }
}
