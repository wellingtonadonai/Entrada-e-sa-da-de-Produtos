package Aplicacao.EntradaeSaidadeProdutos;

public class Produto {

    // Atributos privados da classe Produto

    private String name;    // Nome do produto
    private double preco;   // Preço do produto
    private int quantidade; // Quantidade do produto em estoque

    // Construtor padrão (sem parâmetros)

    public Produto() {
    }

    // Construtor que inicializa todos os atributos (nome, preço e quantidade)
    public Produto(String name, double preco, int quantidade) {
        this.name = name;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Construtor que inicializa apenas o nome e o preço (quantidade será 0 por padrão)
    public Produto(String name, double preco) {
        this.name = name;
        this.preco = preco;
    }

    // Getter para o nome do produto
    public String getName() {
        return name;
    }

    // Setter para o nome do produto
    public void setName(String name) {
        this.name = name;
    }

    // Getter para o preço do produto
    public double getPreco() {
        return preco;
    }

    // Setter para o preço do produto
    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Getter para a quantidade de produtos no estoque
    public int getQuantidade() {
        return quantidade;
    }

    // Método que calcula o valor total em estoque (preço * quantidade)
    public double totalValorEstoque() {
        return preco * quantidade;
    }

    // Método para adicionar produtos ao estoque
    public void addProdutos(int quantidade) {
        this.quantidade += quantidade;
    }

    // Método para remover produtos do estoque
    public void removeProdutos(int quantidade) {
        this.quantidade -= quantidade;
    }

    // Método toString que retorna uma representação textual do produto
    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", preco)
                + ", "
                + quantidade
                + " unidades, total: $ "
                + String.format("%.2f", totalValorEstoque());
    }
}