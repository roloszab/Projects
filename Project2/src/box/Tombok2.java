package box;
import java.util.Scanner;
public class Tombok2 {

	public static void main(String[] args) {
		
		
			
				Scanner sc = new Scanner(System.in);
				System.out.println("Adja meg hogy hány elem legyen a tömbben!");
				int N = sc.nextInt();
				int tomb[] = new int[N];
				System.out.println("Most adja meg a tömb elemeit!");
				for(int i=0;i<tomb.length;i++) {
					System.out.println("A tömb "+(i+1)+". eleme:");
				tomb[i] = sc.nextInt();
			
				}
			}
			
		

	}


