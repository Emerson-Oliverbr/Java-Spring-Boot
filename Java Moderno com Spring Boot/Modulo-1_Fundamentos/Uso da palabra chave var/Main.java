public class Main {
    public static void main(String[] args) {
        var numero = 10; // inferência automática do tipo int
        var numero2 = numero;
        //var usuario = new Usuario(); //inferência automatica do tipo usuario

        System.out.println("Valor de numero = " + numero);
        System.out.println("Valor de numero2 = " + numero2);
    }
}
