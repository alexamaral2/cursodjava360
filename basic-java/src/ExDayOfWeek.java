public class ExDayOfWeek {
    public static void main(String[] args) {

        int n = 2;
        String down = switch (n) {
            case 1 -> "DOMINGO";
            case 2 -> "SEGUNDA";
            case 3 -> "TERÇA";
            case 4 -> "QUARTA";
            case 5 -> "QUINTA";
            case 6 -> "SEXTA";
            case 7 -> "SABADO";
            default -> "INVALIDO";
        };

        System.out.println(down);
    }
}
