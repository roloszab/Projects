package szem;

import szem.SzemelyTti;
import java.util.Scanner;

public class TtiProba {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SzemelyTti a = new SzemelyTti("Bobi", 85, 1.78);
		System.out.println(a.toString());
		System.out.println("K�rem az egy�n nev�t: ");
		String nev = sc.nextLine();
		System.out.println("K�rem az egy�n t�meg�t: ");
		int tomeg = Integer.parseInt(sc.nextLine());
		System.out.println("K�rem az egy�n magass�g�t: ");
		double magassag = Double.parseDouble(sc.nextLine());
		System.out.println(nev);
		System.out.println(tomeg);
		System.out.println(magassag);
		sc.close();

	}

}
