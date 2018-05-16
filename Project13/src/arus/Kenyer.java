package arus;

public class Kenyer extends Aru {
	private double mennyiseg;
	
	public Kenyer(String nev, int nettoar, int afakulcs, double mennyiseg) {
		super(nev, nettoar, afakulcs);
		this.mennyiseg = mennyiseg;
	}

	@Override
	public String toString() {
		return "Kenyer [" + super.toString() + " , " + bruttoar()/mennyiseg + "]";
	}

	public double getMennyiseg() {
		return mennyiseg;
	}
	public static boolean nagyobbE (Kenyer a, Kenyer b){
		return (a.bruttoar()/a.mennyiseg) > (b.bruttoar()/b.mennyiseg);
	}
}
