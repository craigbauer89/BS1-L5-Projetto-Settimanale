package PlayerMultimediale;

public class Immagine extends AllMedia implements MultimedialeShow{
	
	
	private int luminosita;

	

	public Immagine(String titolo, int luminosita) {
		super(titolo);
		this.luminosita = luminosita;
	}



	public int getLuminosita() {
		return luminosita;
	}



	public void setLuminosita(int luminosita) {
		this.luminosita = luminosita;
	}



public void print() {
	System.out.println("Type: Immagine");
		System.out.println("Titolo: " + getTitolo() );
		System.out.println("Luminosita(pix): " + getLuminosita() );
		System.out.println("*******************");
	}
	
public void show() {
		System.out.print(getTitolo());
		for (int j = 0; j<luminosita; j++) {
			System.out.print("*");
		}
		System.out.println();
	}

@Override
public void aumentaLum() {
	luminosita =  luminosita + 1;
	
}
@Override
public void diminuisciLum() {
	luminosita = luminosita - 1;
}

	
}




