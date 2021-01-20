package pl.coderslab.ckontrolaprzeplywu;

public class Main09 {

    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n; k++) {
                if (k >= i+1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }





    }
}