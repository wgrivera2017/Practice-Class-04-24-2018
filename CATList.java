import java.util.Scanner;
public class CATList {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		CAT [] CATList = new CAT[3];
		
		System.out.println("Input 3 different cats : Name, Breed.");
		
		for( int i = 0; i < CATList.length; i++) {
			
			String name1 = scanner.nextLine();
			
			String breed1 = scanner.nextLine();
			
			CATList[i] = new CAT(name1, breed1);
		}
		
		System.out.println(CATList[1].name + " " + CATList[1].breed);
		
		scanner.close();
	}

}
 