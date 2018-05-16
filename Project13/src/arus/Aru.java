package arus;

public class Aru {
	private String nev;
	private int nettoar;
	private int afakulcs;
	
	public Aru(String nev, int nettoar, int afakulcs) {
		super();
		this.nev = nev;
		this.nettoar = nettoar;
		this.afakulcs = afakulcs;
	}
	public int bruttoar(){
		return (int)Math.round(nettoar + (nettoar/100*afakulcs));
	}
	@Override
	public String toString() {
		return "Aru [nev=" + nev + ", bruttoar=" + bruttoar() + "]";
	}
	public void novel(int szazalek){
		nettoar = nettoar + (nettoar/100*szazalek);
	}
	public int dragabbE(Aru masik){
		if(bruttoar() > masik.bruttoar())
			return 1;
		else if(bruttoar() == masik.bruttoar())
			return 0;
		else
			return -1;
	}
	
	
}
