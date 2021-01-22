package pl.coderslab.dtablice;

public class Main07 {

	public static void main(String[] args) {

		double[] temps= {30, 29, 14, 42, -4, -10, 8, 14, 32, 11, 8, 0, 0};
		double srednia=0;
		for (double i = temps[1];i < temps.length; i++) {
			double temps2=(temps[2]*1.8)+32;
			System.out.println(temps2);
		}
	}
}
