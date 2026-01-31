import java.util.Scanner;

public class ExTabuada {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para gerar a tabuada: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 10; i++) {
            System.out.println( n + " x " + i + " = " + (n * i));
        }

        scanner.close();
    }
}
