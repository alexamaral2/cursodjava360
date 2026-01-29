public class RepeatWhileDoWhile {
    public static void main(String[] args) {

        System.out.println("While");
        int i = 0;

        while(i < 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("Fim");

        System.out.println("DO..While");
        int j = 0;

        do {
            System.out.println(j);
            j++;
        } while (j <= 10);
    }
}
