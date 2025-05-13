package corso;

import java.util.Scanner;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in); //Instanzio un nuovo oggetto di nome scanner di tipo Scanner per fare in modo che l'utente possa digitare
		ArrayList<Corso>  arrCorso=new ArrayList<>(); //Creo un ArrayList Corso di nome arrCorso
		String  nome,descrizione;
		int ore,scelta;
		int itCodice=1; //creo una variabile di tipo intero e le assegno 1 come valore, questa serve per il codice di ciascun corso, in modo che ognuno abbia un codice univoco.
		double costo;
		boolean esegui=true; //creo una variabile booleana esegui che sarà vera in modo che possa partire il ciclo while.
		System.out.println("___Corsi della Scuola___");
		while(esegui) {
			System.out.println("Cosa desidere fare?\nPremi:\n1 per inserire un nuovo corso\n2 per visualizzare tutte le informazioni dei corsi presenti\n3 per visualizzare il nome di tutti i corsi presenti con il proprio prezzo \n4 per eliminare un corso\n5 per uscire dal programma  ");
			scelta=scanner.nextInt();
			scanner.nextLine();
			switch(scelta) {
			case 1:
				System.out.println("Inserisci i dati del corso che vuoi inserire : ");
				System.out.println("Nome corso : ");
				nome=scanner.nextLine();
				System.out.println("Descrizione corso : ");
				descrizione=scanner.nextLine();	
				System.out.println("Numero ore corso (in ore) : ");
				ore=scanner.nextInt();
				scanner.nextLine();
				System.out.println("Costo corso (in euro) : ");
				costo=scanner.nextDouble();
				scanner.nextLine();
				arrCorso.add(new Corso("corso"+itCodice++,nome,descrizione,costo,ore));
				System.out.println("Corso aggiunto con successo!");
				break;
			case 2:
				if(arrCorso.isEmpty()) //Prima verifico se l'array dei corsi è vuoto 
				{
				System.out.println("Nessun corso presente!");
				}
				else {
				System.out.println("Tutti i corsi presenti con tutte le informazioni:");
				int i=1; //Creo una variabile di tipo intero e le assegno 1 come valore, questa serve per numerare i corsi inseriti.
				for(Corso c:arrCorso) {
					System.out.println("n."+i++ +" " +c.toString());  //Ciclo all'interno dell'array per cercare i corsi presenti e per ognuno visualizzo i dati con la funzione toString().
				}
				}
				break;
			case 3:
				if(arrCorso.isEmpty()) //Prima verifico se l'array dei corsi è vuoto 
				{
				System.out.println("Nessun corso presente!");
				}
				else {
				System.out.println("Tutti i corsi presenti con relativo prezzo :");
				int i=1; //Creo una variabile di tipo intero e le assegno 1 come valore, questa serve per numerare i corsi inseriti.
				for(Corso c:arrCorso) {
					System.out.println("n."+i++ +" "+c.infoEssenziali());   //Ciclo all'interno dell'array per cercare i corsi presenti e per ognuno visualizzo i dati essenziali con la funzione infoEssenziali().
				}
				}
				break;
			case 4:
				if(arrCorso.isEmpty()) {
					System.out.println("Nessun corso presente!");
				}
				else {
				System.out.println("Quale corso vuoi eliminare?");
			
                int i = 1;
                for (Corso c : arrCorso) {
                    System.out.println(i++ + ". " + c.toString());
                }
                int sceltaElimina = scanner.nextInt();
                scanner.nextLine(); 
                if (sceltaElimina > 0 && sceltaElimina <= arrCorso.size()) {
                    arrCorso.remove(sceltaElimina - 1);
                    System.out.println("Corso eliminato con successo.");
                } else {
                    System.out.println("Scelta non valida. Ritorno al Menu Principale");
                }
				}
				
				break;
			case 5:
				System.out.println("Uscita dal programma. . .");
				esegui=false;        //Ora la variabile esegui la rendo falsa, così terminerà il ciclo while e il programma terminerà
				break;
			default:
				System.out.println("Scelta non valida!");
				break;
			}
		}
	
		scanner.close(); //Chiusura dello scanner
	}

}
