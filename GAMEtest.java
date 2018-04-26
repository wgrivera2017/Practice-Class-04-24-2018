import java.util.Scanner;
public class GAMEtest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		GAME [] GAMEtest = new GAME[5];

		System.out.println("Input 5 Games: Name, Genre, Rating");

		for(int i = 0; i < GAMEtest.length; i++) {
			String name1 = scanner.nextLine();

			String genre1 = scanner.nextLine();

			String rating1 = scanner.nextLine();

			GAMEtest[i] = new GAME(name1, genre1, rating1);

			System.out.println("Enter a name");

			String ga = scanner.nextLine();

			if(ga.equals(GAMEtest[i].name)) {
				System.out.println(GAMEtest[i].name + GAMEtest[i].genre + GAMEtest[i].rating);
			}
			else {
				System.out.println("Game not found");
			}
		}

		scanner.close();

	}

}
