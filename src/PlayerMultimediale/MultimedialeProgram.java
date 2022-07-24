package PlayerMultimediale;

import java.util.Scanner;

public class MultimedialeProgram {
	
	public static void main(String[] args) {
		
		
		String[] items = {"Canzone","Imagagine","Film", "2nd Canzone","3rd Canzone"};
		for (int i = 0; i < items.length; i++) {
		System.out.println("Inserire il nome di un " + items[i] );
		Scanner scanner = new Scanner(System.in);
		items[i] = scanner.nextLine();
		
		}
		
		Audio Canzone1 = new Audio(items[0], 5, 5);
		Immagine Imagagine1 = new Immagine(items[1],1);
		Video Video1 = new Video(items[2], 2, 4, 2);
		Audio Canzone2 = new Audio(items[3], 4, 1);
		Audio Canzone3 = new Audio(items[4], 3, 5);
		
		
		AllMedia[] multimedialePlayers = {Canzone1,Imagagine1,Video1, Canzone2,Canzone3};
		
		int option;
		do {
			System.out.println("Scegli un opzione tra 1 e 5, o 0 sei voui finire" );
			Scanner scanner2 = new Scanner(System.in);
			option = scanner2.nextInt();
			if (option > 0 && option < 6) {
				 for (int j = 0; j < multimedialePlayers.length; j++) {
						if (option == j+1) {
							if (multimedialePlayers[j] instanceof MultimedialePlay) {
								multimedialePlayers[j].play();
								System.out.println("Voui cambiare la luminosita? y/n" );
								Scanner scanner3 = new Scanner(System.in);
								String selection = scanner3.nextLine();
								if (selection.equals("y")) {
									Luminosita.aumenta(multimedialePlayers[j]);
								} else if (selection.equals("n")) {
									Luminosita.diminuisci(multimedialePlayers[j]);
								}
								System.out.println("Voui cambiare la Volume? y/n" );
								Scanner scanner4 = new Scanner(System.in);
								String selection2 = scanner4.nextLine();
								if (selection.equals("y")) {
									Volume.aumenta(multimedialePlayers[j]);
								} else if (selection.equals("n")) {
									Volume.diminuisci(multimedialePlayers[j]);
								}
								multimedialePlayers[j].play();
							}
							
							else if (multimedialePlayers[j] instanceof MultimedialeShow) {
								multimedialePlayers[j].show();
								System.out.println("Voui cambiare la luminosita? y/n" );
								Scanner scanner3 = new Scanner(System.in);
								String selection = scanner3.nextLine();
								if (selection.equals("y")) {
									Luminosita.aumenta(multimedialePlayers[j]);
								} else if (selection.equals("n")) {
									Luminosita.diminuisci(multimedialePlayers[j]);
								}
							}
							multimedialePlayers[j].show();
						}
					}
			 }
		}while (option !=0);
		
		
		

		
		System.out.println("Grazie e buona Giornate!" );
		
		
		
	}

}
