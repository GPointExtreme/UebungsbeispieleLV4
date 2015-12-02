public class ArrayDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int ergebnis = 0;
		
		
		
		for(int i = 0; i < Array1.length; i++) {
			int newergebnis = ergebnis + Array1[i];
			ergebnis = newergebnis;
		}
		
		System.out.println(ergebnis);

		}
		
	}



