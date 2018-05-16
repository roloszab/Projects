package alap;

public class Teglalap {
	private int a;
	private int b;
	
	public Teglalap(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public Teglalap(int x) {
		super();
		a = b = x;	
	}
	public int Terulet(){
		return a*b;
	}
	public String toString(){
		return a + " , " + b + " , " + Terulet();
	}
	public void beallit(int x, int y) {
		a = x;
		b = y;
	}
	public void beallitas(int z){
		a = z;
		b = z;	
	}
	public boolean NagyobbE(Teglalap masik) {
		return Terulet() > masik.Terulet();
	}
	public boolean EgyenloE(Teglalap masik) {
		return a==masik.a && b==masik.b;
	}
	
}
