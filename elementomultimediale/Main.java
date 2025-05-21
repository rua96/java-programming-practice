package elementomultimediale;

import java.util.Scanner;
import java.util.ArrayList; // import the ArrayList class

public class Main {
	
	static Scanner scansione = new Scanner(System.in);
	static ArrayList<Audio> arrAudio = new ArrayList<Audio>(); // Create an ArrayList object
	static ArrayList<Filmato> arrFilmato = new ArrayList<Filmato>();
	static ArrayList<Immagine> arrImmagine = new ArrayList<Immagine>();

	public static void main(String[] args) {
		
		int scelta;

		do {
			System.out.println("\nDigitare 1 per creare un audio\nDigitare 2 per creare un filmato\nDigitare 3 per creare un'immagine");
			System.out.println("\nDigitare 4 per operare su un audio\nDigitare 5 per operare su un filmato\nDigitare 6 per operare su un'immagine");
			System.out.println("\nDigitare 0 per uscire dal programma");
			
			scelta = scansione.nextInt();
			scansione.nextLine();
			
			switch (scelta) {
				
				case 1:
					// creazione audio
					Audio aud = creaAudio();
					arrAudio.add(aud);
					break;
				case 2:
					// creazione filmato
					Filmato film = creaFilmato();
					arrFilmato.add(film);
					break;
				case 3:
					// creazione immagine;
					Immagine imm = creaImmagine();
					arrImmagine.add(imm);
					break;
				case 4:
					if (arrAudio.size()>0)
						gestisciAudio();
					else
						System.out.println("Nessun audio presente su cui operare");
					break;
				case 5:
					if (arrFilmato.size()>0)
						gestisciFilmato();
					else
						System.out.println("Nessun filmato presente su cui operare");
					break;
				case 6:
					if (arrImmagine.size()>0)
						gestisciImmagine();
					else
						System.out.println("Nessuna immagine presente su cui operare");
					break;
				case 0:
					System.out.println("Uscita dal programma");
					break;
				default:
					System.out.println("Scelta errata");
					
			}
		} while (scelta!=0);
		
	}
	
	public static Audio creaAudio() {
		
		Audio aud;
		
		System.out.println("Inserire il titolo dell'audio");
		String titolo = scansione.nextLine();
		System.out.println("Inserire la durata dell'audio");
		int durata = scansione.nextInt();
		scansione.nextLine();
		System.out.println("Inserire il volume dell'audio");
		int volume = scansione.nextInt();
		scansione.nextLine();
		
		aud = new Audio(titolo, durata, volume);
		
		return aud;

	}

	public static Filmato creaFilmato() {
		
		Filmato film;
		
		System.out.println("Inserire il titolo del filmato");
		String titolo = scansione.nextLine();
		System.out.println("Inserire la luminosita' del filmato");
		int luminosita = scansione.nextInt();
		scansione.nextLine();
		System.out.println("Inserire la durata del filmato");
		int durata = scansione.nextInt();
		scansione.nextLine();
		System.out.println("Inserire il volume del filmato");
		int volume = scansione.nextInt();
		scansione.nextLine();
		
		film = new Filmato(titolo, luminosita, durata, volume);
		
		return film;
		
	}
	
