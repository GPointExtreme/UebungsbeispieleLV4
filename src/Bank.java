
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gehaltskonto MaxMustermann = new Gehaltskonto();
		Gehaltskonto HansMeier = new Gehaltskonto();
		Gehaltskonto OttoNormalverbraucher = new Gehaltskonto();
		
		// Warum muss das gemacht werden?
		MaxMustermann.setInhaber("MaxMustermann");
		HansMeier.setInhaber("HansMeier");
		OttoNormalverbraucher.setInhaber("OttoNormalverbraucher");
		
		MaxMustermann.aufbuchen(1000);
		System.out.println("Max Mustermann Kontostand: " + MaxMustermann.getKontostand());
		MaxMustermann.abbuchen(500);
		System.out.println("Max Mustermann Kontostand: " + MaxMustermann.getKontostand());
		MaxMustermann.aufbuchen(1000);
		System.out.println("Max Mustermann Kontostand: " + MaxMustermann.getKontostand());

		HansMeier.aufbuchen(1000);
		System.out.println("Hans Meier Kontostand: " + HansMeier.getKontostand());
		HansMeier.abbuchen(500);
		System.out.println("Hans Meier Kontostand: " + HansMeier.getKontostand());
		HansMeier.abbuchen(1000);
		System.out.println("Hans Meier Kontostand: " + HansMeier.getKontostand());
		
	}

}
