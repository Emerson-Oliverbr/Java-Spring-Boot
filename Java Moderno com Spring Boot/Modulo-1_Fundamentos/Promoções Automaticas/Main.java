public class Main {
    public static void main(String[] args) {
        byte a = 10;
        int b = a + 5; // a é promovido para int antes do calculo

        System.out.println("Valor de a = " + a);

        int x = 10;
        float y = 1.5f;
        float z = x * y; // x é promovido para float antes do calculo

        System.out.println("Valor de z = " + z);

        int n1 = 10;
        double n2 = 1.5;
        double n3 = n1 * n2;
        System.out.println("Valor de n3 = " + n3);
     }
}