	public static Immagine creaImmagine() {
		
		Immagine imm;
		
		System.out.println("Inserire il titolo dell'immagine");
		String titolo = scansione.nextLine();
		System.out.println("Inserire la luminosita' dell'immagine");
		int luminosita = scansione.nextInt();
		scansione.nextLine();
		
		imm = new Immagine(titolo, luminosita);
		
		return imm;
	}

	
	public static void gestisciAudio() {
	
		String titolo;
		Audio currentAud=null;
		int scelta;
		
		do {
			System.out.println("Inserire il titolo dell'audio su cui si vuole operare");
			titolo = scansione.nextLine();
			
			for(Audio aud: arrAudio) {
				if (aud.getTitolo().equals(titolo)) {
					currentAud = aud;
					break;
				}
			}
			
			if (currentAud == null) {
				System.out.println("Titolo NON trovato");
				System.out.println("Si desidera inserire un altro titolo da cercare? Rispondere 1 per si' e 2 per no");
				scelta = scansione.nextInt();
				scansione.nextLine();
				if (scelta != 1)
					break;
			}

		} while (currentAud == null);

		if (currentAud != null) {

			do {
			
				System.out.println("\nDigitare 1 per visualizzare le informazioni dell'audio\nDigitare 2 per aumentare il volume\nDigitare 3 per abbassare il volume\nDigitare 0 per tornare al menu principale");
				scelta = scansione.nextInt();
				scansione.nextLine();
				
				switch (scelta) {
				
					case 1:
						currentAud.stampaInfo();
						break;
					case 2:
						currentAud.louder();
						break;
					case 3:
						currentAud.weaker();
						break;
					case 0:
						System.out.println("Ritorna al menu principale");
						break;
					default:
						System.out.println("Scelta errata");
				}
			
			} while (scelta != 0);
				
		}
		
	}
	
	public static void gestisciFilmato() {
		
		String titolo;
		Filmato currentFilm=null;
		int scelta;
		
		do {
			System.out.println("Inserire il titolo del filmato su cui si vuole operare");
			titolo = scansione.nextLine();
			
			for(Filmato film: arrFilmato) {
				if (film.getTitolo().equals(titolo)) {
					currentFilm = film;
					break;
				}
			}
			
			if (currentFilm == null) {
				System.out.println("Titolo NON trovato");
				System.out.println("Si desidera inserire un altro titolo da cercare? Rispondere 1 per si' e 2 per no");
				scelta = scansione.nextInt();
				scansione.nextLine();
				if (scelta != 1)
					break;
			}

		} while (currentFilm == null);

		if (currentFilm != null) {

			do {
			
				System.out.println("\nDigitare 1 per visualizzare le informazioni del filmato\nDigitare 2 per aumentare il volume\nDigitare 3 per abbassare il volume\nDigitare 4 per aumentare la luminosita\nDigitare 5 per ridurre la luminosita\nDigitare 0 per tornare al menu principale");
				scelta = scansione.nextInt();
				scansione.nextLine();
				
				switch (scelta) {
				
					case 1:
						currentFilm.stampaInfo();
						break;
					case 2:
						currentFilm.louder();
						break;
					case 3:
						currentFilm.weaker();
						break;
					case 4:
						currentFilm.brighter();
						break;
					case 5:
						currentFilm.darker();
						break;
					case 0:
						System.out.println("Ritorna al menu principale");
						break;
					default:
						System.out.println("Scelta errata");
				}
			
			} while (scelta != 0);
				
		}
		
	}
	
