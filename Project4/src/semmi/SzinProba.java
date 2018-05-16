package semmi;

import java.awt.Color;
import pontos.SzinesPont;

public class SzinProba {

	public static void main(String[] args) {
		ISzin sz = new SzinesPont(3,6, Color.BLACK);
		System.out.println(sz.toString());
		
		sz.setSzinvalt(Color.BLUE);
		System.out.println(sz.toString());
		
		Atszinez(sz);
		System.out.println(sz.toString());

	}
	public static void Atszinez(ISzin masik){
		masik.setSzinvalt(ISzin.Alapszin);

}
}