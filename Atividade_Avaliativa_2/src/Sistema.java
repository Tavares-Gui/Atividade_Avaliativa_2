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
            case 1:
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


            break;
            
            case 2: 
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
            break;
        
            case 3:
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

            case 9:
            //excluir produto
            break;

            case 0:
            System.out.println("\nSistema encerrado. Obrigado(a)!");
            break;
            /*               
            add conforme exemplo do professor
            // instância temporária de Gerente:
                Gerente gerente = new Gerente(nome, matricula, nomeProjeto);

                // Adicionar gerente na lista de funcionários:
                CadastroFuncionarios.cadastrar(gerente);

                // Sucesso:
                System.out.println("\nGerente cadastrado com sucesso!"); no 1 2 e 3.
                antes tem que fazer a classe CadastroProdutos c array  */

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
