package szem;

import szem.SzemelyTti;
import java.util.Scanner;

public class TtiProba {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SzemelyTti a = new SzemelyTti("Bobi", 85, 1.78);
		System.out.println(a.toString());
		System.out.println("Kérem az egyén nevét: ");
		String nev = sc.nextLine();
		System.out.println("Kérem az egyén tömegét: ");
		int tomeg = Integer.parseInt(sc.nextLine());
		System.out.println("Kérem az egyén magasságát: ");
		double magassag = Double.parseDouble(sc.nextLine());
		System.out.println(nev);
		System.out.println(tomeg);
		System.out.println(magassag);
		sc.close();

	}

}
