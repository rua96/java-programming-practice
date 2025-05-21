package elementomultimediale;

public class Filmato extends ElementoMultimediale {

	Filmato(String t, int l, int d, int v) {
		super(t, l, d, v);
	}
	
	public void run() {
		super.play();
		super.show();
	}
	
	public void stampaInfo() {
		System.out.println("Informazioni sull'audio\nTitolo: " + titolo + "\nLuminosita': " + luminosita + "\nDurata: " + durata + "\nVolume: " + volume);		
	}
	
}
