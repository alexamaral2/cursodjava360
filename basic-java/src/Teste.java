import java.util.Scanner;

public class Teste {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor = Integer.parseInt(sc.nextLine());

        System.out.println("---");
        for (int i = 1; i <= valor; i++) {
            System.out.println(valor + " x " + i + " = " + (valor * i));
        }
        sc.close();
    }
}