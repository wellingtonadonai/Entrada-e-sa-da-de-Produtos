package Aplicacao;

import Aplicacao.EntradaeSaidadeProdutos.Produto;

import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // Define a localidade padrão como US para utilizar o ponto como separador decimal

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Criação de um objeto Produto vazio

        Produto p = new Produto();

        // Coleta de dados de entrada do usuário
        System.out.println("Entrada de Produto");
        System.out.println("Nome: ");
        String name = sc.nextLine();  // Recebe o nome do produto
        System.out.println("Preço: ");
        double preco = sc.nextDouble(); // Recebe o preço do produto

        // Instancia um novo objeto Produto com os dados fornecidos
        Produto produto = new Produto(name, preco);

        // Exibe os dados do produto adicionado
        System.out.println("produto adicionado: " + produto);
        System.out.println();

        // Entrada da quantidade de produtos a ser adicionada ao estoque
        System.out.println("Entre com a quantidade de produto a ser colocado no estoque:");
        int quantidade = sc.nextInt();
        produto.addProdutos(quantidade); // Adiciona a quantidade ao estoque

        // Exibe o produto com a quantidade atualizada

        System.out.println("produto atualizado: " + produto);
        System.out.println();

        // Entrada da quantidade de produtos a ser removida do estoque
        System.out.println("Entre com a quantidade de produto a ser retirado do estoque:");
        quantidade = sc.nextInt();
        produto.removeProdutos(quantidade); // Remove a quantidade do estoque

        // Exibe o produto após a remoção de itens do estoque
        System.out.println("produto removido: " + produto);
        System.out.println();

        // Fecha o scanner
        sc.close();
    }
}


