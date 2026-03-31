import java.util.Scanner;

public class Hw3_1 {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		int sum=a+b+c;
		int max =Math.max(a, Math.max(b, c));
		int min =Math.min(a, Math.min(b, c));
		int mid =sum-max-min;
		if (a==b&&b==c) {
			if (a==0) 
				System.out.println("不是三角形");
			else
				System.out.println("正三角形");
			}
		else if (max>mid+min){
			System.out.println("不是三角形");
		}
		else if(a==b||b==c||c==a) {
			System.out.println("等腰三角形");
		}
		else {
			System.out.println("其他三角形");
			
		}
		System.out.println(a+" "+b+" "+ c);
	}
}
