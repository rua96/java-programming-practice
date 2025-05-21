package biblioteca;

public abstract class Libro {
	private String titolo, autore;
	private int annoPubblicazione;
	
	Libro(String t,String aut, int a){
		titolo=t;autore=aut;annoPubblicazione=a;
	}
	
	public String getTitolo(){
		return titolo;
	}
	public String getAutore(){
		return autore;
	}
	public int getAnnoPubblicazione(){
		return annoPubblicazione;
	}
	
	public String toString() {
		return "Titolo : "+ titolo + " , Autore : "+ autore + " , Anno di Pubblicazione : " + annoPubblicazione + " . ";
	}

}
