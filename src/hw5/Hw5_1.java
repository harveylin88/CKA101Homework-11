package hw5;

import java.util.Scanner;

public class Hw5_1 {
	public static void starSquare(int width,int height) {
		for (int i=0;i<height;i++) {
			for(int j=0;j<width;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("請輸入寬與高");
		int w=sc.nextInt();
		int h=sc.nextInt();
		starSquare(w,h);
		
		
	}
	
}
