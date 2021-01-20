package pl.coderslab.ckontrolaprzeplywu;

public class Main10 {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n; k++) {
                if (k <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(k);
                }
            }
            System.out.print("\n");
        }
        n = 1;
        for (int i = 5; i >= n; i--) {
            for (int k = 5; k >= n; k--) {
                if (k >= i) {
                    System.out.print(k);
                } else {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
    }
}





