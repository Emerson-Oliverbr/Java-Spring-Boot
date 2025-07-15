public class Main {
    public static void main(String[] args) {

        String dia = "Sabadop";

        String tipoDeDia = switch (dia) {
            case "Seg", "Ter", "Quar", "Quin", "Sext" -> "Dia util";
            case "Sabado", "Domingo" -> "Fim de semana";
            default -> "Dia Inválido";
        };
        System.out.println(tipoDeDia);
    }
}
