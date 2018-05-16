package box;

import box.HangLemez;

public class Lemezek {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		HangLemez a = new HangLemez(null, null, 0);
		a.toString();
		System.out.println(a.toString());
		System.out.println("Adja meg hány hanglemez legyen: ");
		int N = sc.nextInt();
		/*int tomb[] = new int[N];
		for(int i=0;i<N;i++){
			System.out.println();
		}*/
	}

}