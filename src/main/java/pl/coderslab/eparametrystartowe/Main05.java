package pl.coderslab.eparametrystartowe;

public class Main05 {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int points = Integer.parseInt(args[0]);
        if (points < 0) System.out.print("BADVALUE");
        else if (points > 100) System.out.print("BADVALUE");
        else if (points <= 50) System.out.print("F");
        else if (points <= 70) System.out.print("E");
        else if (points <= 90) System.out.print("C");
        else System.out.print("A");
    }
}
