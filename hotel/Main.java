package hotel;
import java.util.Scanner;

import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner (System.in);
		ArrayList<Prenotazione> Thotel=new ArrayList<>();
		ArrayList<Prenotazione> HolidayInn=new ArrayList<>();
		ArrayList<Prenotazione> PalazzoDoglio=new ArrayList<>();
		String nom,data;
		int num,scelta,scelta2,hotel;
		boolean esegui=true;
		System.out.println("Benvenuti nella gestione per la prenotazione degli Hotel");
		while(esegui) {
		System.out.println("Menu:\nPremi:\n1 per inserire una nuova prenotazione,\n2 per visualizzare tutte le prenotazioni, \n3 per visualizzare le informazione di un Hotel specifico,\n4 per eliminare una prenotazione ,\n5 per uscire dal programma.");	
			scelta=scanner.nextInt();
			scanner.nextLine();
			switch(scelta) {
			case 1:
				System.out.println("Inserisci :\n1 per aggiungere una prenotazione al THotel,\n2 per aggiungere una prenotazione all'HolidayInn,\n3 per aggiungere una prenotazione al Palazzo Doglio. ");
				scelta2=scanner.nextInt();
				scanner.nextLine();
				if(scelta2>=1 && scelta2<=3)
				{
					System.out.println("Inserisci il tuo nome e cognome:");
					nom=scanner.nextLine();
					System.out.println("Inserisci la data di inizio prenotazione:");
					data=scanner.nextLine();
					System.out.println("Inserisci il numero di notti del soggiorno:");
					num=scanner.nextInt();
					scanner.nextLine();
					if(scelta2==1) {
						int a=1;
						Thotel.add(new Prenotazione("TH"+a++,"THotel",nom,data,num));
						System.out.println("Prenotazione al THotel aggiunta con successo");
					}
					else if(scelta2==2) {
						int b=1;
						HolidayInn.add(new Prenotazione("HOL"+b++,"HolidayInn",nom,data,num));
						System.out.println("Prenotazione all'HolidayInn aggiunta con successo");
					}
					else if(scelta2==3) {
						int c=1;
						PalazzoDoglio.add(new Prenotazione("DOG"+c++,"PalazzoDoglio",nom,data,num));
						System.out.println("Prenotazione al Palazzo Doglio aggiunta con successo");
					}
						
				}
				else{
					System.out.println("Scelta non valida! ritorno al Menu Principale.");
				}
				break;
			case 2:
				System.out.println("Visualizzazione tutte le prenotazioni:");
				if(Thotel.isEmpty()&&HolidayInn.isEmpty()&&PalazzoDoglio.isEmpty()) {
					System.out.println("Nessuna Prenotazione esistente.");
					}
				else {
					int i=1;
					for(Prenotazione p:Thotel) {
						System.out.println("n."+i++ + " - " +p.toString());
					}
					for(Prenotazione p:HolidayInn) {
						System.out.println("n."+i++ + " - " +p.toString());
					}
					for(Prenotazione p:PalazzoDoglio) {
						System.out.println("n."+i++ + " - " +p.toString());
					}
				}
				break;
			case 3:
				System.out.println("Le prenotazioni di quale Hotel vuoi visualizzare?\nPremi :\n1 per THotel,\n2 per HolidayInn,\n3 per Palazzo Doglio. ");
				hotel=scanner.nextInt();
				scanner.nextLine();
					switch(hotel) {
					case 1:
						if(Thotel.isEmpty()) {
						System.out.println("Nessuna Prenotazione al THotel");
						}
						else {
							int i=1;
							for(Prenotazione p:Thotel) {
							System.out.println("n."+i++ + " - "+ p.toString());
							}
				
						}

						break;
					case 2:
						if(HolidayInn.isEmpty()) {
							System.out.println("Nessuna Prenotazione all'HolidayInn");
						}
						else {
							int i=1;
							for(Prenotazione p:HolidayInn) {
							System.out.println("n."+i++ + " - "+ p.toString());
							}
							
						}
						break;
					case 3:
						if(PalazzoDoglio.isEmpty()) {
							System.out.println("Nessuna Prenotazione al Palazzo Doglio");
						}
						else {
							int i=1;
							for(Prenotazione p:PalazzoDoglio) {
							System.out.println("n."+i++ + " - "+ p.toString());
							}
							
						}
						break;
					default:
						System.out.println("Scelta non valida!\nRitorno al Menu Principale");
						break;
						
					}

				break;
			case 4:
				 System.out.println("Cancellazione Veicolo");
			        System.out.println("Scegli da quale struttura eliminare la prenotazione : ");
			        System.out.println("1. THotel");
			        System.out.println("2. HolidayInn");
			        System.out.println("3. Palazzo Doglio");

			        int tipoEliminazione = scanner.nextInt();
			        scanner.nextLine(); 

			        switch (tipoEliminazione) {
			            case 1: 
			                if (Thotel.isEmpty()) {
			                    System.out.println("Nessuna prenotazione presente.");
			                } else {
			                    System.out.println("Seleziona la prenotazione da eliminare:");
			                    int i = 1;
			                    for (Prenotazione p : Thotel) {
			                        System.out.println(i++ + ". " + p.toString());
			                    }
			                    int sceltaElimina = scanner.nextInt();
			                    scanner.nextLine(); 
			                    if (sceltaElimina > 0 && sceltaElimina <= Thotel.size()) {
			                        Thotel.remove(sceltaElimina - 1);
			                        System.out.println("Prenotazione eliminata con successo.");
			                    } else {
			                        System.out.println("Scelta non valida.");
			                    }
			                }
			                break;

			            case 2: 
			                if (HolidayInn.isEmpty()) {
			                    System.out.println("Nessuna prenotazione presente.");
			                } else {
			                    System.out.println("Seleziona la prenotazione da eliminare:");
			                    int i = 1;
			                    for (Prenotazione p : HolidayInn) {
			                        System.out.println(i++ + ". " + p.toString());
			                    }
			                    int sceltaElimina = scanner.nextInt();
			                    scanner.nextLine();
			                    if (sceltaElimina > 0 && sceltaElimina <= HolidayInn.size()) {
			                        HolidayInn.remove(sceltaElimina - 1);
			                        System.out.println("Prenotazione eliminata con successo.");
			                    } else {
			                        System.out.println("Scelta non valida.");
			                    }
			                }
			                break;

			            case 3: 
			                if (PalazzoDoglio.isEmpty()) {
			                    System.out.println("Nessuna prenotazione presente.");
			                } else {
			                    System.out.println("Seleziona la prenotazione da eliminare:");
			                    int i = 1;
			                    for (Prenotazione p : PalazzoDoglio) {
			                        System.out.println(i++ + ". " + p.toString());
			                    }
			                    int sceltaElimina = scanner.nextInt();
			                    scanner.nextLine(); 
			                    if (sceltaElimina > 0 && sceltaElimina <= PalazzoDoglio.size()) {
			                        PalazzoDoglio.remove(sceltaElimina - 1);
			                        System.out.println("Prenotazione eliminata con successo.");
			                    } else {
			                        System.out.println("Scelta non valida.");
			                    }
			                }
			                break;

			            default:
			                System.out.println("Scelta non valida. Nessun veicolo eliminato.");
			                break;
			        }
				break;
			case 5:
				System.out.println("Uscita dal programma. . . ");
				esegui=false;
				break;
							default:
				System.out.println("Scelta non valida");
				break;
			
			}
		}
		

	scanner.close();
	}

}
