public class Sistema {

    private static void exibirMenu() {

        System.out.println("\nCADASTRO DE PERSONAGEM - MENU");
        System.out.println("1) Cadastrar Cavaleiro");
        System.out.println("2) Cadastrar Mago");
        System.out.println("3) Cadastrar Sacerdote");
        System.out.println("4) Listar todos os Personagens");
        System.out.println("5) Listar todos os Cavaleiros");
        System.out.println("6) Listar todos os Magos");
        System.out.println("7) Listar todos os Sacerdotes");
        System.out.println("8) Remover Personagem");
        System.out.println("0) Sair");
        System.out.print("Informe uma opção:");

    }

    private static void verificarOpcao(int op) {

        String nome;
        float vida;
        float forca;

        switch (op) {
            case 1:

                System.out.println("\nCADASTRO DE CAVALEIRO:");
                // leitura dos dados
                System.out.print("Nome: ");
                nome = Console.lerString();
                System.out.print("Vida: ");
                vida = Console.lerFloat();
                System.out.print("Força: ");
                forca = Console.lerFloat();
                System.out.print("Aurea: ");
                float aurea = Console.lerFloat();

                // instância temporária de Cavaleiro:
                Cavaleiro cavaleiro = new Cavaleiro(nome, vida, forca, aurea);

                // Adicionar cavaleiro na lista de personagens:
                CadastroPersonagem.cadastrar(cavaleiro);

                // Sucesso:
                System.out.println("\nCavaleiro cadastrado com sucesso!");

                break;

            case 2:

                System.out.println("\nCADASTRO DE MAGO:");
                // leitura dos dados
                System.out.print("Nome: ");
                nome = Console.lerString();
                System.out.print("Vida: ");
                vida = Console.lerFloat();
                System.out.print("Força: ");
                forca = Console.lerFloat();
                System.out.print("Mana: ");
                float mana = Console.lerFloat();

                // instância temporária de Mago:
                Mago mago = new Mago(nome, vida, forca, mana);

                // Adicionar mago na lista de personagens:
                CadastroPersonagem.cadastrar(mago);

                // Sucesso:
                System.out.println("\nMago cadastrado com sucesso!");

                break;

            case 3:

                System.out.println("\nCADASTRO DE SACERDOTE:");
                // leitura dos dados
                System.out.print("Nome: ");
                nome = Console.lerString();
                System.out.print("Vida: ");
                vida = Console.lerFloat();
                System.out.print("Força: ");
                forca = Console.lerFloat();
                System.out.print("Fé: ");
                float fe = Console.lerFloat();

                // instância temporária de Sacerdote:
                Sacerdote sacerdote = new Sacerdote(nome, vida, forca, fe);

                // Adicionar sacerdote na lista de personagens:
                CadastroPersonagem.cadastrar(sacerdote);

                // Sucesso:
                System.out.println("\nSacerdote cadastrado com sucesso!");

                break;

            case 4:

                if (CadastroPersonagem.getListaPersonagens().size() == 0) {
                    System.out.println("Não há personagens cadastrados...");
                    break;
                }

                System.out.println("\nPERSONAGENS CADASTRADOS:");
                for (Personagem tempPersonagem : CadastroPersonagem.getListaPersonagens()) {
                    System.out.println(tempPersonagem);
                }

                break;

            case 5:

                System.out.println("\nCAVALEIROS CADASTRADOS:");

                for (Personagem tempPersonagem : CadastroPersonagem.getCavaleiros()) {
                    System.out.println(tempPersonagem);
                }

                break;

            case 6:

                System.out.println("\nMAGOS CADASTRADOS:");
                for (Personagem tempPersonagem : CadastroPersonagem.getListaPersonagens()) {

                    if (tempPersonagem instanceof Mago) {
                        System.out.println(tempPersonagem);
                    }

                }

                break;

            case 7:

                System.out.println("\nSACERDOTE CADASTRADOS:");
                for (Personagem tempPersonagem : CadastroPersonagem.getListaPersonagens()) {

                    if (tempPersonagem instanceof Sacerdote) {
                        System.out.println(tempPersonagem);
                    }

                }

                break;
            case 8:

                System.out.println("\nREMOVER PERSONAGEM");
                System.out.print("Informe o nome do personagem: ");
                nome = Console.lerString();

                // tenta excluir personagem com base no nome
                // informada. O método abaixo retornará true, caso
                // tenha excluído o personagem, e false, caso não.
                if (CadastroPersonagem.excluir(nome)) {
                    System.out.println("\nPersonagem foi removido com sucesso!");
                } else {
                    System.out.println("\nPersonagem " + nome + " não localizado no cadastro");
                }

                break;

            case 0:

                System.out.println("\nO Sistema foi finalizado...");
                break;

            default:
                System.out.println("\nOpção inválida. Digite novamente.");
                break;
        }

        System.out.println();

    }

    public static void executar() {

        int op;

        do {

            exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op);

        } while (op != 0);

    }

}
