package masik;

import sajat.elso.Szam;

public class SzamProba {

	public static void main(String[] args) {
		/*java.util.Scanner sc = new java.util.Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());*/
		final Szam sz = new Szam(0.7);
		int db = 0;
		double gen;
		do{
			db++;
			gen = Math.random();
			System.out.println(gen);
		}while (!sz.egyezikE(gen));
		System.out.println(db);
			
		sz.setX(0.8);
		System.out.println(sz.getX());
		
		
	}

}
