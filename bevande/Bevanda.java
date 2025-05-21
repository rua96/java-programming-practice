package bevande;

public class Bevanda {
	private int unita;
	private String nome;
	
	Bevanda(String n,int u)
	{unita=u;
	 nome=n;}
	
	int getUnita () {
		return unita;
	}
	String getNome() {
		return nome;
	}
	public void aggiungiUnita(int unitaAggiunta) {
		unita+=unitaAggiunta;
	}	
	public boolean erogaUnita() {
		if(unita >0) {
			unita--;
			return true;
			}
		return false;
	}
	
    public void visualizzaQuantitaBevanda() {
        System.out.println("Bevanda: " + nome + " | Disponibili: " + unita + " unita' di bevanda.");
    }
	
	@Override
	public String toString() {
		return "nome bevanda :"+ nome + " , unita' : "+unita;
	}
	
}
