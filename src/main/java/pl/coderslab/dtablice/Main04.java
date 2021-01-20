package pl.coderslab.dtablice;

public class Main04 {

	public static void main(String[] args) {
		int[] numbers = {4, 643, 112, 9999, 69};
		int sum0dd = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0)
				System.out.println(numbers[i]);
			if (numbers[i] % 2 != 0)
				sum0dd = sum0dd + numbers[i];
		}
		System.out.println("SUMA:"+" "+sum0dd);
		{
		}
	}
}





