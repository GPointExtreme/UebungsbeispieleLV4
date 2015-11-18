import java.security.Principal;

public class Gehaltskonto {
	
	private String Inhaber;
	private String IBAN;
	private String BIC;
	private double Kontostand;
	
	public Gehaltskonto(String Inhaber, String IBAN, String BIC) {
		this.Inhaber = Inhaber;
		Kontostand = 0;
	}
	
	//Warum kommen in die Klammer "String Inhaber"?
	public void setInhaber(String Inhaber) {
		this.Inhaber = Inhaber;
	}
	
	//Getter Setter Methode
	public void setIBAN(String IBAN) {
		this.IBAN = IBAN;
	}
	
	//Getter Setter Methode
	public void setBIC(String BIC) {
		this.BIC = BIC;
	}
	
	public void aufbuchen (double wert) {
		Kontostand += wert;
	}
	
	public void abbuchen (double wert) {
		if (Kontostand >= wert) {
			Kontostand -= wert;
		}
		else {
			System.out.println("Wert ist zu hoch!");
		}
	}
	
	//Getter Methode für Kontostand
	public double getKontostand () {
		return Kontostand;
	}

}
