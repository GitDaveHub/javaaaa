package pl.coderslab.ckontrolaprzeplywu;

public class Main05 {

	public static void main(String[] args) {
		int resultFor = 0;
		int resultWhile = 0;
		for (int i = 1; i <= 10; i++) {
			resultFor += i; }
		System.out.print(resultFor);
		System.out.println("\t");{
			int x = 0;
			while (x < 10){
				x++;
				resultWhile += x; }
			System.out.print(resultWhile);
		}
	}
}


















