package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		int x,y;
		Scanner sc=new Scanner(System.in);
		Calculator c=new Calculator();
		try {
			System.out.println("請輸入x的值");
			x=sc.nextInt();
			System.out.println("請輸入Y的值");
			y=sc.nextInt();
			int res=c.powerXY(x, y);
			System.out.println(x+"的"+y+"次方等於"+res);
		}catch(CalException e){
			System.out.println(e.getMessage());
		}catch(InputMismatchException ime) {
			System.out.println("輸入格式不正確");
		}
		
		
		
		
		
		
		
		

	}
}
