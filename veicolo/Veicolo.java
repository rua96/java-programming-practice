package veicolo;

public abstract class Veicolo {
	private String marca, modello,colore;
	private int annoProduzione;
	private double prezzo;
	Veicolo(String ma,String mo,String c,int a,double p){
		marca=ma;
		modello=mo;
		colore=c;
		annoProduzione=a;
		prezzo=p;
	}
	
	public String getMarca() {
		return marca;
	}
	public String getModello() {
		return modello;
	}
	public String getColore() {
		return colore;
	}
	public int getAnnoProduzione() {
		return annoProduzione;
	}
	public double getPrezzo() {
		return prezzo;
	}
	 public void setMarca(String ma) {
	    	marca=ma;

	    }
	 public void setModello(String mo) {
	    	modello=mo;

	    }
	 public void setColore(String c) {
	    	colore=c;

	    }
	 public void setAnnoProduzione(int a) {
	    	annoProduzione=a;

	    }
	 public void setPrezzo(double p) {
		 	prezzo=p;
	 }
	 
	public String toString() {
		return "Marca : " + marca + " , Modello : " + modello + " , Colore : "+colore + " , Anno di Produzione : " + annoProduzione + " , Prezzo : " + prezzo + " euro . ";
	}
	

}
