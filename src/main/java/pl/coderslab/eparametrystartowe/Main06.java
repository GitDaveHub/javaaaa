package pl.coderslab.eparametrystartowe;

import java.util.Scanner;

public class Main06 {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int mnozenie = 0;
        int wynik = 0;
        for (; n <= 3; n++) {
            for (int m = n; m <= 3; m++) {
                int a = m * n;
                System.out.println(a);

            }
        }
    }
}
