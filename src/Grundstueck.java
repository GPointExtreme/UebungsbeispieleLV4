
public class Grundstueck {
	
	private String Inhaber;
	private int Laenge;
	private int Breite;
	
	//Konstruktor muss immer gleich heißen wie die class! Denke ich^
	public Grundstueck(String Inhaber, int Laenge, int Breite) {
		this.Inhaber = Inhaber;
		this.Laenge = Laenge;
		this.Breite = Breite;
	}
	
	//Methode für Flaechenberechnung!
	public int getFlaeche() {
		return Laenge * Breite;
	}
	
	//Getter und Setter für die privaten Attribute!
	public String getInhaber() {
		return Inhaber;
	}

	public void setInhaber(String inhaber) {
		Inhaber = inhaber;
	}

	public int getLaenge() {
		return Laenge;
	}

	public void setLaenge(int laenge) {
		Laenge = laenge;
	}

	public int getBreite() {
		return Breite;
	}

	public void setBreite(int breite) {
		Breite = breite;
	}
	//Ende der Getter und Setter für die privaten Attribute!

}
