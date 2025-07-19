public class Carro {
    String marcaDoCarro;
    String modeloDoCarro;
    int anoDoCarro;

    Carro() {}

    Carro(String marcaDoCarro, String modeloDocarro) {
        this.marcaDoCarro = marcaDoCarro;
        this.modeloDoCarro = modeloDocarro;
    }

    Carro(String marcaDoCarro, String modeloDoCarro, int anoDoCarro) {
        this.marcaDoCarro = marcaDoCarro;
        this.modeloDoCarro = modeloDoCarro;
        this.anoDoCarro = anoDoCarro;
    }


    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.marcaDoCarro = "Chevrolet";
        carro1.modeloDoCarro = "Monza";

        System.out.println("Marca do carro: " + carro1.marcaDoCarro);
        System.out.println("Modelo do carro: " + carro1.modeloDoCarro);
        System.out.println("Ano do carro: " + carro1.anoDoCarro + "\n");

        Carro carro2 = new Carro("Fiat", "Argo");

        System.out.println("Marca do carro: " + carro2.marcaDoCarro);
        System.out.println("Modelo do carro: " + carro2.modeloDoCarro);
        System.out.println("Ano do carro: " + carro2.anoDoCarro + "\n");

        Carro carro3 = new Carro("Hyundai", "HB20-X", 2025);

        System.out.println("Marca do carro: " + carro3.marcaDoCarro);
        System.out.println("Modelo do carro: " + carro3.modeloDoCarro);
        System.out.println("Ano do carro: " + carro3.anoDoCarro);
    }
}
