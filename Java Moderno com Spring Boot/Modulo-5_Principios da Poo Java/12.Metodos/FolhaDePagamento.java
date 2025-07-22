import code85.dados.*;

public class FolhaDePagamento {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Emerson", 4800.00);
        System.out.println(funcionario.obterInformacao());
    }
}
