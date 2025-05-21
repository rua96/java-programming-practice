package bevande;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {	

	static ArrayList<Bevanda>arrBev=new ArrayList<>();
	
	public static void main(String[] args) {

		Scanner scan=new Scanner (System.in);
		
		int un,scelta;
		String nom;
		/*arrBev.add(new Bevanda("Coca Cola", 15));
		arrBev.add(new Bevanda("Fanta", 10));*/
		
		boolean esegui=true;
		System.out.println("\nDistributore Automatico :");
		while(esegui) {
			
			   	System.out.print("\nCosa desideri fare? ");
	            System.out.println("\nInserire 1 per inserire una bevanda");
	            System.out.println("Inserire 2 erogare una bevanda");
	            System.out.println("Inserire 3 ricaricare una bevanda");
	            System.out.println("Inserire 4 visualizzare le bevande presenti.");
	            System.out.println("Inserire 5 visualizzare le bevande presenti.");
	            System.out.println("Inserire 6 per uscire dal distributore.");
	            
	            scelta=scan.nextInt();
	            scan.nextLine();
	            
	            switch(scelta) {
	            case 1:
	            	System.out.println("Inserimento bevanda:");
	            	System.out.println("Inserisci il nome:");
	            	nom=scan.nextLine();
	            	System.out.println("Inserisci il numero di unita'");
	            	un=scan.nextInt();
	            	scan.nextLine();
	            	aggiungiBevanda(nom,un);
	            	System.out.println("Bevanda aggiunta con successo");
	            	break;
	            case 2:
	            	System.out.println("Erogazione bevanda:");
	            	System.out.println("Inserisci il nome della bevanda da erogare");
	            	nom=scan.nextLine();
	        		erogaBevanda(nom);
	            	break;
	            case 3:
	            	System.out.println("Ricarica bevanda:");
	            	System.out.print("Nome della bevanda da ricaricare: ");
	            	nom=scan.nextLine();
	            	System.out.print("Quante unita' vuoi ricaricare? ");
	            	un=scan.nextInt();
	            	scan.nextLine();
	            	aggiungiBevanda(nom, un);
	            	break;
	            case 4:
	            	System.out.println("Visualizzazione bevande:");
	            	System.out.print("Inserisci il nome della bevanda da visualizzare: ");
	            	nom=scan.nextLine();
	            	visualizzaQuantita(nom);	            	
	            	break;
	            case 5:
	            	System.out.println("Visualizzazione di tutte le bevande:");
	            	visualizzaTutteLeBevande();
	            	break;
	            case 6:
	                System.out.println("Uscita dal Menu!");
	                esegui = false;
	                break;
	            default:
	            	System.out.println("Scelta non valida.");
	                break;
	            	}
		}
		scan.close();
	}
	
	public static void aggiungiBevanda(String nome,int unita) {
		Bevanda b =trovaBevanda(nome);
		if(b !=null) {
			b.aggiungiUnita(unita);
		}else{
			arrBev.add(new Bevanda(nome,unita));
		}
	}
	
	public static void erogaBevanda(String nome) {
		Bevanda b =trovaBevanda(nome);
		if(b !=null) {
			if(b.erogaUnita()) {
			System.out.println("Bevanda " + nome + " erogata con successo.");
		}else{
			System.out.println("Errore: nessuna bevanda " + nome + " disponibile.");
		}
	}else {
		System.out.println("Errore: bevanda "+ nome + " non trovata nel distributore.");
	}
		
	}
	
    public static void visualizzaQuantita(String nome) {
        Bevanda b = trovaBevanda(nome);
        if (b != null) {
            b.visualizzaQuantitaBevanda();
        } else {
            System.out.println("Bevanda " + nome + " non trovata nel distributore.");
        }
    }
	
	private static Bevanda trovaBevanda(String nome) {
		for(Bevanda bevanda:arrBev) {
			if(bevanda.getNome().equalsIgnoreCase(nome)) {
				return bevanda;
			}
		}
		return null;
	}

    public static void visualizzaTutteLeBevande() {
        if (arrBev.isEmpty()) {
            System.out.println("Il distributore e' vuoto.");
        } else {
            for (Bevanda b : arrBev) {
                b.visualizzaQuantitaBevanda();
            }
        }
    }
	
}
