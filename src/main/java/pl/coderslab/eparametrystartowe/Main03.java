package pl.coderslab.eparametrystartowe;

import java.sql.SQLOutput;

public class Main03 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
        int e = Integer.parseInt(args[4]);
        double suma=0.0;
        double srednia=0.0;
        suma=(a+b+c+d+e);
        srednia=suma/5;
        System.out.println(srednia);




    }
}

