public class Funcionario {
    String nome;
    String cargo;
    int idade;

    Funcionario(String nome, String cargo, int idade) {
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
    }

    Funcionario() {}

    public static void main(String[] args) {
        //Funcionario funcionario1 = new Funcionario("Emerson Oliveira", "Desenvolvedor Backend Java", 40);
        Funcionario funcionario1 = new Funcionario();
        funcionario1.nome = "Emerson Oliveira";

        System.out.println("Nome : " + funcionario1.nome);
        System.out.println("Cargo : " + funcionario1.cargo);
        System.out.println("Idade : " + funcionario1.idade);

        Funcionario funcionario2 = new Funcionario("Daniela Oliveira", "Desenvolvedora Frontend Javascript / Angular", 35);

        System.out.println("Nome : " + funcionario2.nome);
        System.out.println("Cargo : " + funcionario2.cargo);
        System.out.println("Idade : " + funcionario2.idade);
    }
}
