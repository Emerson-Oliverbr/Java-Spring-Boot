public class Funcionario {
    String nome;
    String cargo;
    int idade;

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        funcionario1.nome = "Emerson Oliveira";
        funcionario1.cargo = "Desenvolvedor Backend Java";
        funcionario1.idade = 40;

        Funcionario funcionario2 = new Funcionario();
        funcionario2.nome = "Daniela Oliveira";
        funcionario2.cargo = "Desenvolvedor Frontend Javascript / Angular";
        funcionario2.idade = 35;

        System.out.println("Nome: " + funcionario1.nome);
        System.out.println("Cargo: " + funcionario1.cargo);
        System.out.println("Idade: " + funcionario1.idade + "\n");

        System.out.println("Nome: " + funcionario2.nome);
        System.out.println("Cargo: " + funcionario2.cargo);
        System.out.println("Idade: " + funcionario2.idade);
    }
}
