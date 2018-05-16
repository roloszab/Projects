package box;

public class HangLemez {
	private String eloado;
	private String cim;
	private int hossz;
	
	public HangLemez(String eloado, String cim, int hossz) {
		super();
		this.eloado = eloado;
		this.cim = cim;
		this.hossz = hossz;
	}
	public String toString(){
		return eloado + " , " + cim + " , " + hossz;
	}
	public int nagyobb(HangLemez masik){
		if(hossz > masik.hossz)
			return 1;
		else if(hossz < masik.hossz)
			return -1;
		else 
			return 0;
	}

}
