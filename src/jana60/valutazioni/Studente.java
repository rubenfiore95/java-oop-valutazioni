package jana60.valutazioni;



public class Studente {
	

		int id,assenze, media;

		public Studente(int id,int assenze,int media) {
			
			this.id= id;
			this.assenze = assenze;
			this.media = media;
			
			
		    }
			
		//METODO

		public boolean bocciatura() {
			if (assenze > 50) {
			return true;	
			}
			if (assenze >= 25 && assenze <= 50 && media > 2) {
				return false;	
				}
			if (!(assenze < 25 && media >= 2)) {
				return true;	
			}
			
			return false;
			
		}
		
		public String esito() {
			if (bocciatura()) {
			return "Bocciato";
			} else {
			return "Promosso";
			}
			
			
		}

		
		
		
		public String riga() {
			return "ID: " +id+ " Assenze: " +assenze+"% "+" Media: " +media+ " Esito: ";
			
			
		}

}	


