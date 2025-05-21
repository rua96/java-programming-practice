package biblioteca;

public class Saggio extends Libro {
	Saggio(String titolo, String autore, int annoPubblicazione){
		super(titolo,autore,annoPubblicazione);
	}
	 @Override
    public String toString() {
	return " Saggio - " + super.toString();
}
}
