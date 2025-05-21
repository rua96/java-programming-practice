package hotel;

public class Prenotazione {
private String codiceId,nomeHotel,nomeCognome,data;
private int numNotti;
Prenotazione(String cod,String nH,String nCl,String d,int num){
	codiceId=cod;
	nomeHotel=nH;
	nomeCognome=nCl;
	data=d;
	numNotti=num;
	}
public String getCodiceId() {
	return codiceId;
}
public String getNomeHotel() {
	return nomeHotel;
}
public String getNomeCognome() {
	return nomeCognome;
}
public String getData() {
	return data;
}
public int getNumNotti() {
	return numNotti;
}
public String toString() {
	return "Codice Identificativo : "+codiceId+" - Nome Hotel : " + nomeHotel + " - Nome e Cognome del cliente : "+ nomeCognome+ " - data inizio soggiorno : " +  data + " - numero notti permanenza : " + numNotti+ " . " ;
}
}
