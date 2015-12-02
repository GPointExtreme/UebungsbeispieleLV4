
public class Gemeinde {

	public static void main(String[] args) {
		//Objekte anlegen!
		Grundstueck[] grundstuecke = new Grundstueck[3];
		grundstuecke[0] = new Grundstueck("Max Mustermann", 50, 30);
		grundstuecke[1] = new Grundstueck("Max Deichmann", 30, 20);
		grundstuecke[2] = new Grundstueck("Max Bauchmann", 60, 50);
		
		//Schleife zum Flächen berechnen und verlgeichen ob > 1000.
		for(int i = 0; i < grundstuecke.length; i++)
			if(grundstuecke[i].getFlaeche() > 1000) {
				System.out.println(grundstuecke[i].getInhaber());
			}
		
		}

	}
