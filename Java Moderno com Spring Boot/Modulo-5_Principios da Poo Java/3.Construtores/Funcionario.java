public class Funcionario {
    String nome;
    String cargo;
    int idade;

    Funcionario(String nome, String cargo, int idade) {
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
    }

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Emerson Oliveira", "Desenvolvedor Backend Java", 40);
        //funcionario1.nome = "Emerson Oliveira";
        //funcionario1.cargo = "Desenvolvedor Backend Java";
        //funcionario1.idade = 40;

        Funcionario funcionario2 = new Funcionario("Daniela Oliveira", "Desenvolvedor Frontend Javascript / Angular", 35);
        //funcionario2.nome = "Daniela Oliveira";
        //funcionario2.cargo = "Desenvolvedor Frontend Javascript / Angular";
        //funcionario2.idade = 35;

        System.out.println("Nome: " + funcionario1.nome);
        System.out.println("Cargo: " + funcionario1.cargo);
        System.out.println("Idade: " + funcionario1.idade + "\n");

        System.out.println("Nome: " + funcionario2.nome);
        System.out.println("Cargo: " + funcionario2.cargo);
        System.out.println("Idade: " + funcionario2.idade);
    }
}
