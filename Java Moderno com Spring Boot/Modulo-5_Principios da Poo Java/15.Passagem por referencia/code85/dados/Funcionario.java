package code85.dados;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;        
    }

    public String obterInformacoes() {
        return "Nome " + nome + ", Salario R$ " + String.format("%.2f",salario);
    }

    public void aumentarSalario(double aumento) {
        salario += aumento;
    }

    public void alterarQualquerSalario(Funcionario func, double novoSalario) {
        func.salario = novoSalario;
    }
}
