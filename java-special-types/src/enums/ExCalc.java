package enums;

public class ExCalc {

    public interface Calculator {
        double calculate(double a, double b);
    }

    public enum Operational implements Calculator {
        SUM('+'){
            @Override
            public double calculate(double n1, double n2) {
                return n1 + n2;
            }
        },
        SUBTRACT('-'){
            @Override
            public double calculate(double n1, double n2) {
                return n1 - n2;
            }
        },
        MULTIPLY('*'){
            @Override
            public double calculate(double n1, double n2) {
                return n1 * n2;
            }
        },
        DIVIDE('/'){
            @Override
            public double calculate(double n1, double n2) {
                return n1 / n2;
            }
        };

        private final char symbol;

        private Operational(char symbol) {
            this.symbol = symbol;
        }

        @Override
        public String toString() {
            return String.valueOf(symbol);
        }
    }

    public static void main(String[] args) {
        System.out.println(Operational.SUM);

        System.out.println(Operational.MULTIPLY.calculate(4, 3));
        System.out.println(Operational.SUBTRACT.calculate(4, 3));
    }
}
