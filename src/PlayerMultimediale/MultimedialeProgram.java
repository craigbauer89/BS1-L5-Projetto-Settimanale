package PlayerMultimediale;



public class MultimedialeProgram {
	
	public static void main(String[] args) {
		
		Audio Canzone1 = new Audio("Crazy World", 5, 5);
		Immagine Imagagine1 = new Immagine("Gatto",1);
		Video Video1 = new Video("Forest Gump", 2, 4, 23);
		Audio Canzone2 = new Audio("Torn", 4, 1);
		Audio Canzone3 = new Audio("Tuesday's Gone", 3, 5);
		
		
		
		AllMedia[] multimedialePlayers = {Canzone1,Imagagine1,Video1, Canzone2,Canzone3};
		
		for (int j = 0; j < multimedialePlayers.length; j++) {

			if (multimedialePlayers[j] instanceof MultimedialePlay) {
				multimedialePlayers[j].play();
			}
			else if (multimedialePlayers[j] instanceof MultimedialeShow) {
				multimedialePlayers[j].show();
			}
			
		}
		
		int selection  = 4;
		for (int i = 0; i < multimedialePlayers.length; i++) {
		if (selection == i+1) {
			if (multimedialePlayers[i] instanceof MultimedialeShow) {
				Luminosita.aumenta(multimedialePlayers[i]);
			}
			else if (multimedialePlayers[i] instanceof MultimedialePlay) {
				Volume.aumenta(multimedialePlayers[i]);
			}
		}
		}

		
		for (int j = 0; j < multimedialePlayers.length; j++) {

			if (multimedialePlayers[j] instanceof MultimedialePlay) {
				multimedialePlayers[j].play();
			}
			else if (multimedialePlayers[j] instanceof MultimedialeShow) {
				multimedialePlayers[j].show();
			}
			
		}
		
		
		
	}

}
