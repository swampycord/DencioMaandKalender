package test;

public class ForLoopMaand {

	public static void main(String[] args) {

		int dagen = 1;
		String[] weekDagen = { "Zondag", "Maandag", "Dinsdag", "Woensdag", "Donderdag", "Vrijdag", "Zaterdag" };
		int jaarGetal = 2021;
		int j = 0;

		for (int i = 0; i <= 4; i++) {
			System.out.println("\nWeek " + (i + 1));
			for (j = 0; j <= 6; j++) {
				if (dagen <= 31) {
					System.out.println(weekDagen[j] + " " + (dagen++) + " " + "Jan " + jaarGetal);
				}
			}
			j++;

		}
	}

}
