
public class Hw2_3 {
	public static void main(String[] args) {
		int i = 6; 
        for (int j = 0; j < i; j++) {
            char a = (char) ('A' + j);
            
            for (int k = 0; k <= j; k++) {
                System.out.print(a);
            }
            System.out.println();
        }
		
		
		
	}
}
