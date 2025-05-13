package veicolo;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
	Scanner scan= new Scanner (System.in);
	ArrayList<Veicolo> arrAuto= new ArrayList<>();
	ArrayList<Veicolo> arrMoto=new ArrayList<>();
	ArrayList<Veicolo> arrFurgone=new ArrayList<>();
	int scelta,anno,tipo,scelta2;
	String colore, marca, modello;
	double prezzo;
	
	
	arrAuto.add(new Auto("Ford","Fiesta","Blu",2018,10000));
	
	boolean esegui=true;
	System.out.println("\nBenvenuto in questo Garage.");
	while(esegui) {
		System.out.println("Premi: \n1 per aggiungere un nuovo Veicolo,\n2 per visualizzare i Veicoli presenti nel Garage,\n3 per modificare il prezzo di un veicolo,\n4 per cancellare un Veicolo del Garage\n5 per uscire dal Garage.");
		scelta=scan.nextInt();
		scan.nextLine();
		
    switch(scelta) {
    case 1:
    	System.out.println("Aggiunta nuovo Veicolo.\nPremi per aggiungere: \n1 Auto\n2 Moto\n3 Furgone");
    	tipo=scan.nextInt();
    	scan.nextLine();
    	if (tipo >= 1 && tipo <= 3) {
    	System.out.println("Marca : ");
    	marca=scan.nextLine();
       	System.out.println("Modello : ");
    	modello=scan.nextLine();
    	System.out.println("Colore : ");
    	colore=scan.nextLine();
    	System.out.println("Anno : ");
    	anno=scan.nextInt();
    	scan.nextLine();
    	System.out.println("Prezzo : ");
    	prezzo=scan.nextDouble();
    	scan.nextLine();
    	
    	if(tipo==1) {
    		arrAuto.add(new Auto(marca,modello,colore,anno,prezzo));
    		System.out.println("Nuova auto aggiunta.");
    	}
    	else if(tipo==2) {
    		arrMoto.add(new Moto(marca,modello,colore,anno,prezzo));
    		System.out.println("Nuova moto aggiunta.");
    	}
    	else if(tipo==3) {
    		arrFurgone.add(new Furgone(marca,modello,colore,anno,prezzo));
    		System.out.println("Nuovo furgone aggiunto.");
    	}
    	}
    	else {
    	System.out.println("Scelta non valida! Nessun Veicolo aggiunto!");
    	}
    	
    	break;
    case 2:
      	System.out.println("Visualizzare Veicoli presenti nel Garage.\nPremi per Visualizzare: \n1 Auto presenti\n2 Moto presenti\n3 Furgoni presenti\n4 Tutti i veicoli presenti");
      	scelta2=scan.nextInt();
    	scan.nextLine();
    	switch(scelta2) {
        case 1:
        	System.out.println("Auto : ");
        	if(arrAuto.isEmpty()) {
        		System.out.println("Nessuna Auto presente nel Garage.");
        	}
        	else {
        		int i=1;
    			for(Veicolo v:arrAuto) {
    				System.out.println("n." + i++ + " - " + v.toString());
    			}
        	}
        	break;
        case 2:
        	System.out.println("Moto : ");
        	if(arrMoto.isEmpty()) {
        		System.out.println("Nessuna Moto presente nel Garage.");
        	}
        	else {
        		int i=1;
        		for(Veicolo v:arrMoto){
        			System.out.println("n."+ i++ + " - " + v.toString());
        		}
        	}
        	break;
        case 3:
        	System.out.println("Furgoni : ");
          	if(arrFurgone.isEmpty()) {
        		System.out.println("Nessun Furgone presente nel Garage.");
        	}
        	else {
        		int i=1;
        		for(Veicolo v:arrFurgone){
        			System.out.println("n."+ i++ + " - " + v.toString());
        		}
        	}
        	break;
        case 4:
        	if (arrAuto.isEmpty() && arrMoto.isEmpty() && arrFurgone.isEmpty()) {
        	    System.out.println("Tutte le collezioni sono vuote.");
        	}
        	else {
        		System.out.println("Tutti i Veicoli presenti nel Garage:");
        		System.out.println("Auto:");
        		if(arrAuto.isEmpty()) {
            		System.out.println("Nessuna Auto presente nel Garage.");
            	}
            	else {
            		int i=1;
        			for(Veicolo v:arrAuto) {
        				System.out.println("n." + i++ + " - " + v.toString());
        			}
            	}
        		System.out.println("Moto:");
        		if(arrMoto.isEmpty()) {
            		System.out.println("Nessuna Moto presente nel Garage.");
            	}
            	else {
            		int i=1;
            		for(Veicolo v:arrMoto){
            			System.out.println("n."+ i++ + " - " + v.toString());
            		}
            	}
        		System.out.println("Furgoni:");
        		if(arrFurgone.isEmpty()) {
            		System.out.println("Nessun Furgone presente nel Garage.");
            	}
            	else {
            		int i=1;
            		for(Veicolo v:arrFurgone){
            			System.out.println("n."+ i++ + " - " + v.toString());
            		}
            		}
            	
        		
        	}
        	break;
        default:
            System.out.println("Scelta non valida.");
            break;
    	}
    	break;
    case 3:
    	System.out.println("Hai scelto: Modificare il prezzo di un veicolo");
        System.out.println("Scegli il tipo di veicolo per cui vuoi modificare il prezzo:");
        System.out.println("1. Auto");
        System.out.println("2. Moto");
        System.out.println("3. Furgone");
   
       
        int modifica = scan.nextInt();
        scan.nextLine();
        switch (modifica) {
        case 1:
        	{
        		if(arrAuto.isEmpty()) {
        			System.out.println("Nessuna Auto presente.");
        		}
        		else{
        		System.out.println("Digitare: \n");
        	int i=1;
        	for(Veicolo v:arrAuto) {
        		System.out.println(i++ + " " + v.toString());
        		}
        	scelta=scan.nextInt();
        	scan.nextLine();                	
        	Veicolo v = arrAuto.get(scelta-1); //perche nell'array sarebbe -1
        	
        	System.out.println("Inserire il nuovo prezzo");
        	prezzo=scan.nextDouble();
        	scan.nextLine();
        	v.setPrezzo(prezzo);
        	System.out.println(v.toString());}
        	}
        	
        	break;
        case 2:
        	{
        		if(arrMoto.isEmpty()) {
        			System.out.println("Nessuna Moto presente.");
        		}
        		else{System.out.println("Digitare: \n");
        	int i=1;
        	for(Veicolo v:arrMoto) {
        		System.out.println(i++ + " " + v.toString());
        		}
        	scelta=scan.nextInt();
        	scan.nextLine();                	
        	Veicolo v = arrMoto.get(scelta-1); //perche nell'array sarebbe -1
        	
        	System.out.println("Inserire il nuovo prezzo");
        	prezzo=scan.nextDouble();
        	scan.nextLine();
        	v.setPrezzo(prezzo);
        	System.out.println(v.toString());}
        	}
        	break;
        case 3:
        	{
        		if(arrFurgone.isEmpty()) {
        			System.out.println("Nessun Furgone presente.");
        		}
        		else{System.out.println("Digitare: \n");
        	int i=1;
        	for(Veicolo v:arrFurgone) {
        		System.out.println(i++ + " " + v.toString());
        		}
        	scelta=scan.nextInt();
        	scan.nextLine();                	
        	Veicolo v = arrFurgone.get(scelta-1); //perche nell'array sarebbe -1
        	
        	System.out.println("Inserire il nuovo prezzo");
        	prezzo=scan.nextDouble();
        	scan.nextLine();
        	v.setPrezzo(prezzo);
        	System.out.println(v.toString());}
        	break;
        	}
        }
    	break;
    case 4:
        System.out.println("Cancellazione Veicolo");
        System.out.println("Scegli il tipo di veicolo da eliminare:");
        System.out.println("1. Auto");
        System.out.println("2. Moto");
        System.out.println("3. Furgone");

        int tipoEliminazione = scan.nextInt();
        scan.nextLine(); // Consuma il newline

        switch (tipoEliminazione) {
            case 1: // Elimina un'Auto
                if (arrAuto.isEmpty()) {
                    System.out.println("Nessuna Auto presente nel Garage.");
                } else {
                    System.out.println("Seleziona l'Auto da eliminare:");
                    int i = 1;
                    for (Veicolo v : arrAuto) {
                        System.out.println(i++ + ". " + v.toString());
                    }
                    int sceltaElimina = scan.nextInt();
                    scan.nextLine(); // Consuma il newline
                    if (sceltaElimina > 0 && sceltaElimina <= arrAuto.size()) {
                        arrAuto.remove(sceltaElimina - 1);
                        System.out.println("Auto eliminata con successo.");
                    } else {
                        System.out.println("Scelta non valida.");
                    }
                }
                break;

            case 2: // Elimina una Moto
                if (arrMoto.isEmpty()) {
                    System.out.println("Nessuna Moto presente nel Garage.");
                } else {
                    System.out.println("Seleziona la Moto da eliminare:");
                    int i = 1;
                    for (Veicolo v : arrMoto) {
                        System.out.println(i++ + ". " + v.toString());
                    }
                    int sceltaElimina = scan.nextInt();
                    scan.nextLine(); // Consuma il newline
                    if (sceltaElimina > 0 && sceltaElimina <= arrMoto.size()) {
                        arrMoto.remove(sceltaElimina - 1);
                        System.out.println("Moto eliminata con successo.");
                    } else {
                        System.out.println("Scelta non valida.");
                    }
                }
                break;

            case 3: // Elimina un Furgone
                if (arrFurgone.isEmpty()) {
                    System.out.println("Nessun Furgone presente nel Garage.");
                } else {
                    System.out.println("Seleziona il Furgone da eliminare:");
                    int i = 1;
                    for (Veicolo v : arrFurgone) {
                        System.out.println(i++ + ". " + v.toString());
                    }
                    int sceltaElimina = scan.nextInt();
                    scan.nextLine(); 
                    if (sceltaElimina > 0 && sceltaElimina <= arrFurgone.size()) {
                        arrFurgone.remove(sceltaElimina - 1);
                        System.out.println("Furgone eliminato con successo.");
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
    	System.out.println("Uscita dal programma.");
    	esegui=false;
    	break;
    	
	default:
        System.out.println("Scelta non valida.");
        break;
	}
	}
	
	
	scan.close();
}	
}

