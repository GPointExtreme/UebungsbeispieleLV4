import java.security.Principal;

public class Gehaltskonto {
	
	private String Inhaber;
	private String IBAN;
	private String BIC;
	private double Kontostand;
	
	//Warum kommen in die Klammer "String Inhaber"? Wo sollen IBAN und BIC verwendet werden?
	public void setInhaber(String Inhaber) {
		this.Inhaber = Inhaber;
		this.IBAN = IBAN; //Fragen ob das hier so stimmt
		this.BIC = BIC; //und ob diese überhaupt verwendet werden sollen
		Kontostand = 0;
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
	
	public double getKontostand () {
		return Kontostand;
	}

}
