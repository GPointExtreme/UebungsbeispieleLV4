
public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] Monate = {"Jaenner [1]", "Feburar [2]", "Maerz [3]", "April [4]", 
				"Mai [5]", "Juni [6]", "Juli [7]", "August [8]", "September [9]",
				"Oktober [10]", "November [11]", "Dezember [12]"};
		
		int anzahlMonate = Monate.length;
		
		for (int i = 0; i < Monate.length; i++) {
			System.out.println(Monate[i]);
		}

	}

}
