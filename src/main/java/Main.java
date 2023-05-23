import org.example.Ints;
import org.example.IntsCalculator;

public class Main {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(2, 2));
        System.out.println(intsCalc.sum(11, 22));
        System.out.println(intsCalc.sub(22, 2));
        System.out.println(intsCalc.div(10, 5));
        System.out.println(intsCalc.mult(4, 2));
        System.out.println(intsCalc.pow(10, 2));
    }
}