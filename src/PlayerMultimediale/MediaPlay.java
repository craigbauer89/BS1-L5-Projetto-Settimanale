package PlayerMultimediale;

public abstract class MediaPlay {
	
	private String titolo;
	
	

	public MediaPlay(String titolo) {
		this.titolo = titolo;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	

}
