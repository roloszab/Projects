package box;

public class Alkalmazott {
	private String nev;
	private int fizetes;
	
	public Alkalmazott(String nev, int fizetes) {
		super();
		this.nev = nev;
		this.fizetes = fizetes;
	}
	public void novel(int nov){
		fizetes = fizetes + nov; 
	}
	public String toString(){
		return nev + " , " + fizetes;
	}
	public void setnev(String nev){
		this.nev = nev;
	}
	public void setfizetes(int fizetes){
		this.fizetes = fizetes;
	}
	public boolean Hatarok(int also, int felso){
		if(fizetes >= also && fizetes <= felso)
			return true;
		else
			return false;
	}
	public boolean Nagyobb(Alkalmazott masik){
		return fizetes > masik.fizetes;
	}
}