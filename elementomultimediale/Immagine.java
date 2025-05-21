package elementomultimediale;

public class Immagine extends ElementoMultimediale {

	Immagine(String t, int l) {
		super(t, l);
	}

	public void run() {
		System.out.print(titolo);
		super.show();
	}
	
	public void stampaInfo() {
		System.out.println("Informazioni sull'audio\nTitolo: " + titolo + "\nLuminosita': " + luminosita);		
	}
}
