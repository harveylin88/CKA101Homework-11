package hw5;

public class Hw5_2 {
	public static void randAvg() {
		int []a=new int[10];
		int sum=0;
		String b;
		double avg;
		System.out.println("本次亂數結果");
		for(int k=0;k<a.length;k++) {
			a[k] = (int) (Math.random() * 100) + 1;
			sum=sum+a[k];
			System.out.print(a[k]+" ");
		}
		avg=sum/a.length;
		System.out.println("");
		System.out.println("平均為"+avg);
	}
	public static void main(String[] args) {
		randAvg();
	}
}
