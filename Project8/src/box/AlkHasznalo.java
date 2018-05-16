package box;

import java.util.Scanner;
import box.Alkalmazott;

public class AlkHasznalo {

	public static void main(String[] args) {
		Alkalmazott a = new Alkalmazott("Bobi", 500);
		System.out.println(a.toString());
		
		a.novel(1000);
		System.out.println(a.toString());
		a.setnev("Jozsi");
		a.setfizetes(5000);
		System.out.println(a.toString());
		
		Alkalmazott b = new Alkalmazott("Gézu", 1000);
		System.out.println(b.toString());
		System.out.println(b.Nagyobb(a));
		System.out.println(b.Hatarok(999, 1001));
		

	}

}
