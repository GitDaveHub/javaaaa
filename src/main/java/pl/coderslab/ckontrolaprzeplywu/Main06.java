package pl.coderslab.ckontrolaprzeplywu;

public class Main06 {

	public static void main(String[] args) {

		int n = 6;
		int i=0;
		for (i = 0; i<=n; i++) {
			System.out.println( i + "-" + (i % 2 == 0 ? "Parzysta" : "Nieparzysta"));
		}
		i=0;
		        while((i++)<=n){
		            System.out.println(i +"-" + (i % 2 ==0? "Parzysta":"Nieparzysta"));
		        }
		}

	}




