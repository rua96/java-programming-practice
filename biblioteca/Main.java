package biblioteca;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scansione = new Scanner(System.in);
		String autore,titolo;
		int anno,scelta;
		ArrayList<Libro> arrRomanzo = new ArrayList<>();
		ArrayList<Libro>arrRivista= new ArrayList<>();
		ArrayList<Libro>arrSaggio=new ArrayList<>();
		
		boolean esegui= true;
		System.out.println("\nBenvenuto in questa biblioteca!");
		while(esegui) {
			
			System.out.println("\nCosa desideri fare? ");
			System.out.println("Premi 1 per Inserire un nuovo libro;\nPremi 2 per visualizzare i libri;\nPremi 3 per uscire dal menu.");
		    scelta=scansione.nextInt();
	        scansione.nextLine();
			switch(scelta) {
	        case 1:
	        	System.out.println("\nInserimento nuovo libro :\nChe tipo di libro vuoi inserire ? \nInserire \n 1 per aggiungere un Romanzo, \n 2 per aggiungere un Saggio, \n 3 per aggiungere una Rivista.");
	        	int tipo=scansione.nextInt();
	        	scansione.nextLine();
	        	System.out.println("\nInserire Titolo : ");
	        	titolo=scansione.nextLine();
	        	System.out.println("\nInserire Autore : ");
	        	autore=scansione.nextLine();
	        	System.out.println("\nInserire Anno di pubblicazione : ");
	        	anno=scansione.nextInt();
	        	scansione.nextLine();
	        	if(tipo==1)
	        	{
	        		arrRomanzo.add(new Romanzo(titolo,autore,anno));
	        		System.out.println("Romanzo aggiunto!");
	        	}
	        	else if(tipo==2)
	        	{
	        		arrSaggio.add(new Saggio(titolo,autore,anno));
	        		System.out.println("Saggio Aggiunto!");
	        	
	        	}
	        	else if(tipo==3)
	        	{
	        		arrRivista.add(new Rivista(titolo,autore,anno));
	        		System.out.println("Rivista Aggiunta!");
	        	}
                else {
                    System.out.println("Tipo di libro non valido. Non aggiunto.");
                }
	        	break;
	        case 2:
	        	System.out.println("Hai scelto di visualizzare i Libri : \nPremi 1 per visualizzare i Romanzi;\nPremi 2 per visualizzare i Saggi;\nPremi 3 per visualizzare le Riviste;\nPremi 4 per visualizzare tutti i Libri. ");
	        	int scelta2=scansione.nextInt();
	        	scansione.nextLine();
	        	switch(scelta2) {
	        	case 1:
	        		System.out.println("Romanzi: ");
	        		if(arrRomanzo.isEmpty()) {
	        			System.out.println("Nessun Romanzo presente!");
	        		}
	        		else
	        		{
	        			int i=1;
	        			for(Libro l:arrRomanzo) {
	        				System.out.println("n. " + i++ + " : " + l.toString());
	        			}
	        			
	        		}
	        		break;
	        	case 2:
	        		System.out.println("Saggi: ");
	        		if(arrSaggio.isEmpty()) {
	        			System.out.println("Nessun Saggio presente!");
	        		}
	        		else
	        		{
	        			int i=1;
	        			for(Libro l:arrSaggio) {
	        				System.out.println("n ." + i++ + " : " + l.toString());
	        			}
	        			
	        		}
	        		break;
	        	case 3:
	        		System.out.println("Riviste: ");
	        		if(arrRivista.isEmpty()) {
	        			System.out.println("Nessuna Rivista presente!");
	        		}else {
	        			int i=1;
	        			for(Libro l:arrRivista) {
	        				System.out.println("n ."+ i++ + " : " + l.toString());
	        			}
	        		}
	        		break;
	            default:
	                System.out.println("Scelta non valida.");
	                break;
	            case 4:
	            	System.out.println("Tutti i Libri :");
	        		System.out.println("Romanzi: ");
	        		if(arrRomanzo.isEmpty()) {
	        			System.out.println("Nessun Romanzo presente!");
	        		}
	        		else {
	        			int i=1;
	        			for(Libro l:arrRomanzo) {
	        				System.out.println("n. " + i++ + " : " + l.toString());
	        		  }
	        		}
	        		System.out.println("Saggi: ");
	        		if(arrSaggio.isEmpty()) {
	        			System.out.println("Nessun Saggio presente!");
	        		}
	        		else {
	        			int i=1;
	        			for(Libro l:arrSaggio) {
	        				System.out.println("n. " + i++ + " : " + l.toString());
	        		  }
	        		}
	        		System.out.println("Riviste: ");
	        		if(arrRivista.isEmpty()) {
	        			System.out.println("Nessuna Rivista presente!");
	        		}
	        		else {
	        			int i=1;
	        			for(Libro l:arrRivista) {
	        				System.out.println("n. " + i++ + " : " + l.toString());
	        		  }
	        		}
	        	}
	        	break;
	        case 3:
	        	System.out.println("Uscita dal Menu!");
                esegui = false;
                break;
            default:
                System.out.println("Scelta non valida.");
                break;
	        
	        }
			
		}
		
	scansione.close();	

}
}
