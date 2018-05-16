package alap;

import alap.Teglalap;

public class TeglalapProba {

	public static void main(String[] args) {
		Teglalap e = new Teglalap(4,5);
		Teglalap r = new Teglalap(6,7);
		Teglalap c = e;
		
		System.out.println(e.toString());
		System.out.println(r.toString());
		System.out.println(c.toString());
	}

}
