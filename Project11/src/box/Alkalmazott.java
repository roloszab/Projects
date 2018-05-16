package box;

public class Alkalmazott {
	private String nev;
	private int kor;
	private int fizetes;
	
	private static int korhatar=65;
	
	public Alkalmazott(String nev, int kor, int fizetes) {
		super();
		this.nev = nev;
		this.kor = kor;
		this.fizetes = fizetes;
		
	}
	public int nyugdijig(){
		return korhatar - kor;
	}
	public String toString(){
		return nev + " , " + kor + " , " + fizetes + " , " + nyugdijig();
	}
	public static int beallit(int x){
		return korhatar = x;
	}
	public boolean nagyobb(Alkalmazott masik){
		return fizetes > masik.fizetes;
	}
}
