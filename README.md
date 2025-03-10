# Aplicação de Gerenciamento de Estoque de Produtos

Este projeto é uma aplicação Java simples para gerenciar o estoque de produtos. Ele permite que o usuário adicione produtos, insira quantidades no estoque, remova produtos e veja as informações atualizadas de estoque e o valor total dos itens armazenados.

## Funcionalidades

- Adicionar um novo produto com nome e preço.
- Adicionar ou remover quantidades do estoque.
- Calcular o valor total dos produtos em estoque.
- Exibir as informações atualizadas do produto, incluindo nome, preço, quantidade e valor total no estoque.

## Estrutura de Código

### 1. Classe `App`

Esta classe contém o método principal (`main`), que interage com o usuário via terminal. Ela permite que o usuário insira as informações de um produto (nome e preço), adicione ou remova quantidades do estoque e exiba o estado atualizado do produto.

#### Principais funções:
- Solicita ao usuário o nome e preço do produto.
- Permite a inserção e remoção de quantidades de produtos no estoque.
- Exibe o produto com suas informações atualizadas no final.

#### Exemplo de execução:
```bash
Entrada de Produto
Nome: Caneta
Preço: 1.50
produto adicionado: Caneta, $ 1.50, 0 unidades, total: $ 0.00

Entre com a quantidade de produto a ser colocado no estoque:
100
produto atualizado: Caneta, $ 1.50, 100 unidades, total: $ 150.00

Entre com a quantidade de produto a ser retirado do estoque:
20
produto removido: Caneta, $ 1.50, 80 unidades, total: $ 120.00
```

### 2. Classe `Produto`

A classe `Produto` define o modelo de um produto com atributos como nome, preço e quantidade no estoque. Ela também contém métodos para gerenciar o estoque (adicionar e remover itens), além de calcular o valor total dos itens no estoque.

#### Principais métodos:
- **Construtores**: Permitem a criação de produtos com ou sem a quantidade inicial definida.
- **getters e setters**: Métodos para acessar e modificar os atributos do produto.
- **totalValorEstoque**: Calcula o valor total com base no preço e na quantidade de produtos no estoque.
- **addProdutos e removeProdutos**: Gerenciam a adição e remoção de produtos no estoque.
- **toString**: Retorna uma descrição textual do produto com informações formatadas.

### Exemplo de código:
```java
Produto produto = new Produto("Caneta", 1.50);
produto.addProdutos(100);  // Adiciona 100 unidades ao estoque
System.out.println(produto);  // Exibe as informações do produto
```

## Como Usar

1. **Clone ou baixe o repositório.**
2. **Compile e execute a classe `App`.**
3. **Siga as instruções no terminal para inserir os dados do produto e gerenciar o estoque.**

### Dependências

- **Java 8+**

### Exemplo de Execução

Execute o seguinte comando no terminal para iniciar a aplicação:

```bash
javac App.java Produto.java
java App
```

A aplicação solicitará que você insira informações do produto e permitirá a gestão do estoque diretamente no terminal.

## Contribuições

Se desejar contribuir para este projeto, sinta-se à vontade para abrir um *pull request* ou relatar problemas na seção de *issues*.


