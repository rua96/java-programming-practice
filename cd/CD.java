package cd;

public class CD {
	private String titolo, artista ,genere;
	private int anno;
	CD(String g,String t, String a,int y){
		genere=g;
		titolo=t;
		artista=a;
		anno=y;
		}
	public String getGenere() {
		return genere;
	}
	public String getTitolo() {
		return titolo;
	}
	public String getArstista() {
		return artista;
	}
	public int getAnno() {
		return anno;
	}
	public String toString() {
		return "Genere Musicale : "+ genere +" - Titolo CD : "+ titolo +" - Artista : "+ artista +" - Anno di pubblicazione : "+ anno +" . " ;
	}
	

}
