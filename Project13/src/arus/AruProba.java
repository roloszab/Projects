package arus;

import arus.Aru;
import arus.Kenyer;

public class AruProba {

	public static void main(String[] args) {
		Aru x = new Aru("R�pa", 200, 20);
		System.out.println(x.toString());
		Kenyer y = new Kenyer("C�kla", 250, 20, 5);
		System.out.println(y.toString());
		x.dragabbE(y);
		System.out.println(x.dragabbE(y));
		
		Aru aru2 = new Kenyer("Mogyoro", 200, 20, 3);
		System.out.println(aru2.toString());
		Kenyer keny2 = new Kenyer("Sajt", 300, 20, 2);
		if(Kenyer.nagyobbE((Kenyer)aru2,keny2))
			System.out.println("A legnagyobb �ru: " + aru2.toString());
			else 
			System.out.println("A legnagyobb �ru: " + keny2.toString());
		
	}
}
