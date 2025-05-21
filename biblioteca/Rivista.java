package biblioteca;

public class Rivista extends Libro {

	Rivista(String titolo, String autore, int annoPubblicazione){
		super(titolo,autore,annoPubblicazione);
	}
	 @Override
    public String toString() {
	return " Rivista - " + super.toString();
}
}