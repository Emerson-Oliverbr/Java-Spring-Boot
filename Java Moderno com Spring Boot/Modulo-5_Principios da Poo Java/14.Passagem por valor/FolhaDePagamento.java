import code85.dados.Funcionario;

import java.util.Locale;

public class FolhaDePagamento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Funcionario funcionario = new Funcionario("Emerson", 5000.00);
        System.out.println("Dados: " + funcionario.obterInformacoes());
        funcionario.aumentarSalario(1500.00);
        System.out.println("Dados atualizados: " + funcionario.obterInformacoes());
    }
}
