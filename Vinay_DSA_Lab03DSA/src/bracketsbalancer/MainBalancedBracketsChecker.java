package bracketsbalancer;


public class MainBalancedBracketsChecker {
    public static void main(String[] args) {
        String bracketsExpression = "([[{}]])";
        String bracketsExpression1 = "([[{]]])";

        new BalancedBracketsChecker(bracketsExpression).check();

        new BalancedBracketsChecker(bracketsExpression1).check();

    }
}
