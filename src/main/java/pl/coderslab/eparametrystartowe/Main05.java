package pl.coderslab.eparametrystartowe;

public class Main05 {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int points = a;
        {
            if (a >= 0) ;
            else
                System.out.println("BADVALUE");
        }
        {
            if (a <= 100) ;
            else
                System.out.println("BADVALUE");
        }
        {
            if (a <= 50) ;
            else if (a >= 0) ;
            System.out.println("F");
        }



    }
}