	public static void gestisciImmagine() {
		
		String titolo;
		Immagine currentImm=null;
		int scelta;
		
		do {
			System.out.println("Inserire il titolo dell'immagine su cui si vuole operare");
			titolo = scansione.nextLine();
			
			for(Immagine imm: arrImmagine) {
				if (imm.getTitolo().equals(titolo)) {
					currentImm = imm;
					break;
				}
			}
			
			if (currentImm == null) {
				System.out.println("Titolo NON trovato");
				System.out.println("Si desidera inserire un altro titolo da cercare? Rispondere 1 per si' e 2 per no");
				scelta = scansione.nextInt();
				scansione.nextLine();
				if (scelta != 1)
					break;
			}

		} while (currentImm == null);

		if (currentImm != null) {

			do {
			
				System.out.println("\nDigitare 1 per visualizzare le informazioni dell'immagine\nDigitare 2 per aumentare la luminosita\nDigitare 3 per ridurre la luminosita\nDigitare 0 per tornare al menu principale");
				scelta = scansione.nextInt();
				scansione.nextLine();
				
				switch (scelta) {
				
					case 1:
						currentImm.stampaInfo();
						break;
					case 2:
						currentImm.brighter();
						break;
					case 3:
						currentImm.darker();
						break;
					case 0:
						System.out.println("Ritorna al menu principale");
						break;
					default:
						System.out.println("Scelta errata");
				}
			
			} while (scelta != 0);
				
		}
		
	}
	
}




	/*********************************************************************************************
	
	public static void main(String[] args) {

		
		/* Audio audio1 = new Audio("Prova", 3, 5);
		audio1.run(); // ProvaProvaProva!!!!!
		
		System.out.println("");
		
		Filmato film1 = new Filmato("Test", 3, 2, 4, "Tarantino");
		film1.run(); // TestTest!!!!***
		
		System.out.println("");
		
		Immagine imm1 = new Immagine("ImmagTest", 10);
		imm1.run(); // ImmagTest********** */
		
		
		/* do

   			// MENU CREAZIONE

   			visualizzare il menu che chiedere all'utente di scegliere una tipologia di elemento multimediale (1: audio, 2: filmato, 3: immagine)

   			leggere la scelta dell'utente (int scelta = scanner.nextInt())

   			switch (scelta)
		      case 1: crea istanza audio -> break
		      case 2: crea istanza filmato -> break
		      case 3: crea istanza immagine -> break
		      case 0: scrivi "uscita dal menu creazione" -> break
		      default: scrivi "Scelta errata"
      
			while (scelta diverso da 0) */
	
	/*

		int scelta;
		Audio aud1;
		Filmato film1;
		Immagine img1;
		
		Scanner scansione = new Scanner(System.in);

		do {
			
			System.out.println("\n\nMENU CREAZIONE");
			System.out.println("Digitare 1 per creare un oggetto Audio\nDigitare 2 per creare un oggetto Filmato\nDigitare 3 per creare un oggetto Immagine");
			scelta = scansione.nextInt();
			scansione.nextLine();
			
			switch(scelta) {
				case 1:
					aud1 = creaAudio(scansione);
					aud1.run();
					break;
				case 2:
					film1 = creaFilmato(scansione);
					film1.run();
					break;
				case 3:
					img1 = creaImmagine(scansione);
					img1.run();
					break;
				case 0:
					System.out.println("Uscita dal menu creazione");
					break;
				default:
					System.out.println("Scelta errata");
			}
			
		} while (scelta != 0);
		
		scansione.close();

	}

	
	public static Audio creaAudio(Scanner s) {
		// CHIEDO ALL'UTENTE titolo, durata, volume E CREO L'OGGETTO AUDIO
		String titolo;
		int durata, volume;
		System.out.println("Inserire il titolo dell'audio");
		titolo = s.nextLine();
		System.out.println("Inserire la durata dell'audio");
		durata = s.nextInt();
		s.nextLine();
		System.out.println("Inserire il volume dell'audio");
		volume = s.nextInt();
		s.nextLine();
		Audio audio1 = new Audio(titolo, durata, volume);
		return audio1;
	}
	
	
	public static Filmato creaFilmato(Scanner s) {
		// CHIEDO ALL'UTENTE titolo, luminosità, durata, volume, regista E CREO L'OGGETTO FILMATO
		String titolo, regista;
		int luminosita, durata, volume;
		System.out.println("Inserire il titolo del filmato");
		titolo = s.nextLine();
		System.out.println("Inserire la luminosità dell'audio");
		luminosita = s.nextInt();
		s.nextLine();
		System.out.println("Inserire la durata del filmato");
		durata = s.nextInt();
		s.nextLine();
		System.out.println("Inserire il volume del filmato");
		volume = s.nextInt();
		s.nextLine();
		System.out.println("Inserire il regista del filmato");
		regista = s.nextLine();
		Filmato film1 = new Filmato(titolo, luminosita, durata, volume, regista);
		return film1;
	}
	
	
	public static Immagine creaImmagine(Scanner s) {
		// CHIEDO ALL'UTENTE titolo, luminosità E CREO L'OGGETTO IMMAGINE
		String titolo;
		int luminosita;
		System.out.println("Inserire il titolo del filmato");
		titolo = s.nextLine();
		System.out.println("Inserire la luminosità dell'audio");
		luminosita = s.nextInt();
		s.nextLine();
		Immagine imm1 = new Immagine(titolo, luminosita);
		return imm1;
	}
	
	********************************************************************************************/

