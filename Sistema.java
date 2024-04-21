public class Sistema {


    private static void exibirMenu() {
        System.out.println("\nSEJA BEM VINDO AO MENU!");
        System.out.println("\nDigite a opção escolhida: ");

        System.out.println("1) Cadastrar Laticínios");
        System.out.println("2) Cadastrar Utensilios");
        System.out.println("3) Cadastrar Frutas");

        System.out.println("4) Listar Laticínios");
        System.out.println("5) Listar Utensilios");
        System.out.println("6) Listar Frutas");
        System.out.println("7) Listar todos os Produtos");

        System.out.println("8) Buscar Produto");
        System.out.println("9) Excluir Produto");

        System.out.println("0) Sair");
    }


    private static void opcaoMenu (int op){

        String nome;
        float preco;
        int quantidadeEstoque;
        String dataValidade;
        int codigo;
         
        switch (op) {
            case 1:     //queijos - cadastro
            System.out.println("\nInicializando o cadastro de Laticínios:");
            System.out.println("\nDigite o nome: ");
            nome = Console.lerString();
            System.out.println("\nDigite o preço do Produto");
            preco = Console.lerFloat();
            System.out.println("\n Digite a quantidade no estoque:");
            quantidadeEstoque = Console.lerInt();
            System.out.println("\nDigite a data de validade:");
            dataValidade = Console.lerString();
            System.out.println("\nDigite o código do produto:");
            codigo = Console.lerInt();
            //atributos somente do laticínio...
            System.out.println("\nDigite o tipo de laticínio");
            String tipoLaticinios =  Console.lerString();
            System.out.println("\nDigite a origem do queijo: ");
            String origemQueijo = Console.lerString();

            Laticinios Laticinios1 = new Laticinios(nome, preco, quantidadeEstoque, dataValidade, codigo, tipoLaticinios, origemQueijo);
            
            CadastroProdutos.cadastrar(Laticinios1);
            break;
            
            case 2:     //utensilios - cadastro
            System.out.println("\nInicializando o cadastro de Utensílios:");
            System.out.println("\nDigite o nome: ");
            nome = Console.lerString();
            System.out.println("\nDigite o preço do Produto");
            preco = Console.lerFloat();
            System.out.println("\n Digite a quantidade no estoque:");
            quantidadeEstoque = Console.lerInt();
            System.out.println("\nDigite a data de validade:");
            dataValidade = Console.lerString();
            System.out.println("\nDigite o código do produto:");
            codigo = Console.lerInt();
            //atributos dos utensilios...
            System.out.println("\nDigite o tipo de utensílio:");
            String tipoUtensilio = Console.lerString();

            Utensilio utensilio1 = new Utensilio(nome, preco, quantidadeEstoque, dataValidade, codigo, tipoUtensilio);
            
            CadastroProdutos.cadastrar(utensilio1);
            break;
        
            case 3: //tipo de fruta - cadastro
            System.out.println("\nInicializando o cadastro de Frutas:");
            System.out.println("\nDigite o nome: ");
            nome = Console.lerString();
            System.out.println("\nDigite o preço do Produto");
            preco = Console.lerFloat();
            System.out.println("\n Digite a quantidade no estoque:");
            quantidadeEstoque = Console.lerInt();
            System.out.println("\nDigite a data de validade:");
            dataValidade = Console.lerString();
            System.out.println("\nDigite o código do produto:");
            codigo = Console.lerInt(); 
            //atributos das frutas...
            System.out.println("\nDigite o tipo de fruta:");
            String tipoFruta = Console.lerString();

            Frutas Frutas1 = new Frutas(nome, preco, quantidadeEstoque, dataValidade, codigo);
            
            CadastroProdutos.cadastrar(Frutas1);

            break;

            case 4: 
            //listar laticinios
            break;
            
            case 5:
            //listar utensilios
            break;

            case 6:
            //listar frutas
            break;

            case 7: 
            //listar todos os produtos
            break;

            case 8:
            //buscar produto
            break;

            case 9: //excluir produto

            System.out.print("\nInforme o código do produto a ser removido: ");
            codigo = Console.lerInt();

            if (CadastroProdutos.excluir(codigo)){
                System.out.println("\nProduto do código" + codigo +"removido com sucesso!");
            } else {
                System.out.println("\nFuncionário " + codigo + " não localizado no sistema de cadastro");
            }
            break;

            case 0:
            System.out.println("\nSistema encerrado. Obrigado(a)!");
            break;

            default:
            System.out.println("Opção Inválida. Favor tentar novamente...");
                break;
        }
    }


    public static void Execucao() {

        int op;

        do {

            exibirMenu();
            op = Console.lerInt();
            opcaoMenu(op);

        } while (op != 0);

    }



}
