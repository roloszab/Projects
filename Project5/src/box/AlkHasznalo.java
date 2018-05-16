package box;

import box.Alkalmazott;
public class AlkHasznalo {

	public static void main(String[] args) {
		Alkalmazott a = new Alkalmazott("Józsi" , 500);
		System.out.println(a.Hatarok(300, 600));
		System.out.println(a.toString());
		a.setFizetes(500);
		a.setNev("Bobi");
		System.out.println(a.toString());
		a.FizetesNoveles(2000);
		System.out.println(a.toString());
		
		
		Alkalmazott b = new Alkalmazott("Kenyer", 2501);
		System.out.println(b.toString());
		System.out.println(b.Hatarok(200, 2000));
		
		System.out.println(b.ado());
		
		System.out.println(b.NagyobbE(a));
		
		

	}

}
