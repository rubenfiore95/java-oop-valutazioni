package jana60.valutazioni;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		                           //ID-ASSENZE-MEDIA
		Studente Armando = new Studente(0, 54, 2);
		Studente Luca = new Studente(1, 34, 3);
		Studente Gabriele = new Studente(2, 12, 3);
		Studente Vincenzo = new Studente(3, 12, 1);
		Studente Riccardo = new Studente(4, 12, 4);
		Studente Giuseppe = new Studente(5, 12, 4);
		
		Studente lista[] = {Armando, Luca, Gabriele, Vincenzo, Riccardo, Giuseppe}; 
		
		int counter = 0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i].bocciatura() == false) {
				counter += 1;
			}
			System.out.println(lista[i].riga() + lista[i].esito());			
		}
		System.out.println("Totale promossi: "+counter);
	}

}
