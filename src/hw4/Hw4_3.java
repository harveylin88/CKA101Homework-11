package hw4;

import java.util.Scanner;

public class Hw4_3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("請輸入年月日");
		int sc1 = sc.nextInt();
		int sc2 = sc.nextInt();
		int sc3 = sc.nextInt();
		int [] a= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if((sc1 %4==0 && sc1%100!=0) || sc1%400==0) {
			a[2]=29;}
		
		if(sc2<=0||sc2>12) {
			System.out.print("輸入錯誤,月份請輸入1-12");
			return;
		}
		if(sc3<=0||sc3>a[sc2]) {
			System.out.print("日期輸入錯誤");
			return;
	}
			
		int sum = 0;
		for(int i=0;i<sc2;i++) {
			sum=sum+a[i];
		}
		sum=sum+sc3;
		System.out.println("今天是"+sc1+"年"+sc2+"月"+sc3+"日,輸入的日期是今年第"+sum+"天");
	}
}
