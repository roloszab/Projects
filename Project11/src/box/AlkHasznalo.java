package box;

import box.Alkalmazott;

public class AlkHasznalo {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Adja meg az alkalmazottak számát: ");
		int N = Integer.parseInt(sc.nextLine());
		Alkalmazott tomb[]= new Alkalmazott[N];
		for(int i=0;i<N;i++){
			System.out.println("Kérem adja meg az alkalmazott nevét: ");
			String nev = sc.nextLine();
			System.out.println("Kérem adja meg az alkalmazott korát: ");
			int kor = Integer.parseInt(sc.nextLine());
			System.out.println("Kérem adja meg az alkalmazott fizetését: ");
			int fizetes = Integer.parseInt(sc.nextLine());
			tomb[i] = new Alkalmazott(nev,kor,fizetes); 
		}
		for(int i=0; i<N; i++){
			System.out.println(tomb[i].toString());
		}
		Alkalmazott.beallit(70);
		for(int i=0; i<N; i++){
			System.out.println(tomb[i].toString());
		}
		
		
		

	}

}
