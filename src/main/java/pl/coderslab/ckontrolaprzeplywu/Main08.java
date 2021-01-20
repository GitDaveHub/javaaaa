package pl.coderslab.ckontrolaprzeplywu;

public class Main08 {

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
    }
}

