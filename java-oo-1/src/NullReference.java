public class NullReference {
    public static void main(String[] args)  {

        Account a = new Account();
        if (a != null) {
            a.printBalance();
        } else {
            System.out.println("nulo");
        }
    }
}
