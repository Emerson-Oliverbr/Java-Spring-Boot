import code85.dados.Produto;

import java.util.Locale;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Produto produto = new Produto("Notebook", 3800.00, 10);
		System.out.printf("Estoque atual => " + produto.estoqueAtual());
	}
}