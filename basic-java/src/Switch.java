public class Switch {
    public static void main(String[] args) {
        int month = 13;
        int days = 0;

        switch (month) {
            case 1:
                days = 31;
                break;
            case 2:
                days = 28;
                break;
            case 3:
                days = 31;
                break;
            case 4:
                days = 30;
                break;
        }

        System.out.println(days + " dias");
    }
}
