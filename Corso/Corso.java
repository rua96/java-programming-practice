package corso;

public class Corso {							
	private String codice,nome,descrizione;
	private double costo;
	private int numOre;
	Corso(String cod,String n,String d,double cst,int num){        //creo il costruttore con codice,nome,descrizione,costo e numero di ore
		codice=cod;
		nome=n;
		descrizione=d;
		costo=cst;
		numOre=num;
	}
	//Dato che i parametri sono private, creo i get public per ognuno, in modo che questi possano essere richiamati fuori dalla classe Corso 
	public String getCodice() {   
		return codice;
	}
	public String getNome() {
		return nome;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public int getNumOre() {
		return numOre;
	}
	public double getCosto() {
		return  costo;
	}
	public String toString() {			//Per visualizzare tutte le informazioni del singolo corso
		return "Codice Corso: "+ codice  +" - Nome : " + nome + " - Descrizione : " + descrizione + " - Durata : " + numOre +" ore - Costo : "+ costo + " euro.";
	}
	public String infoEssenziali() {    //Per visualizzare soltanto nome e costo del singolo corso
		return "Nome Corso: " + nome + " - Costo : "+ costo + " euro.";
	}
}
