package boxi;

import boxi.IPolinomok;
import boxi.LinearisPolinom;

public class Proba {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		LinearisPolinom tomb[] = new LinearisPolinom[5];
		for(int i = 0; i < tomb.length; i++){
			System.out.println("K�rem a polinom " + i + ". x koordin�t�j�t: ");
			double a = sc.nextDouble();
			System.out.println("K�rem a polinom " + i + ". konstans koordin�t�j�t: ");
			double b = sc.nextDouble();
			tomb[i] = new LinearisPolinom(a, b);
		}
		for(int j = 0; j < tomb.length; j++){
			System.out.println(tomb[j]);
		}
		
		fgvtabla(tomb[4]);
		sc.close();

}
	
private static void fgvtabla(IPolinomok pol){
	for(int i = 0; i < 11; i++){
		double x = i/10.0;
		System.out.println("x= " + x + " y=" + pol.szamol(x));
		}

}
}



	


