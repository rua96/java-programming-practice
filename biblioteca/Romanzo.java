package biblioteca;

public class Romanzo extends Libro {
	Romanzo(String titolo, String autore, int annoPubblicazione){
		super(titolo,autore,annoPubblicazione);
	}
	 @Override
    public String toString() {
	return " Romanzo - " + super.toString();
}
}
