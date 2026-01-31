import java.util.Scanner;

public class ExAverageWithInput {
    public static void main(String[] args) {

        var scanner =  new Scanner(System.in);
        int n = 1;
        double sum = 0.0;

        while (true) {
            System.out.println("Digite a nota " + n + " : ");
            String line = scanner.nextLine();

            if (line.isBlank()) {
                n--;
                break;
            }

            sum += Double.parseDouble(line);
            n++;
        }

        double avg = sum / n;
        System.out.println(n + " notas fornecida(s)");
        System.out.println("A média é " + avg);
    }
}
