package assignment7.lambdas;

public class Calculator {

    public static void main(String[] args) {
        double a = 10, b = 5;
        double c = calc(a, b, Operator.PLUS);
        System.out.println(c);
        double d = calc(c, b, Operator.MULTIPLY);
        System.out.println(d);
        System.out.println(calc(d, a, Operator.DIVIDE));
    }

    public static double calc(double x, double y, Operator operation) {
        return operation.getFunction().apply(x,y);
    }
}
