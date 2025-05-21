package cd;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		ArrayList<CD> arrPop=new ArrayList<>();
		ArrayList<CD>arrRock=new ArrayList<>();
		ArrayList<CD>arrMetal=new ArrayList<>();
	String artista,titolo;
	int anno,scelta,genere,scelta2;
	boolean esegui=true;
	System.out.println("__Catalogo di Dischi Musicali__");
	arrPop.add(new CD("Pop","Musica Pop","Andrea",2019));
	while(esegui) {
		System.out.println("Inserisci:\n1 per aggiungere un nuovo CD;\n2 per visualizzare tutti i CD presenti;\n3 per visualizzare i CD di un certo genere musicale;\n4 per uscire dal programma");
		scelta=scanner.nextInt();
		scanner.nextLine();
		switch(scelta) {
		case 1:
			System.out.println("Scegli il genere musicale:\n1 per Pop ;\n2 per Rock;\n3 per Metal");
			genere=scanner.nextInt();
			scanner.nextLine();
			if(genere>=1&&genere<=3) {
				System.out.println("Inserisci Titolo CD:");
				titolo=scanner.nextLine();
				System.out.println("Inserisci Artista:");
				artista=scanner.nextLine();
				System.out.println("Inserisci Anno:");
				anno=scanner.nextInt();
				scanner.nextLine();
				if(genere==1) {
					arrPop.add(new CD("Pop",titolo,artista,anno));
					System.out.println("CD Pop Aggiunto al Catalogo.");
				}
				else if(genere==2) {
					arrRock.add(new CD("Rock",titolo,artista,anno));
					System.out.println("CD Rock Aggiunto al Catalogo.");
				}
				else if(genere==3) {
					arrPop.add(new CD("Metal",titolo,artista,anno));
					System.out.println("CD Metal Aggiunto al Catalogo.");
				}
			}
			else {
				System.out.println("Scelta non valida. Ritorno al Menu principale");
			}
			break;
		case 2:
			if(arrPop.isEmpty()&&arrRock.isEmpty()&&arrMetal.isEmpty()) {
				System.out.println("Nessun CD presente nel Catalogo. Ritorno al Menu principale.");
			}
			else {
			System.out.println("Tutti i CD presenti nel Catalogo : ");
			int i=1;
			for(CD cd:arrPop) {
				System.out.println("n."+i++ +" - " + cd.toString());
			}
			for(CD cd:arrRock) {
				System.out.println("n."+i++ +" - " + cd.toString());
			}
			for(CD cd:arrMetal) {
				System.out.println("n."+i++ +" - " + cd.toString());
			}
			}
			
			break;
		case 3:
			System.out.println("Visualizzazione CD presenti nel catalogo per genere musicale.\nScegli :\n1 per Pop ;\n2 per Rock;\n3 per Metal");
			scelta2=scanner.nextInt();
			scanner.nextLine();
			switch(scelta2) {
			case 1:
				if(arrPop.isEmpty()) {
					System.out.println("Nessun CD Pop presente nel Catalogo. Ritorno al Menu principale.");
				}
				else {
			System.out.println("CD Pop presenti nel Catalogo : ");
			int i=1;
			for(CD cd:arrPop) {
				System.out.println("n."+i++ +" - " + cd.toString());
			}
				}
			break;
			case 2:
				if(arrRock.isEmpty()) {
					System.out.println("Nessun CD Rock presente nel Catalogo. Ritorno al Menu principale.");
				}
				else{
					System.out.println("CD Rock presenti nel Catalogo : ");
				int i=1;
				for(CD cd:arrRock) {
					System.out.println("n."+i++ +" - " + cd.toString());
				}
			}
				break;
			case 3:
				if(arrMetal.isEmpty()) {
					System.out.println("Nessun CD Metal presente nel Catalogo. Ritorno al Menu principale.");
				}
				else {
					
				System.out.println("CD Metal presenti nel Catalogo : ");
				int i=1;
				for(CD cd:arrMetal) {
					System.out.println("n."+i++ +" - " + cd.toString());
				}
				}
				break;
			default:
				System.out.println("Scelta non valida!\nRitorno al menu principale");
				break;
			}
			break;
		case 4:
			System.out.println("Uscita dal Negozio. . .");
			esegui=false;
			break;
		default:
			System.out.println("Scelta non valida!");
			break;
		}
		
	}
	
	scanner.close();	
		
	}

}
