package pl.coderslab.eparametrystartowe;

public class Main07 {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int factorial = 1;

        for (int x = 1; x <= n; x++) {
            factorial *= x;
        }
        System.out.println(factorial);
    }
}
