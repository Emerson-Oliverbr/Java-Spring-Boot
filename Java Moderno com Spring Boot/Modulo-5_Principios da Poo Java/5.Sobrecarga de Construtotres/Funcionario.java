public class Funcionario {
    String nome;
    String cargo;
    int idade;

    Funcionario() {}

    Funcionario(String nome, String cargo, int idade) {
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
    }

    Funcionario(String nome) {
        this.nome = nome;
    }

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        funcionario1.nome = "Emerson Oliveira";

        System.out.println("Nome : " + funcionario1.nome);
        System.out.println("Cargo : " + funcionario1.cargo);
        System.out.println("Idade : " + funcionario1.idade + "\n");

        Funcionario funcionario2 = new Funcionario("Daniela Oliveira", "Desenvolvedora Frontend Javascript / Angular", 35);

        System.out.println("Nome : " + funcionario2.nome);
        System.out.println("Cargo : " + funcionario2.cargo);
        System.out.println("Idade : " + funcionario2.idade + "\n");

        Funcionario funcionario3 = new Funcionario("Laura");

        System.out.println("Nome : " + funcionario3.nome);
        System.out.println("Cargo : " + funcionario3.cargo);
        System.out.println("Idade : " + funcionario3.idade);
    }
}
