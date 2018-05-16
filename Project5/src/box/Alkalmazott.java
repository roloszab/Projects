package box;

public class Alkalmazott {
	private String nev;
	private int fizetes;
	
	public Alkalmazott(String nev, int fizetes){ 
		super();
		this.nev = nev;
		this.fizetes = fizetes;
	}
	
	public void FizetesNoveles(int novel){
		fizetes = fizetes + novel;
		}
	public String toString(){
		return nev + "," + fizetes;
	}
	public void setNev(String nev) {
		this.nev = nev;
	}
	public void setFizetes(int fizetes) {
		this.fizetes = fizetes;
	}
	public boolean Hatarok(int a, int b) {
		if(fizetes > a && fizetes < b)
			return true;
		else
			return false;
	}
	public int ado(){
		return (int)Math.round(fizetes * 0.16);
	}
	public boolean NagyobbE(Alkalmazott masik) {
		return fizetes > masik.fizetes;
	}
	
}
