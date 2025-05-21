package elementomultimediale;
public abstract class ElementoMultimediale {

	protected String titolo;
	protected int luminosita, durata, volume;
	
	ElementoMultimediale(String t, int l, int d, int v) {	// utilizzato da Filmato
		titolo  = t;
		luminosita = l;
		durata = d;
		volume = v;
	}
	
	ElementoMultimediale(String t, int l) {					// utilizzato da Immagine
		titolo  = t;
		luminosita = l;
	}
	
	ElementoMultimediale(String t, int d, int v) {			// utilizzato da Audio
		titolo  = t;
		durata = d;
		volume = v;
	}

	protected void play() {
		for (int i=0; i<durata; i++)
			System.out.print(titolo);
		for (int i=0; i<volume; i++)
			System.out.print('!');
	}
	
	protected void show() {
		for (int i=0; i<luminosita; i++)
			System.out.print('*');
	}

	// aumenta la luminosità
	public void brighter() {
		luminosita++;
	}
	
	// riduce la luminosità
	public void darker() {
		luminosita--;
	}

	// alza il volume
	public void louder() {
		volume++;
	}
	
	// abbassa il volume
	public void weaker() {
		volume--;
	}
	
	public String getTitolo() {
		return titolo;
	}

	public int getLuminosita() {
		return luminosita;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public int getDurata() {
		return durata;
	}
	
	public abstract void stampaInfo();

}
