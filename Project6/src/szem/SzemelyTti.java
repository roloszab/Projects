package szem;

public class SzemelyTti {
	private String nev;
	private int tomeg;
	private double magassag;
	
	public SzemelyTti(String nev, int tomeg, double magassag) {
		super();
		this.nev = nev;
		this.tomeg = tomeg;
		this.magassag = magassag;
	}
	public double tti(){
		return tomeg/(magassag*magassag);
	}
	public String Alkat(){

		if(tti()<20)
			return "Sovány";
		if(tti()>30)
			return "Kövér";
		else
			return "Normál";	
	}
	public String toString() {
		return  nev + " , "+ tomeg + " , "+ magassag + " , " + Alkat() + " , " + tti();
	}
}
