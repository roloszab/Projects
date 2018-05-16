package box;

public class Tombok {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Adjuk meg a tömb elemeit!");           //ez nem fontos ide
		int tomb[] = new int[5];
		
		for(int i=0;i<tomb.length;i++){
			System.out.println("A tömb "+(i+1)+". eleme:");
		tomb[i]= sc.nextInt();
		
		}
		int max = tomb[0];
		for(int i=0;i<tomb.length;i++){
			
				
				if (tomb[i]>max)
					max = i;
					
		}
		System.out.println("A tömb legnagyobb eleme: "+ tomb[max]);
		int keresett = 5;
		for(int i = 0;i<tomb.length;i++){
			if(tomb[i] == keresett){
				System.out.println("Van ilyen elem");}
				else{
					System.out.println("Nincs ilyen elem");
			}
		}
	}
}
