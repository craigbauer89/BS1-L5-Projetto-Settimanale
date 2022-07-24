package PlayerMultimediale;

public class Video extends AllMedia implements MultimedialePlay {
	
	private int durata;
	private int volume;
	private int luminosita;
	


	public Video(String titolo, int durata, int volume, int luminosita) {
		super(titolo);
		this.durata = durata;
		this.volume = volume;
		this.luminosita = luminosita;
	}



	public int getDurata() {
		return durata;
	}



	public void setDurata(int durata) {
		this.durata = durata;
	}



	public int getVolume() {
		return volume;
	}



	public void setVolume(int volume) {
		this.volume = volume;
	}



	public int getLuminosita() {
		return luminosita;
	}



	public void setLuminosita(int luminosita) {
		this.luminosita = luminosita;
	}



	public void play() {
		for (int i = 0; i<durata; i++) {
			System.out.print(getTitolo());
			for (int j = 0; j<volume; j++) {
				System.out.print("!");
			}
			for (int j = 0; j<luminosita; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void print() {
		System.out.println("Type: Video");
		System.out.println("Titolo: " + getTitolo() );
		System.out.println("Durata(mins): " + getDurata() );
		System.out.println("Volume(dec): " + getVolume() );
		System.out.println("Luminosita(pix): " + getLuminosita() );
		System.out.println("*****************");
		
	}
	
	@Override
	public void aumentaVol() {
		volume = volume+1;
		
	}
	@Override
	public void diminuisciVol() {
		volume = volume -1;
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
