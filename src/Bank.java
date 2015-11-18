
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gehaltskonto MaxMustermann = new Gehaltskonto("Max Mustermann", 1111, 2222);
		Gehaltskonto HansMeier = new Gehaltskonto("Hans Meier", 3333, 4444);
		Gehaltskonto OttoNormalverbraucher = new Gehaltskonto("Otto Normalverbraucher", 5555, 6666);
		
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
