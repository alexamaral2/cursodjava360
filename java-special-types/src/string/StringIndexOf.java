package string;

public class StringIndexOf {

    public static void main(String[] args) {

        String str = "Java is the best programming language!";

        int index = str.indexOf("the", 10);
        System.out.println(index);

        int pos2 = str.lastIndexOf("a");
        System.out.println(pos2);
    }
}
