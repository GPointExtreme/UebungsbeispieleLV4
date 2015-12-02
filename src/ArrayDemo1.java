
public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Array1 = {3, 4, 5};
		int [] Array2 = {7, 1, 3};
				
		for(int i = 0; i < 3; i++) {
			int Addition = Array1[i] + Array2[i];
			System.out.println(Addition);
			int Multiplikation = Array1[i] * Array2[i];
			System.out.println(Multiplikation);
		}
		
	}

}
