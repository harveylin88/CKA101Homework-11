
public class Hw2_2 {
	public static void main(String[] args) {
	int i;
	int count=0;
	for(i=1;i<=49;i++) {
		if(i%10!=4 && i/10!=4) {
			System.out.print(i+" ");
			count++;
		}
	}
	System.out.print("\n總共有"+count+"個");
	System.out.println();
	for(int j=10;j>=0;j--) {
		for(int k=1;k<=j;k++) {
			System.out.print(k);
		}
		System.out.println();
	}
	
	}
}
