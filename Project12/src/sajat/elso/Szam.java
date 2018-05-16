package sajat.elso;

public class Szam {
	
	public static double tures = 0.001;
	
	private double x;

	public Szam(double x) {
		super();
		this.x = x;
	}
	public boolean egyezikE(double masik){
		return Math.abs(this.x - masik) < tures;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
}
