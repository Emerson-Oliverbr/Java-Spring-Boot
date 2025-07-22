package code85.dados;

public class Produto {
	private String nome;
	private double preco;
	private int quantidadeEmEstoque;

	public Produto(String nome, double preco, int quantidadeEmEstoque) {
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}

	public String estoqueAtual() {		
		return "Nome: " + nome + " , Quantidade = " + quantidadeEmEstoque + " Preco R$ " + String.format("%.2f", preco);
	}
}