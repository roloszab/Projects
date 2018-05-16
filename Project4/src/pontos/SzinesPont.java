package pontos;
	
import java.awt.Color;


import semmi.ISzin;

public class SzinesPont implements ISzin{
	private int x;
	private int y;
	private Color Szin;
	
	public SzinesPont(int x, int y, Color Szin) {
		super();
		this.x = x;
		this.y = y;
		this.Szin = Szin;
	}

	@Override
	public Color getSzin() {
		return this.Szin;
	}

	@Override
	public void setSzinvalt(Color Szin) {
		this.Szin = Szin;
	}

	@Override
	public String toString() {
		return "SzinesPont [x=" + x + ", y=" + y + ", Szin=" + Szin + "]";
	}
	
}

