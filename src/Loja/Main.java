import Loja.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Estoque estoque = new Estoque();

        System.out.println("=================================================");
        System.out.println("  SEJA BEM-VINDO(A) PARA O CADASTRO DE PRODUTOS  ");
        System.out.println("=================================================");
        System.out.println("  ");

        System.out.println(" O Que Gostaria De Fazer hoje?");
        System.out.println(" Escolha Uma das Opções Abaixo");
        System.out.println("  ");
        while (true) {
            System.out.println("=== Sistema de Cadastro de Produtos ===");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Buscar produto por ID");
            System.out.println("4 - Remover produto");
            System.out.println("0 - Sair");
            System.out.println("  ");
            System.out.print("Escolha uma opção: ");

            int op = sc.nextInt();

            switch (op) {
                case 1:
                    sc.nextLine();
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();
                    System.out.print("Quantidade: ");
                    int qtd = sc.nextInt();

                    Produto novo = new Produto(nome, preco, qtd);
                    estoque.adicionarProduto(novo);
                    System.out.println("Produto cadastrado!");
                    break;

                case 2:
                    estoque.listarProdutos();
                    break;

                case 3:
                    System.out.print("ID do produto: ");
                    Produto encontrado = estoque.buscarPorId(sc.nextInt());
                    if (encontrado != null) {
                        System.out.println(encontrado);
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("ID do produto para remover: ");
                    estoque.removerProduto(sc.nextInt());
                    break;

                case 0:
                    System.out.println("Saindo...");
                    System.out.println("Volte Sempre!");
                    return;

                default:
                    System.out.println("Opção inválida/Não Encontrada! .");
            }
        }
    }
}