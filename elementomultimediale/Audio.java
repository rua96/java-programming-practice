package elementomultimediale;

public class Audio extends ElementoMultimediale {

	Audio(String t, int d, int v) {
		super(t, d, v);
	}
	
	public void run() {
		super.play();
	}
	
	public void stampaInfo() {
		System.out.println("Informazioni sull'audio\nTitolo: " + titolo + "\nDurata: " + durata + "\nVolume: " + volume);		
	}
}
