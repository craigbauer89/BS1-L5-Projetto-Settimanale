package PlayerMultimediale;

public class Audio extends AllMedia  implements MultimedialePlay {
	
	
	private int durata;
	private int volume;
	
	
		

	public Audio(String titolo, int durata, int volume) {
		super(titolo);
		this.durata = durata;
		this.volume = volume;
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



	public void play()  {
		for (int i = 0; i<durata; i++) {
			System.out.print(getTitolo());
			for (int j = 0; j<volume; j++) {
				System.out.print("!");
			}
			System.out.println();
		}
		
	}
	
	
	
	public void print() {
		System.out.println("Type: Audio");
		System.out.println("Titolo: " + getTitolo() );
		System.out.println("Durata(mins): " + getDurata() );
		System.out.println("Volume(dec): " + getVolume() );
		System.out.println("*********************");
	}

	@Override
	public void aumenta() {
		this.volume = this.volume+1;
		
	}
	@Override
	public void diminuisci() {
		this.volume =- 1;
	}
	
}
