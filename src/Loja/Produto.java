package Loja;

public class Produto {

    private static int contador = 1;
    private int id;
    private String nome;
    private double preco;
    private int quantidade_no_estoque;

    public Produto(String nome, double preco, int quantidade_no_estoque) {
        this.id = contador++;
        this.nome = nome;
        this.preco = preco;
        this.quantidade_no_estoque = quantidade_no_estoque;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade_no_estoque() {
        return quantidade_no_estoque;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade_no_estoque(int quantidade_no_estoque) {
        this.quantidade_no_estoque = quantidade_no_estoque;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                " | Nome: " + nome +
                " | Preço: R$ " + preco +
                " | Estoque: " + quantidade_no_estoque;
    }
}