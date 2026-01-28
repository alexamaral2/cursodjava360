public class TernaryIf {

    public static void main(String[] args) {

        int age = 15;
//        String text;
//
//        if (age >= 18) {
//            text = "Maior de idade";
//        } else {
//            text = "Menor de idade";
//        }

        String text = age >= 18 ? "Maior de idade" : "Menor de idade";
        System.out.println(text);
    }
}
